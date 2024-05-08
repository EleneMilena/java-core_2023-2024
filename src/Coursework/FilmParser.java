package Coursework;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
public class FilmParser {
    public static void main(String[] args) {
        // Ссылка на сайт с фильмами
        String url = "https://tv.rambler.ru/ekaterinburg/category/kino-i-serialy/";
        try {
            // Получаем HTML страницу
            Document document = Jsoup.connect(url).get();
            // Находим все элементы с каналами и фильмами
            Elements channelElements = document.select("div.JAFmDVsF");           // Создаем список для хранения названий каналов и списков фильмов для каждого канала
            List<String> channelNames = new ArrayList<>();
            List<List<String>> filmsForChannels = new ArrayList<>();
            List<List<String>> startTimesForChannels = new ArrayList<>();
            // Итерируемся по всем найденным элементам и извлекаем названия каналов и списки фильмов
            for (Element channelElement : channelElements) {
                // Извлекаем название канала
                String channelName = channelElement.select("a.JjQ7ZgXi").text();
                if (!channelName.isEmpty()) {
                    channelNames.add(channelName);
                    // Извлекаем названия фильмов для данного канала
                    List<String> filmTitles = new ArrayList<>();
                    List<String> startTimes = new ArrayList<>();
                    // Извлекаем строку с названием фильма и временем начала
                    Elements filmElements = channelElement.select("a.uBxda9R7");
                    for (Element filmElement : filmElements) {
                        // Извлекаем название фильма
                        String title = filmElement.select("span.FkSdLHLD").text();
                        // Извлекаем время начала
                        String startTime = filmElement.select("span.Ez6Ch9q2").text();
                        if (!title.isEmpty() && !startTime.isEmpty()) {
                            filmTitles.add(title);
                            startTimes.add(startTime);
                        }
                    }
                    filmsForChannels.add(filmTitles);
                    startTimesForChannels.add(startTimes);
                    // Добавляем список времен начала в список startTimesForChannels
                }
            }
            // Создаем новую книгу Excel
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Фильмы");
            int rowNum = 0;
            // Создаем заголовки столбцов в Excel
            Row headerRow = sheet.createRow(rowNum++);
            headerRow.createCell(0).setCellValue("Название канала");
            headerRow.createCell(1).setCellValue("Время начала");
            headerRow.createCell(2).setCellValue("Название фильма");
            // Записываем названия каналов и списки фильмов в Excel
            for (int i = 0; i < channelNames.size(); i++) {
                String channelName = channelNames.get(i);
                List<String> filmTitles = filmsForChannels.get(i);
                List<String> startTimes = startTimesForChannels.get(i);
                for (int j = 0; j < filmTitles.size(); j++) {
                    Row row = sheet.createRow(rowNum++);
                    row.createCell(0).setCellValue(channelName);
                    row.createCell(1).setCellValue(startTimes.get(j));
                    row.createCell(2).setCellValue(filmTitles.get(j));
                }
            }
            // Записываем книгу Excel в файл
            String excelFilePath = "films.xlsx";
            try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
                workbook.write(outputStream);
            }
            // Закрываем книгу Excel
            workbook.close();
            // Выводим информацию об успешной записи файла
            System.out.println("Данные успешно сохранены в файл " + excelFilePath);
            // Отправляем файл по почте
            sendEmailWithAttachment(excelFilePath);
        } catch (IOException | MessagingException e) {
            e.printStackTrace();
        }
    }
    private static void sendEmailWithAttachment(String filePath) throws MessagingException {
        // Подключаемся к smtp-серверу отправки письма
        String to = "e-valieva@mail.ru"; // Адрес получателя
        String from = "test@aesite.ru"; // Ваш адрес отправителя
        String host = "smtp.beget.com"; // SMTP-сервер
        final String username = "test@aesite.ru"; // Имя пользователя
        final String password = "gFN4#ds1S"; // Пароль
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.port", "25");
        properties.setProperty("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Фильмы");
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Прикреплен файл с фильмами.");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            messageBodyPart = new MimeBodyPart();
            FileDataSource source = new FileDataSource(filePath);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filePath);
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("Письмо успешно отправлено.");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            throw mex;
        }
    }
}
