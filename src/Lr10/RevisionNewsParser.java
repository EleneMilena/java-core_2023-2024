package Lr10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class RevisionNewsParser {
    public static void main(String[] args) {
        try {
            // Получаем HTML-код страницы
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            // Извлекаем список новостей
            Elements newsParent = doc.select("body > table > tbody > tr > td >" +
                    " div > table > tbody > tr:nth-child(5) > td:nth-child(3) > " +
                    "table > tbody > tr > td:nth-child(1)");

            // Проверяем наличие новостей
            if (!newsParent.isEmpty()) {
                // Создаем новый XML-документ
                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                org.w3c.dom.Document xmlDocument = docBuilder.newDocument();
                org.w3c.dom.Element rootElement = xmlDocument.createElement("news");
                xmlDocument.appendChild(rootElement);

                // Выводим последние 10 новостей
                for (int i = 3; i < 20; i++) {
                    if (i % 2 != 0) {
                        List<Node> nodes = newsParent.get(0).childNodes();
                        String title = ((Element) nodes.get(i)).getElementsByClass("blocktitle").
                                get(0).childNodes().get(0).toString();
                        String date = ((Element) nodes.get(i)).getElementsByClass("blockdate").
                                get(0).childNodes().get(0).toString();

                        // Создаем элементы новости и добавляем их в XML-документ
                        org.w3c.dom.Element newsElement = xmlDocument.createElement("newsItem");
                        org.w3c.dom.Element titleElement = xmlDocument.createElement("title");
                        titleElement.appendChild(xmlDocument.createTextNode(title));
                        org.w3c.dom.Element dateElement = xmlDocument.createElement("date");
                        dateElement.appendChild(xmlDocument.createTextNode(date));

                        newsElement.appendChild(titleElement);
                        newsElement.appendChild(dateElement);
                        rootElement.appendChild(newsElement);
                    }
                }

                // Записываем XML-документ в файл
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(xmlDocument);
                StreamResult result = new StreamResult(new File("src/Lr10/news.xml"));
                transformer.transform(source, result);

                System.out.println("Данные успешно записаны в XML файл.");
            } else {
                System.out.println("Новости не найдены.");
            }
        } catch (IOException | ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}
