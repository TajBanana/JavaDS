package stack.challenge;

import java.util.LinkedList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<String> linkedList = new LinkedList<>();
        String inputString = string.toLowerCase().replaceAll("[^A-Za-z]+", "");
        char[] array = inputString.toCharArray();

        //Create linked list
        for (char c : array) {
            linkedList.push(String.valueOf(c));
        }

/*        System.out.println(array);
        System.out.println("created linked list: " + linkedList);*/

        for (char c : array) {

            if (!String.valueOf(c).equals(linkedList.pop())) {
                return false;
            }
        }

        return true;
    }
}
