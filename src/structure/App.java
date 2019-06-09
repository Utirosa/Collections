package structure;

public class App {

    public static void main(String[] args) {

        // One Way List:
        OneWayList oneWayList = new OneWayList();

        for (int i = 0; i < 5; i++) {
            oneWayList.add(i + 1);
        }

        System.out.println("\nIs structure empty: " + oneWayList.isEmpty());
        oneWayList.print();
        oneWayList.addFirst(-99);
        oneWayList.print();
        oneWayList.addLast(88);
        oneWayList.print();
        oneWayList.removeFirst();
        oneWayList.print();
        oneWayList.removeLast();
        oneWayList.print();
        oneWayList.remove(20);
        oneWayList.print();
        oneWayList.removeByIndex(20);
        oneWayList.print();
        oneWayList.getByIndex(20);


        // Dynamic Array:
        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 0; i < 5; i++) {
            dynamicArray.add(i + 1);
        }

        System.out.println("\nIs structure empty: " + dynamicArray.isEmpty());
        dynamicArray.print();
        dynamicArray.addFirst(8);
        dynamicArray.print();
        dynamicArray.addLast(17);
        dynamicArray.print();
        dynamicArray.add(-6);
        dynamicArray.print();
        dynamicArray.removeFirst();
        dynamicArray.print();
        dynamicArray.removeLast();
        dynamicArray.print();
        dynamicArray.remove(3);
        dynamicArray.print();
        dynamicArray.getByIndex(8);


        // Queue:
        Queue queue = new Queue();

        for (int i = 0; i < 5; i++) {
            queue.add(i + 1);
        }

        System.out.println("\nIs structure empty: " + queue.isEmpty());
        queue.enqueue(7);
        queue.print();
        queue.dequeue();
        queue.print();
        queue.add(8);
        queue.print();
        queue.remove(5);
        queue.print();


        // Stack:
        Stack stack = new Stack();

        for (int i = 0; i < 5; i++) {
            stack.add(i + 1);
        }

        System.out.println("\nIs structure empty: " + stack.isEmpty());
        stack.push(7);
        stack.print();
        stack.pop();
        stack.print();
        stack.peek();
        stack.print();
        stack.add(5);
        stack.print();
        stack.remove(9);
        stack.print();
    }

}

