package structure;

public class OneWayList extends List implements Listable {

    @Override
    public void addFirst(int value) {
        ListElement newElement = new ListElement(value);
        newElement.next = head;
        head = newElement;
        elementsCount++;
        System.out.println("\nThe element is added to the beginning of the list.");
    }

    @Override
    public void addLast (int value) {
        if (elementsCount > 0){
            ListElement element = head;
            while (element.next != null){
                element = element.next;
            }
            element.next = new ListElement(value);
        }
        else {
            head = new ListElement(value);
        }
        elementsCount++;
        System.out.println("\nThe element is added to the end of the list.");
    }

    // я не придумала ничего лучше - условимся, что этот метод из Structure должен по умолчанию прибавлять в конец
    @Override
    public void add(int value) {
        addLast(value);
    }

    // это будет служебный метод по соединению элементов слева и справа от удалённого,
    // чтобы не загромождать остальной код:
    private void removeFromList(ListElement previous, ListElement current) {
        if (previous == null) {
            head = current.next;
        }
        else {
            previous.next = current.next;
        }
        elementsCount--;
        System.out.println("\nThe element is successfully removed.");
    }

    // я решила сделать на всякий случай удаление по индексу:
    public ListElement removeByIndex(int index) {
        ListElement element = head;
        ListElement prevElement = null;

        int walkCounter = 0;
        do {
            if (walkCounter != index) {
                walkCounter++;
                prevElement = element;
            }
            else {
                removeFromList(prevElement, element);
                return element;
            }
        } while((element = element.next) != null);
        System.out.println("\nThere is no such element in the list.");
        return null;
    }

    // а это будет удаление первого элемента, у которого значение совпадает с переданным:
    @Override
    public void remove(int value) {
        if (elementsCount > 0){
            ListElement currentElement = head; // это будет первый элемент, у которого значение совпадает с переданным
            while (currentElement.next != null) {
                currentElement = currentElement.next; // прошли по списку до первого совпадения (если оно было)
                if (currentElement.value == value) {
                    ListElement previousElement = head;
                    while (previousElement.next != currentElement){
                        previousElement = previousElement.next; // аналогично нашли элемент перед удаляемым
                    }
                    removeFromList(previousElement, currentElement); // здесь просто вызываем служебный метод
                    break;
                }
            }
        }
        System.out.println("\nThere is no element with such a value in the list.");
    }

    @Override
    public void removeFirst() {
        removeFromList(null, head);
    }
    @Override
    public void removeLast() {
        ListElement toRemove = head;
        ListElement previousElement = head;
        if (elementsCount > 0) {
            while (toRemove.next != null) {
                toRemove = toRemove.next;
            }
            while (previousElement.next != toRemove) {
                previousElement = previousElement.next;
            }
            removeFromList(previousElement, toRemove);
        }
    }

    @Override
    public int getByIndex(int index) {
        if (elementsCount > 0) {
            ListElement element = head;
            for (int i = 0; i < elementsCount; i++) {
                if (i == index) {
                    System.out.println("\nThe value of the element with " + index + " index is " + element.value + ".");
                    return element.value;
                }
                else {
                    element = element.next;
                }
            }
        }
        System.out.println("\nThere is no such element in the list.");
        return 0;
    }

    @Override
    public void print() {
        ListElement toPrint = head;
        System.out.println("\nHere is what the structure looks like:");
        if (!isEmpty()) {
            for (int i = 1; i <= elementsCount; i++) {
                System.out.println(i + " element's value is " + toPrint.value + ".");
                toPrint = toPrint.next;
            }
        }
        else {
            System.out.println("\nThe structure is empty.");
        }
    }
}
