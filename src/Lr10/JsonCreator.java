package Lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonCreator {
    public static void main(String[] args) {
        // Создаем JSON объект для корневого элемента
        JSONObject root = new JSONObject();
        JSONArray books = new JSONArray();

        // Создаем JSON объекты для каждой книги
        JSONObject book1 = new JSONObject();
        book1.put("title", "Война и мир");
        book1.put("author", "Лев Толстой");
        book1.put("year", "1869");

        JSONObject book2 = new JSONObject();
        book2.put("title", "Мастер и Маргарита");
        book2.put("author", "Михаил Булгаков");
        book2.put("year", "1967");

        // Добавляем книги в массив
        books.add(book1);
        books.add(book2);

        // Добавляем массив книг в корневой объект
        root.put("books", books);

        try (FileWriter file = new FileWriter("src/Lr10/example-json.json")) {
            // Записываем JSON объект в файл
            file.write(root.toJSONString());
            System.out.println("Json-файл успешно создан");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}