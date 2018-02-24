package arrays;

public class MyLinkedList<T> {

    private int listSize = 0;
    public Node<T> startNode;
//    public Node<T> endNode;

//    public MyLinkedList(T value) {
//        startNode = new Node<>(value);
////        startNode.next = endNode;
////        endNode  = new Node<>(value);
////        endNode.prev = startNode;
//    }

    private Node findLast() {
        Node temp = startNode;
        while (temp.next != null) temp = temp.next;
        return temp;
    }

    private Node findIndex(int index) {
        int i = 0;
        Node temp = startNode;
        while (i++ != index) temp = temp.next;
        return temp;
    }

    public void add(T value) {
        if (listSize > 0) {
            Node last = findLast();
            Node newNode = new Node(value);
            newNode.prev = last;
            last.next = newNode;
        } else startNode = new Node(value);
        listSize++;
    }

    public void remove(int index) {
        Node toRemove = findIndex(index);
        Node prev = toRemove.prev;
        Node next = toRemove.next;
        prev.next = toRemove.next;
        next.prev = toRemove.prev;
    }

}
