/**
 * Demo showing that passing an array as a method argument
 * allows the method to alter the array contents.
 * @author mvail
 */
public class ArrayPassingDemo {
    public static void main(String[] args) {
        //populate an array with ascending consecutive values
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //print array contents
        System.out.println("Before method:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        //pass array to method
        doubleVals(array);

        //print array contents
        System.out.println("After method:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Double all values in given array, in place.
     * NOTE: The contents of the given array are altered.
     * @param a the array
     */
    private static void doubleVals(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 2 * a[i];
        }
    }
}
