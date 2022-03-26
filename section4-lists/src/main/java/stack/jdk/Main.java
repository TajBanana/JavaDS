package stack.jdk;

import stack.arrayStack.ArrayStack;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        LinkedStack linkedStack = new LinkedStack();

        linkedStack.push(janeJones);
        linkedStack.push(johnDoe);
        linkedStack.push(marySmith);
        linkedStack.push(mikeWilson);
        linkedStack.push(new Employee("Bill", "End", 1234555));

        linkedStack.printStack();

        System.out.println("\n" + "peek: " + linkedStack.peek());

        linkedStack.printStack();

        System.out.println("popped: "+linkedStack.pop());
        linkedStack.printStack();

    }
}
