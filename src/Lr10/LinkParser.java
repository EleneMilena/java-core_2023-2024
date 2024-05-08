package Lr10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class LinkParser {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps/";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");
            for (Element link : links) {
                // Получаем значение атрибута "href" для каждой ссылки
                String href = link.attr("href");
                System.out.println(href);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}