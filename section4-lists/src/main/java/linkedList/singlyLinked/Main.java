package linkedList.singlyLinked;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);


        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println("is empty " + list.isEmpty());

        System.out.println(list.getHead());
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println("is empty " + list.isEmpty());


        list.printList();
        System.out.println(list.getSize());
    }
}
