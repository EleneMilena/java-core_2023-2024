package Lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Scanner;

public class RevisionJsonParser {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/Lr10/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите автора для поиска:");
            String searchAuthor = scanner.nextLine().trim();

            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                String author = (String) book.get("author");
                if (author.equalsIgnoreCase(searchAuthor)) {
                    System.out.println("\nНазвание книги: " + book.get("title"));
                    System.out.println("Автор: " + author);
                    System.out.println("Год издания: " + book.get("year"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
