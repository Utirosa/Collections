package structure;

// Условимся, что в структурах используются элементы типа int

public interface Structure {

    void add(int value);

    // В разных типах структур реализован по-разному, и передавать значение не везде необходимо. Но такое условие :(
    void remove(int value);

    int size();

    boolean isEmpty();

}
