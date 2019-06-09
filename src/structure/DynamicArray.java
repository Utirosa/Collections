package structure;

public class DynamicArray extends List implements Listable {

    private int[] elements;

    public DynamicArray() {
        this(10);
    }

    public DynamicArray(int initialCapacity) {
        this.elements = new int[initialCapacity];
    }

    public void addFirst(int value) {
        if (elements.length == elementsCount) {
            int[] oldElements = elements;
            elements = new int[(int)(elements.length * 1.5)];
            System.arraycopy(oldElements, 0, elements, 0, oldElements.length);
        }
        if (elements.length > 0){
            for (int i = elements.length - 1; i > 0; i--){
                elements[i] = elements[i-1];
            }
        }
        elements[0] = value;
        elementsCount++;
    }

    @Override
    public void addLast(int value) {
        if (elements.length == elementsCount) {
            int[] oldElements = elements;
            elements = new int[(int)(elements.length * 1.5)];
            System.arraycopy(oldElements, 0, elements, 0, oldElements.length);
        }
        elements[elementsCount++] = value;
    }

    @Override
    public void add(int value) {
        addLast(value);
    }

    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        remove(elementsCount - 1);
    }

    // удаление по индексу:
    @Override
    public void remove(int index) {
        if (elementsCount > index){
            System.out.println("\nElement is successfully deleted.");
            for (int i = index; i < elementsCount; i++){
                elements[i] = elements[i + 1];
            }
            elementsCount--;
        }
        else {
            System.out.println("\nThere is no such element in the array.");
        }
    }

    @Override
    public int getByIndex(int index) {
        if (elementsCount > index) {
            ListElement wanted = new ListElement(0);
            for (int i = 0; i <= index; i++) {
                wanted.value = elements[i];
            }
            System.out.println("\nThe element with index " + index + " is " + wanted.value + ".");
            return wanted.value;
            }
        System.out.println("\nThere is no element with such an index in the array.");
        return 0;
    }

    @Override
    public void print() {
        ListElement toPrint = new ListElement(0);
        System.out.println("\nHere is what the structure looks like:");
        if (!isEmpty()) {
            for (int i = 0; i < elementsCount; i++){
                toPrint.value = elements[i];
                System.out.println((i + 1) + " element's value is " + toPrint.value + ".");
            }
        }
        else {
            System.out.println("\nThe structure is empty.");
        }
    }
}
