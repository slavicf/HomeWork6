import java.util.Arrays;

public class MyArrayList<T> {
//    Написать свой класс MyArrayList как аналог классу ArrayList.
//    Можно использовать 1 массив для хранения данных.

    @SuppressWarnings("unchecked")
    private T[] arrayList = (T[]) new Object[0];

    public void add(T value) {                              // добавляет элемент в конец
//        @SuppressWarnings("unchecked")
//        T[] tempList = (T[]) new Object[arrayList.length + 1];

//        for (int i = 0; i < arrayList.length; i++){
//            tempList[i] = arrayList[i];
//        }

//        T[] tempList = Arrays.copyOf(arrayList, arrayList.length + 1);
//        tempList[arrayList.length] = value;
//        arrayList = tempList;
        int arrSize = arrayList.length;
        arrayList = Arrays.copyOf(arrayList, arrSize + 1);
        arrayList[arrSize] = value;
    }

    public void remove(int index) {                         // удаляет элемент под индексом
//        @SuppressWarnings("unchecked")
//        T[] tempList = (T[]) new Object[arrayList.length - 1];
//        int i2 = 0;
//
//        for (int i = 0; i < tempList.length; i++) {
//            if (i != index) tempList[i2++] = arrayList[i];
//        }
//        arrayList = tempList;
        int arrSize = arrayList.length - 1;
//        T[] tempList1 = Arrays.copyOfRange(arrayList, 0, index);
//        T[] tempList2 = Arrays.copyOfRange(arrayList, index, arrSize - 2);
//        tempList = Arrays.copyOfRange(arrayList, index, arrSize - 2);
//        arrayList = tempList + tempList;
        @SuppressWarnings("unchecked")
        T[] tempList = (T[]) new Object[arrSize];
        System.arraycopy(arrayList, 0, tempList, 0, index);
        System.arraycopy(arrayList, index + 1, tempList, index, arrSize - index);
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
