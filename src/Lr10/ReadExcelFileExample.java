package Lr10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFileExample {
    public static void main(String[] args) throws IOException {
        // Открываем файл Excel для чтения
        String filePath = "example-xlsx.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        // Создаем экземпляр книги Excel из файла
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        // Получаем лист из книги по его индексу или другим методом
        XSSFSheet sheet = workbook.getSheetAt(0); // Предполагаем, что лист с индексом 0

        // Перебираем строки и ячейки листа
        for (Row row : sheet) {
            for (Cell cell : row) {
                // Выдаем значение ячейки на экран
                System.out.print(cell.toString() + "\t");
            }
            System.out.println(); // Переход на новую строку после каждой строки
        }

        // Закрываем файл и освобаждаем ресурсы
        workbook.close();
        inputStream.close();
    }
}
