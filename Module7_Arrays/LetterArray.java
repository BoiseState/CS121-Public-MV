/**
 * Demo initializing an array of all 26 letters.
 * 
 * @author mvail
 */
public class LetterArray {
    public static void main(String[] args) {
        arrayUsingInitializerList();

        arrayOneIndexAtATime();

        arrayUsingCharMath();
    }

    /** Print nicely formatted array with given label. */
    private static void printArray(char[] array, String label) {
        System.out.println(label);
        for (char c : array) {
            System.out.printf("%2s", c);
        }
        System.out.println();
    }

    /** Populate array using an initializer list. */
    private static void arrayUsingInitializerList() {
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                          'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        printArray(letter, "Array from initializer list:");
    }

    /** Populate array one index at a time. */
    private static void arrayOneIndexAtATime() {
        char[] letter = new char[26];
        letter[0] = 'a';
        letter[1] = 'b';
        letter[2] = 'c';
        letter[3] = 'd';
        letter[4] = 'e';
        letter[5] = 'f';
        letter[6] = 'g';
        letter[7] = 'h';
        letter[8] = 'i';
        letter[9] = 'j';
        letter[10] = 'k';
        letter[11] = 'l';
        letter[12] = 'm';
        letter[13] = 'n';
        letter[14] = 'o';
        letter[15] = 'p';
        letter[16] = 'q';
        letter[17] = 'r';
        letter[18] = 's';
        letter[19] = 't';
        letter[20] = 'u';
        letter[21] = 'v';
        letter[22] = 'w';
        letter[23] = 'x';
        letter[24] = 'y';
        letter[25] = 'z';
        printArray(letter, "Array One Index at a Time:");
    }

    /** Populate array using character math. */
    private static void arrayUsingCharMath() {
        char[] letter = new char[26];
        for (int i = 0; i < 26; i++) {
            letter[i] = (char) ('a' + i);
        }
        printArray(letter, "Array Using Character Math:");
    }
}
