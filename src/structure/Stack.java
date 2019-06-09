package structure;

public class Stack implements Stackable {

    private OneWayList listStack;

    public Stack() {
        listStack = new OneWayList();
    }

    @Override
    public void push(int value) {
        listStack.addFirst(value);
    }

    @Override
    public void pop() {
        listStack.removeFirst();
    }

    @Override
    public ListElement peek() {
        System.out.println("\nPeek: " + listStack.head.value + ".");
        return listStack.head;
    }

    @Override
    public void add(int value) {
        push(value);
    }

    @Override
    public void remove(int value) {
        // аналогично с queue, здесь переданное значение никак не будет использовано :(
        System.out.println("\nSurprise, the value " + value + " was not used. The last added element is to be deleted instead.");
        pop();
    }

    @Override
    public int size() {
        return listStack.size();
    }

    @Override
    public boolean isEmpty() {
        return listStack.isEmpty();
    }

    public void print() {
        listStack.print();
    }
}
