import java.util.Random;

/**
 * Demo working with a 2D array.
 * @author mvail
 */
public class TwoDimArrayDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        
        final int UPPER_BOUND = 100;
        final int MIN_ROWS = 3;
        final int MAX_ROWS = 6;
        final int MIN_COLS = 3;
        final int MAX_COLS = 10;
        
        //create a 2D array of random dimensions
        // where num rows is between 3 and 6
        // and num cols is between 3 and 10;
        int[][] array1 = new int[rand.nextInt(MAX_ROWS-MIN_ROWS)+MIN_ROWS][rand.nextInt(MAX_COLS-MIN_COLS)+MIN_COLS];
        
        //fill array with random ints from 1 to 100
        for (int row = 0; row < array1.length; row++) {
            for (int col = 0; col < array1[row].length; col++) {
                array1[row][col] = rand.nextInt(UPPER_BOUND) + 1;
            }
        }

        //print full array
        for (int row = 0; row < array1.length; row++) {
            for (int col = 0; col < array1[row].length; col++) {
                System.out.printf("%3d ", array1[row][col]); //stay on current row
            }
            System.out.println(); //go to next row of output
        }

        //can also use initializer lists for mulit-dimensional arrays!
        int[][] array2 = { //initialize a 3 row, 5 col 2D array
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };

        //print first row
        System.out.println("FIRST ROW");
        for (int col = 0; col < array1[0].length; col++) { //only going through row 0
            System.out.printf("%3d ", array1[0][col]);
        }
        System.out.println();

        //print second column
        System.out.println("SECOND COLUMN");
        for (int row = 0; row < array1.length; row++) { //only going through col 1
            System.out.println(array1[row][1]);
        }

        //print last value
        System.out.println("LAST VALUE");
        System.out.println(array1[array1.length-1][array1[array1.length-1].length-1]); //ew
    }
}
