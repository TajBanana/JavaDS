import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();

//    Imperative approach ❌

/*        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        females.stream().forEach(System.out::println);
        System.out.println();
        females.parallelStream().forEach(System.out::println);*/

//    Declarative approach ✅

//    Filter
/*        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        females.stream().forEach(System.out::println);*/

    //    Sort
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getGender).reversed().thenComparing(Person::getAge).reversed())
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);

    //    All match
        boolean allMatch = people.stream().allMatch(person -> person.getAge() > 5);
        System.out.println(allMatch);

        //  Any match
        boolean anyMatch = people.stream().allMatch(person -> person.getAge() > 120);
        System.out.println(anyMatch);

        //  None match
        boolean noneMatch = people.stream().noneMatch(person -> person.getName().equals("Antonio"));
        System.out.println(noneMatch);

    //    Max
            people.stream()
                    .max(Comparator.comparing(Person::getAge))
                    .ifPresent(System.out::println);

    //    Min
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
        
    //    Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        System.out.println(groupByGender);

        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println();
        });

        Optional<String> oldestFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .min(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestFemaleAge.ifPresent(System.out::println);
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
