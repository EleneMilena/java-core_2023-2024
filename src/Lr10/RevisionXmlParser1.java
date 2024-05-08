package Lr10;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class RevisionXmlParser1 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/Lr10/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название книги для удаления:");
            String bookTitleToRemove = scanner.nextLine().trim();

            NodeList nodeList = doc.getElementsByTagName("book");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String title = element.getElementsByTagName("title").item(0).getTextContent();

                    // Проверяем соответствие книги введенному названию
                    if (title.equalsIgnoreCase(bookTitleToRemove)) {
                        System.out.println("Книга найдена и будет удалена: " + title);
                        // Удаляем элемент <book> из XML-структуры
                        node.getParentNode().removeChild(node);
                    }
                }
            }

            // Сохраняем изменения в XML-файле
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/Lr10/example.xml"));
            transformer.transform(source, result);
            System.out.println("Книга успешно удалена из XML-файла.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

