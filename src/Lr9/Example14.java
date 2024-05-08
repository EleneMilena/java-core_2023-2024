package Lr9;

public class Example14 {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class SinglyLinkedListF {
        private Node head;

        // ввод с головы
        public static void createHeadRec(SinglyLinkedListF list, int data) {
            list.head = createHeadRecHelper(list.head, data);
        }

        private static Node createHeadRecHelper(Node current, int data) {
            if (current == null) {
                return new Node(data);
            }
            current.next = createHeadRecHelper(current.next, data);
            return current;
        }

        // ввод с хвоста
        public static void createTailRec(SinglyLinkedListF list, int data) {
            list.head = createTailRecHelper(list.head, data);
        }

        private static Node createTailRecHelper(Node current, int data) {
            if (current == null) {
                return new Node(data);
            }
            current.next = createTailRecHelper(current.next, data);
            return current;
        }

        // вывод
        public String toStringRec() {
            return toStringRecHelper(head);
        }

        private String toStringRecHelper(Node current) {
            if (current == null) {
                return "";
            }
            return current.data + " " + toStringRecHelper(current.next);
        }
    }

    public static void main(String[] args) {
        SinglyLinkedListF linkedList = new SinglyLinkedListF();
        // ввод с головы
        SinglyLinkedListF.createHeadRec(linkedList, 3);
        SinglyLinkedListF.createHeadRec(linkedList, 2);
        SinglyLinkedListF.createHeadRec(linkedList, 1);
        System.out.println("Список после ввода с головы: " + linkedList.toStringRec());
        // ввод с хвоста
        SinglyLinkedListF.createTailRec(linkedList, 4);
        SinglyLinkedListF.createTailRec(linkedList, 5);
        SinglyLinkedListF.createTailRec(linkedList, 6);
        System.out.println("Список после ввода с хвоста: " + linkedList.toStringRec());
    }
}
