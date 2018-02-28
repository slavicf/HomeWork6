package arrays;

public class MyHashMap<T, K> {

    private int listSize = 0;
    private Nod startNod;

    private void act(String key, String value, String action) {
        System.out.println("Key " + key + " with value \"" + value + "\" successfully " + action + ".");
    }

    private Nod findLast(T key) {                                        // находит последнюю ноду
        Nod nod = startNod;
        while (nod.next != null) {
            if (nod.key == key) return null;
            nod = nod.next;
            if (nod.key == key) return null;
        }
        return nod;
    }

    public void put(T key, K value) {                       // добавляет пару ключ + значение
        if (startNod == null) {
            startNod = new Nod<>(key, value);
            listSize++;
            act(key.toString(), value.toString(), "added");
        } else {
            Nod lastNode = findLast(key);
            if (lastNode != null) {
                lastNode.next = new Nod<>(key, value);
                listSize++;
                act(key.toString(), value.toString(), "added");
            } else {
                System.out.println("Key " + key + " already exist");
            }
        }
    }

    public void remove(T key) {                             // удаляет пару по ключу
        if (startNod == null) {
            System.out.println("Nothing to delete.");
            return;
        }
        if (startNod.key == key) {
            startNod = startNod.next;
            listSize--;
            return;
        }

        Nod prev = startNod;
        Nod nod = startNod.next;

        while (nod != null) {
            if (nod.key == key) {
                prev.next = nod.next;
                listSize--;
                act(key.toString(), nod.value.toString(), "deleted");
                return;
            }
            prev = nod;
            nod = nod.next;
        }

    }

    public void clear() {                                   // очищает коллекцию
        startNod = null;
        listSize = 0;
        System.out.println("MyHashMap cleared");
    }

    public int size() {                                    // возвращает размер коллекции
        return listSize;
    }

    public K get(T key) {                                   // возвращает значение(K value) по ключу
        Nod nod = startNod.next;
        K value = null;

        while (nod != null) {
            if (nod.key == key) value = (K) nod.value;
            nod = nod.next;
        }
        return value;
    }
}
