package structure;

public abstract class List implements Listable {

    public ListElement head;
    public int elementsCount;

    @Override
    public void addLast(int value) {
    }

    @Override
    public void addFirst(int value) {
    }

    @Override
    public void remove(int value) {
    }

    @Override
    public int size() {
        return elementsCount;
    }

    @Override
    public boolean isEmpty() {
        return elementsCount == 0;
    }

    public void print() {
    }
}

