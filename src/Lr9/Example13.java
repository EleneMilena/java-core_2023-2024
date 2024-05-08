package Lr9;
public class Example13 {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class SinglyLinkedList {
        private Node head;
        // ввод с головы
        public void createHead(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        // ввод с хвоста
        public void createTail(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        // вывод
        public String toString() {
            StringBuilder result = new StringBuilder();
            Node current = head;
            while (current != null) {
                result.append(current.data).append(" ");
                current = current.next;
            }
            return result.toString();
        }
        // добавление элемента в начало списка
        public void addFirst(int data) {
            createHead(data);
        }
        // добавление элемента в конец списка
        public void addLast(int data) {
            createTail(data);
        }
        // вставка элемента в список с указанным номером
        public void insert(int data, int position) {
            if (position < 0) {
                throw new IllegalArgumentException("Некорректная позиция");
            }
            if (position == 0) {
                createHead(data);
                return;
            }
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                if (current == null) {
                    throw new IndexOutOfBoundsException("Позиция выходит за пределы списка");
                }
                current = current.next;
            }
            if (current == null) {
                throw new IndexOutOfBoundsException("Позиция выходит за пределы списка");
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        // удаление элемента с головы списка
        public void removeFirst() {
            if (head != null) {
                head = head.next;
            }
        }
        // удаление последнего элемента списка
        public void removeLast() {
            if (head == null) {
                return;
            }
            if (head.next == null) {
                head = null;
                return;
            }
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        // удаление из списка элемента с указанным номером
        public void remove(int position) {
            if (position < 0) {
                throw new IllegalArgumentException("Некорректная позиция");
            }
            if (position == 0) {
                removeFirst();
                return;
            }
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                if (current == null || current.next == null) {
                    throw new IndexOutOfBoundsException("Позиция выходит за пределы списка");
                }
                current = current.next;
            }
            if (current == null || current.next == null) {
                throw new IndexOutOfBoundsException("Позиция выходит за пределы списка");
            }
            current.next = current.next.next;
        }
        public static void main(String[] args) {
            SinglyLinkedList linkedList = new SinglyLinkedList();
            linkedList.createHead(3);
            linkedList.createTail(5);
            linkedList.addFirst(1);
            linkedList.addLast(7);
            linkedList.insert(4, 2);
            System.out.println("Исходный список: " + linkedList.toString());
            linkedList.removeFirst();
            System.out.println("После удаления с головы: " + linkedList.toString());
            linkedList.removeLast();
            System.out.println("После удаления с хвоста: " + linkedList.toString());
            linkedList.remove(2);
            System.out.println("После удаления по индексу 2: " + linkedList.toString());
        }
    }
}
