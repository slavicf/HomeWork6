public class MyArrayList<T> {
//    Написать свой класс MyArrayList как аналог классу ArrayList.
//    Можно использовать 1 массив для хранения данных.

    private T[] arrayList = (T[]) new Object[0];

    public void add(T value) {                              // добавляет элемент в конец
        T[] tempList = (T[]) new Object[arrayList.length + 1];

        for (int i = 0; i < arrayList.length; i++){
            tempList[i] = arrayList[i];
        }
        tempList[tempList.length - 1] = value;
        arrayList = tempList;
    }

    public void remove(int index) {                         // удаляет элемент под индексом
        T[] tempList = (T[]) new Object[arrayList.length - 1];
        int i2 = 0;

        for (int i = 0; i < tempList.length; i++){
            if (i != index) tempList[i2++] = arrayList[i];
        }
        arrayList = tempList;
    }

    public void clear() {                                   // очищает коллекцию
        arrayList = (T[]) new Object[0];
    }

    public int size() {                                    // возвращает размер коллекции
        return arrayList.length;
    }

    public T get(int index) {                               // возвращает элемент под индексом
        return arrayList[index];
    }
}
