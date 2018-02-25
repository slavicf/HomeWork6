package arrays;

public class MyQueue<Q> extends MyLinkedList<Q>{

    public Node peek(){                                     // возвращает первый элемент в очереди (FIFO)
        return get(0);
    }

    public Node poll() {                                    // возвращает первый элемент в очереди и удаляет его из коллекции
        Node temp = startNode;
        if (startNode != null){
            startNode.prev = null;
            startNode = startNode.next;
            listSize--;
        }
        return temp;
    }
}
