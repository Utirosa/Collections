package structure;

public interface Queueable extends Structure {

    void enqueue(int value);
    void dequeue();
}
