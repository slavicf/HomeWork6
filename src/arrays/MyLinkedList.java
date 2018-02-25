package arrays;

public class MyLinkedList<T> {

    private int listSize = 0;
    private Node startNode;
//    public Node endNode;

//    public MyLinkedList(T value) {
//        startNode = new Node(value);
////        startNode.next = endNode;
////        endNode  = new Node(value);
////        endNode.prev = startNode;
//    }

    private Node findIndex(int index) {
        Node findNode = startNode;
        if (findNode != null) {
            int i = 0;
            while (i++ != index) {
                if (findNode.next == null) return null;
                findNode = findNode.next;
            }
        }
        return findNode;
    }

    public void add(T value) {
        if (startNode == null) {
            startNode = new Node<>(value);
        } else {
            Node lastNode = startNode;
            while (lastNode.next != null) lastNode = lastNode.next;
            Node newNode = new Node<>(value);
            newNode.prev = lastNode;
            lastNode.next = newNode;
        }
        System.out.println("Node #" + listSize + " with value \"" + value + "\" successfully added to linked list");
        listSize++;
    }

    public void remove(int index) {
        Node toRemove = findIndex(index);
        if (toRemove != null) {
            Node prev = toRemove.prev;
            Node next = toRemove.next;
            prev.next = toRemove.next;
            next.prev = toRemove.prev;
            System.out.println("Node #" + index + " with value \"" + toRemove.value + "\" successfully deleted from linked list");
            listSize--;
        }
    }

}
