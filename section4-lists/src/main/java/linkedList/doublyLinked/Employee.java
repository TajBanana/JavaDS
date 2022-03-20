package linkedList.doublyLinked;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Employee {

    private String firstName;
    private String lastName;
    private int id;

}