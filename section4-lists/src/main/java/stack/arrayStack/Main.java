package stack.arrayStack;

public class Main {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        arrayStack.push(janeJones);
        arrayStack.push(johnDoe);
        arrayStack.push(marySmith);
        arrayStack.push(mikeWilson);
        arrayStack.push(new Employee("Bill", "End", 1234555));

        arrayStack.printStack();

        System.out.println("\n" + arrayStack.peek());

        arrayStack.printStack();

        System.out.println();

    }
}
