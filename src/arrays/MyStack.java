package arrays;

public class MyStack<S> extends MyQueue<S> {

    public void push(S value) {                             // добавляет элемент в конец
        if (startNode == null) {
            startNode = new Node<>(value);
        } else {
            Node newNode = startNode;
            startNode = new Node<>(value);
            startNode.next = newNode;
            newNode.prev = startNode;
        }
        listSize++;
        act(value.toString(), "added");
    }

    public Node pop() {                                     // возвращает первый элемент в стеке и удаляет его из коллекции
        return poll();
    }
}
