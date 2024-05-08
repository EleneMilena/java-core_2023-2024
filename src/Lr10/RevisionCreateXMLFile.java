package Lr10;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class RevisionCreateXMLFile {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Загрузка существующего XML-файла или создание нового, если его нет
            File file = new File("src/Lr10/Book.xml");
            Document doc;
            Element rootElement;

            if (file.exists()) {
                doc = docBuilder.parse(file);
                rootElement = doc.getDocumentElement();
            } else {
                doc = docBuilder.newDocument();
                rootElement = doc.createElement("library");
                doc.appendChild(rootElement);
            }

            // Запрос данных о новой книге от пользователя
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название новой книги:");
            String title = scanner.nextLine();

            System.out.println("Введите автора новой книги:");
            String author = scanner.nextLine();

            System.out.println("Введите год издания новой книги:");
            String year = scanner.nextLine();

            // Создание элемента <book> для новой книги и добавление его в XML-структуру
            Element newBook = doc.createElement("book");
            rootElement.appendChild(newBook);

            Element newTitle = doc.createElement("title");
            newTitle.appendChild(doc.createTextNode(title));
            newBook.appendChild(newTitle);

            Element newAuthor = doc.createElement("author");
            newAuthor.appendChild(doc.createTextNode(author));
            newBook.appendChild(newAuthor);

            Element newYear = doc.createElement("year");
            newYear.appendChild(doc.createTextNode(year));
            newBook.appendChild(newYear);

            // Запись обновленной XML-структуры в файл
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);

            System.out.println("Новая книга успешно добавлена в XML-файл");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
