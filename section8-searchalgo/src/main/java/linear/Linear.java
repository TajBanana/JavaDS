package linear;

public class Linear {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(linearSearch(intArray,1));
        System.out.println(linearSearch(intArray,0));
    }

    public static int linearSearch(int [] intArray, int value) {
        int i = 0;
        for (int intValue : intArray) {
            if (intValue == value) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
