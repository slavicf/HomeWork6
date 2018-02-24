import arrays.MyArrayList;
import arrays.MyLinkedList;
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
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

        myLinkedList.remove(3);

    }

}
