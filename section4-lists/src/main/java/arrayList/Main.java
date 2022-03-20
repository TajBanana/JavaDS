package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 1234));
        employeeList.add(new Employee("Jon", "Jones", 4567));
        employeeList.add(new Employee("Mary", "Smith", 7890));
        employeeList.add(new Employee("Mike", "Pound", 1245));
        employeeList.add(new Employee("Alan","Turing",6666));

        System.out.println(employeeList.get(1));

        //employeeList.forEach(System.out::println);

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee employee: employeeList) {
            System.out.println(employee);
        }

        System.out.println(Arrays.toString(employeeArray));

        System.out.println(employeeList.contains(new Employee("Mary", "Smith",7890)));
        System.out.println(employeeList.indexOf(new Employee("Jane","Jones",1234)));

    }
}
