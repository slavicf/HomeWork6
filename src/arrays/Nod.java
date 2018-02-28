package arrays;

public class Nod<T, K> {

    public T key;
    public K value;
    public Nod next;

    Nod(T key, K value) {
        this.key = key;
        this.value = value;
    }

}
