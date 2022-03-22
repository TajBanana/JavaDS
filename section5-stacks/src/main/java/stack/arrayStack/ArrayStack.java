package stack.arrayStack;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack() {
        //stack = new Employee[10];
        this(10);
    }

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == stack.length) {
        //    need to resize array
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0,stack.length);
            stack = newArray;
        }

        stack[top++] =  employee;
    }

    public Employee pop() {
        if (isEmpty()) throw new EmptyStackException();

        //Remember that index of top is always empty. Hence, we need to decrement top before we get the index from top.
        Employee employee = stack[--top];
        stack[top] = null;

        //if we are diligent enough, we can resize the array if popping it causes the array to decrease

        return employee;
    }

    public Employee peek() {
        if (isEmpty()) throw new EmptyStackException();

        //does not want to change the value of top
        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public void printStack() {
        for (Employee employee : stack) {
            if (employee != null) System.out.println(employee);
        }
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
