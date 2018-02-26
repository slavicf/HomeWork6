package arrays;

public class MyQueue<Q> extends MyLinkedList<Q>{

    public Node peek(){                                     // возвращает первый элемент в очереди (FIFO)
        return startNode;
    }

    public Node poll() {                                    // возвращает первый элемент в очереди и удаляет его из коллекции
        Node temp = startNode;
        if (startNode != null){
            startNode = startNode.next;
            startNode.prev = null;
            listSize--;
        }
        return temp;
    }
}
