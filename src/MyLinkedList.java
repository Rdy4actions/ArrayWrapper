public class MyLinkedList {
    private Node head; //начало списка
    private Node tail; //конец списка

    public void add(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int get(int position) {
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        return current.value;
    }

    public void set(int value, int position) {

        Node newNode = new Node(value);
        Node current = head;

        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        current.next = newNode;
        while (current != null) {
            current = current.next;
        }
    }


    public void print() {

        Node current = head;

        if (head == null) {
            System.out.println("Список пуст!");
        } else {
            System.out.println("Элементы списка: ");
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
        }
        System.out.println();
    }

    public void print(int position) {
        int value = get(position);
        System.out.printf("Элемент под номером %d:\n %d\n", position, value);
    }


    private static class Node {
        int value; //значение элемента
        Node next; //ссылка на элемент

        public Node(int value) {
            this.value = value;
            next = null;
        }
    }
}
