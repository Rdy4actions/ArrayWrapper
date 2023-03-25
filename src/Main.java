public class Main {
    public static void main(String[] args) {
        long time = System.nanoTime();
        MyLinkedList newList = new MyLinkedList();
        for (int i = 0; i < 20; i++) {
            newList.add(i);
        }
        newList.set(10,15);
        newList.print();
        newList.print(10);
        time = System.nanoTime() - time;
        System.out.printf("Время выполнения цикла:\n%,9.3f ms\n", time / 1_000_000.0);

    }
}