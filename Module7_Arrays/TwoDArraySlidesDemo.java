import java.util.Random;

/**
 * Demo 2D arrays from slides exercise.
 * @author mvail
 */
public class TwoDArraySlidesDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = new int[5][10]; // 10 rows, 20 cols
        // populating arr with random ints from 0 to 99
        System.out.println("Original 2D Array:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = rand.nextInt(100);
                System.out.printf("%3d ", arr[row][col]);
            }
            System.out.println();
        }

        // Loop to print first row
        System.out.println("First Row:");
        for (int col = 0; col < arr[0].length; col++) { // all cols of row index 0
            System.out.printf("%3d ", arr[0][col]);
        }
        System.out.println();

        // Loop to print second col
        System.out.println("Second Column:");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(arr[row][1]);
        }

        // last element in array
        System.out.println("Last Value:");
        System.out.println(arr[arr.length - 1][arr[0].length - 1]); // arr[arr.length-1].length

        // loop to print 2nd, 4th, etc. rows
        for (int row = 1; row < arr.length; row += 2) {
            System.out.println("Row " + (row + 1) + ":");
            for (int col = 0; col < arr[row].length; col++) { // all cols in current row
                System.out.printf("%3d ", arr[row][col]);
            }
            System.out.println();
        }

        // loop to print 1st, 3rd, etc. cols UPSIDE DOWN
        for (int col = 0; col < arr[0].length; col += 2) {
            System.out.println("Column " + (col + 1) + ":");
            for (int row = 0; row < arr.length; row++) { // all rows in current col
                System.out.println(arr[row][col]);
            }
        }

    }
}
