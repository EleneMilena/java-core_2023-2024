package Lr10;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

public class RevisionXmlParser {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/Lr10/Book.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите автора или год издания для поиска:");
            String searchCriteria = scanner.nextLine().trim().toLowerCase();

            NodeList nodeList = doc.getElementsByTagName("book");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String author = element.getElementsByTagName("author").item(0).getTextContent().toLowerCase();
                    String year = element.getElementsByTagName("year").item(0).getTextContent().toLowerCase();

                    // Проверяем соответствие книги введенным критериям поиска
                    if (author.contains(searchCriteria) || year.contains(searchCriteria)) {
                        System.out.println("\nНазвание книги: " + element.getElementsByTagName("title").item(0).getTextContent());
                        System.out.println("Автор: " + author);
                        System.out.println("Год издания: " + year);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
