package arrays;

public class MyLinkedList<T> {

    int listSize = 0;
    Node startNode;

    void act(String value, String action) {
        System.out.println("Node #" + listSize + " with value \"" + value + "\" successfully " + action + ".");
    }

    private Node findLast(){                                        // находит последнюю ноду
        Node node = startNode;
        while (node.next != null) node = node.next;
        return node;
    }

    public void add(T value) {                              // добавляет элемент в конец
        if (startNode == null) {
            startNode = new Node<>(value);
        } else {
            Node lastNode = findLast();
            Node newNode = new Node<>(value);
            newNode.prev = lastNode;
            lastNode.next = newNode;
        }
        listSize++;
        act(value.toString(), "added");
    }

    public void remove(int index) {                         // удаляет элемент под индексом
        Node toRemove = get(index);
        if (toRemove != null) {
            Node prev = toRemove.prev;
            Node next = toRemove.next;
            prev.next = toRemove.next;
            next.prev = toRemove.prev;
            listSize--;
            act(toRemove.value.toString(), "deleted");
        }
    }

    public void clear() {                                   // очищает коллекцию
        if (startNode != null) {
            startNode = null;
            listSize = 0;
            System.out.println("List successfully cleared.");
        }
    }

    public int size() {                                    // возвращает размер коллекции
        return listSize;
    }

    public Node get(int index) {                     // возвращает элемент под индексом
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

}
