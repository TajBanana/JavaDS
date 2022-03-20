package linkedList.jdk;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.addFirst(janeJones);
        employeeList.addFirst(johnDoe);
        employeeList.addFirst(marySmith);
        employeeList.addFirst(mikeWilson);

        employeeList.add(new Employee("Bill", "End", 7788));

        Iterator iterator = employeeList.iterator();
        System.out.print("HEAD => ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(" <=> ");
        }



     }
}
