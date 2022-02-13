package arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] intArray = new int[7];

//        every int occupies 4 bytes in memory
//        when we are working with object array, what is stored in memory is the object reference, and they are of the same size
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = -55;
        intArray[5] = 1;
        intArray[6] = -22;

        int i = 0;
        for (int num : intArray) {

            if(num == 7) {
                System.out.println("index: " + i);
                break;
            }

            i++;
        }
    }
}
