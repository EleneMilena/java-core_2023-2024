package Lr10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RevisionReadExcelFileExample {
    public static void main(String[] args) {
        String filePath = "example-xlsx.xlsx";
        try {
            readExcelFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Файл " + filePath + " не найден.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода при чтении файла: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла неизвестная ошибка: " + e.getMessage());
        }
    }

    private static void readExcelFile(String filePath) throws IOException {
        FileInputStream inputStream = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        // Предполагаем, что лист с индексом 0
        XSSFSheet sheet = workbook.getSheetAt(0);

        // Перебираем строки и ячейки листа
        for (Row row : sheet) {
            for (Cell cell : row) {
                // Выдаем значение ячейки на экран
                System.out.print(cell.toString() + "\t");
            }
            System.out.println(); // Переход на новую строку после каждой строки
        }

        // Закрываем файл и освобождаем ресурсы
        workbook.close();
        inputStream.close();
    }
}
