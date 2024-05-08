package Lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.Scanner;

public class RevisionJsonCreator {
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

        // Добавляем новую книгу в массив
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название новой книги:");
        String newTitle = scanner.nextLine();

        System.out.println("Введите автора новой книги:");
        String newAuthor = scanner.nextLine();

        System.out.println("Введите год издания новой книги:");
        String newYear = scanner.nextLine();

        JSONObject newBook = new JSONObject();
        newBook.put("title", newTitle);
        newBook.put("author", newAuthor);
        newBook.put("year", newYear);

        books.add(newBook);

        // Добавляем массив книг в корневой объект
        root.put("books", books);

        // Выводим JSON
        System.out.println(root.toJSONString());

        // Выводим фразу "Книга успешно добавлена"
        System.out.println("Книга успешно добавлена");
    }
}
