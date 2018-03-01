import arrays.*;

public class Main {

    private static MyArrayList<String> myArrayList = new MyArrayList<>();

    private static void listSize(String list, int size) {
        System.out.println(list + " size is - " + size + "\n");
    }

    private static void show() {
        int size = myArrayList.size();
        System.out.println("\nArray size is: " + size);
        for (int i = 0; i < size; i++) System.out.println(myArrayList.get(i));
    }

    public static void main(String[] args) {

//----------------------- myArrayList ---------------------------
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

//----------------------- myLinkedList ---------------------------
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(0);
        myLinkedList.add(101);
        myLinkedList.add(202);
        myLinkedList.add(303);
        myLinkedList.add(404);
        listSize("MyLinkedList", myLinkedList.size());

        int index = 3;
        System.out.println("MyLinkedList element #" + index + " value is " + myLinkedList.get(index).value);

        myLinkedList.remove(index);
        listSize("MyLinkedList", myLinkedList.size());

        myLinkedList.clear();
        listSize("MyLinkedList", myLinkedList.size());

//----------------------- MyQueue ---------------------------
        MyQueue<Double> myQueue = new MyQueue<>();
        myQueue.add(0.12);
        myQueue.add(1.23);
        myQueue.add(2.34);
        myQueue.add(3.45);
        myQueue.add(4.56);
        listSize("MyQueue", myQueue.size());

        System.out.println("Queue peek: " + myQueue.peek().value);
        listSize("MyQueue", myQueue.size());

        System.out.println("Queue poll: " + myQueue.poll().value);
        listSize("MyQueue", myQueue.size());

        System.out.println("Queue poll: " + myQueue.poll().value);
        listSize("MyQueue", myQueue.size());

//----------------------- MyStack ---------------------------
        MyStack<Float> myStack = new MyStack<>();
        myStack.push(0.123f);
        myStack.push(1.234f);
        myStack.push(2.345f);
        myStack.push(3.456f);
        myStack.push(4.567f);
        listSize("MyStack", myStack.size());

        System.out.println("Stack peek: " + myStack.peek().value);
        listSize("MyStack", myStack.size());

        System.out.println("Stack pop: " + myStack.pop().value);
        listSize("MyStack", myStack.size());

        myStack.remove(1);
        listSize("MyStack", myStack.size());

        myStack.clear();
        listSize("MyStack", myStack.size());

//----------------------- MyHashMap ---------------------------
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        myHashMap.put(0, "zero");
        myHashMap.put(1, "one");
        myHashMap.put(2, "two");
        myHashMap.put(2, "double");
        myHashMap.put(3, "three");
        myHashMap.put(4, "four");
        listSize("MyHashMap", myHashMap.size());

        int key = 3;
        System.out.println("Key " + key + " value is \"" + myHashMap.get(key) + "\"\n");

        myHashMap.remove(key);
        listSize("MyHashMap", myHashMap.size());

        myHashMap.clear();
        listSize("MyHashMap", myHashMap.size());

    }

}
