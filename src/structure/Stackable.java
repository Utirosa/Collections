package structure;

public interface Stackable extends Structure {

    void push(int value);
    void pop();
    ListElement peek();
}
