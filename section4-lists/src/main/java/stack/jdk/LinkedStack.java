package stack.jdk;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

    private LinkedList<Employee> linkedStack;

    public LinkedStack() {
        linkedStack = new LinkedList<>();
    }

    public void push(Employee employee) {
        linkedStack.push(employee);
    }

    public Employee pop() {
        return linkedStack.pop();
    }

    public Employee peek() {
        return linkedStack.peek();
    }

    public boolean isEmpty() {
        return linkedStack.isEmpty();
    }

    public void printStack(){
        ListIterator<Employee> iterator = linkedStack.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
