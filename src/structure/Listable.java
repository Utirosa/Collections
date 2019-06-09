package structure;

public interface Listable extends Structure {

    void addLast(int value);
    void addFirst(int value);
    void removeLast();
    void removeFirst();
    int getByIndex(int index);
}
