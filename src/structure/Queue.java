package structure;

public class Queue implements Queueable {

    private OneWayList listQueue;

    public Queue() {
        listQueue = new OneWayList();
    }

    @Override
    public void enqueue(int value) {
        listQueue.addFirst(value);
    }

    @Override
    public void dequeue() {
        listQueue.removeLast();
    }

    @Override
    public void add(int value) {
        enqueue(value);
    }

    @Override
    public void remove(int value) {
        // глупо, конечно, но удалить по значению, как в списках, тут никак нельзя,
        // так что переданное значение не используется
        System.out.println("\nSurprise, the value " + value + " was not used. The last element is to be deleted instead.");
        dequeue();
    }

    @Override
    public int size() {
        return listQueue.size();
    }

    @Override
    public boolean isEmpty() {
        return listQueue.isEmpty();
    }

    public void print() {
        listQueue.print();
    }
}
