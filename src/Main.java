import arrays.MyArrayList;
import arrays.MyLinkedList;
import arrays.MyQueue;
import arrays.Node;

public class Main {

    private static MyArrayList<String> myArrayList = new MyArrayList<>();

    private static void show() {
        int size = myArrayList.size();
        System.out.println("\nArray size is: " + size);
        for (int i = 0; i < size; i++) System.out.println(myArrayList.get(i));
    }

    public static void main(String[] args) {

        myArrayList.add("1st string");
        myArrayList.add("2nd string");
        myArrayList.add("3rd string");
        myArrayList.add("4th string");
        myArrayList.add("5th string");
        show();
        myArrayList.remove(2);
        show();
        myArrayList.clear();
        show();

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(0);
        myLinkedList.add(11);
        myLinkedList.add(22);
        myLinkedList.add(33);
        myLinkedList.add(44);
        System.out.println("MyLinkedList size is - " + myLinkedList.size());

        myLinkedList.remove(3);
        System.out.println("MyLinkedList size is - " + myLinkedList.size());

        myLinkedList.clear();
        System.out.println("MyLinkedList size is - " + myLinkedList.size());

        myLinkedList.add(0);
        myLinkedList.add(101);
        myLinkedList.add(202);
        myLinkedList.add(303);
        myLinkedList.add(404);
        int index = 3;
        System.out.println("\nMyLinkedList element #" + index + " value is " + myLinkedList.get(index).value);

        MyQueue<Double> myQueue = new MyQueue<>();
        myQueue.add(0.12);
        myQueue.add(1.23);
        myQueue.add(2.34);
        myQueue.add(3.45);
        myQueue.add(4.56);
        System.out.println("MyQueue size is - " + myQueue.size());

        System.out.println("\nQueue peek: " + myQueue.peek().value);

        System.out.println("\nQueue poll: " + myQueue.poll().value);
        System.out.println("MyQueue size is - " + myQueue.size());

        System.out.println("\nQueue poll: " + myQueue.poll().value);
        System.out.println("MyQueue size is - " + myQueue.size());
    }

}
