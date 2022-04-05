package challenge;

import java.util.LinkedList;

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
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        String inputString = string.toLowerCase().replaceAll("[^A-Za-z]+", "");

        for (int i = 0; i  < inputString.length(); i++) {
            queue.addLast(inputString.charAt(i));
            stack.push(inputString.charAt(i));
        }


        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;
    }
}
