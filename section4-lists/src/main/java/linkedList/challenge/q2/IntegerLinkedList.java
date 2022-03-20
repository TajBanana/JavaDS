package linkedList.challenge.q2;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        if (head == null || head.getValue() >= value) {
            addToFront(value);
            return;
        }

        IntegerNode current = head.getNext();
        IntegerNode previous = head;

        while (current != null && current.getValue() < value) {
            previous = current;
            current = current.getNext();
        }

        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(current);
        previous.setNext(newNode);

        size ++;
/*        MY ANSWER
        IntegerNode newNode = new IntegerNode(value);

        if (isEmpty()) {
            head = newNode;
            size++;
            return;
        }

        IntegerNode currentNode = head;

        while (currentNode!=null && currentNode.getValue() < value) {
            currentNode = currentNode.getNext();
        }

        if (currentNode == null) {
            currentNode = head;

            while (currentNode.getNext() != null && currentNode.getValue() < value) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
            size++;
            return;
        }

        newNode.setNext(currentNode);
        head = newNode;
        size++;*/
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
