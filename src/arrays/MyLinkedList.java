package arrays;

public class MyLinkedList<T> {

    int listSize = 0;
    Node startNode;

    public void add(T value) {                              // добавляет элемент в конец
        if (startNode == null) {
            startNode = new Node<>(value);
        } else {
            Node lastNode = startNode;
            while (lastNode.next != null) lastNode = lastNode.next;
            Node newNode = new Node<>(value);
            newNode.prev = lastNode;
            lastNode.next = newNode;
        }
        System.out.println("\nNode #" + listSize + " with value \"" + value + "\" successfully added.");
        listSize++;
    }

    public void remove(int index) {                         // удаляет элемент под индексом
        Node toRemove = get(index);
        if (toRemove != null) {
            Node prev = toRemove.prev;
            Node next = toRemove.next;
            prev.next = toRemove.next;
            next.prev = toRemove.prev;
            System.out.println("\nNode #" + index + " with value \"" + toRemove.value + "\" successfully deleted.");
            listSize--;
        }
    }

    public void clear() {                                   // очищает коллекцию
        if (startNode != null) {
            startNode = null;
            listSize = 0;
            System.out.println("\nList successfully cleared.");
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
