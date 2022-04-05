package model;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue() {
        this(5);
    }

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (size() == queue.length -1) {
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];

/*          replace this arraycopy function so that we can make the array circular
            System.arraycopy(queue,0, newArray,0,queue.length);*/

            System.arraycopy(queue, front, newArray,0,queue.length-front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);

            queue = newArray;

            front = 0;
            back = numItems;
        }

        queue[back] = employee;

        if (back < queue.length -1) {
            back++;
        } else back = 0;

        back++;
    }

    public Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee removedEmployee = queue[front];
        queue[front] = null;
        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        } else if (front == queue.length) {
            front = 0;
        }

        return removedEmployee;
    }

    public int size() {

        if (front <= back) {
            return back - front;
        }

        return back - front + queue.length;
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public void printQueue() {
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
        else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
