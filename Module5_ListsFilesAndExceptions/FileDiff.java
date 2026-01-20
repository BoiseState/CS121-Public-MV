import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Compare 2 files and report lines that are different.
 * 
 * @author mvail
 */
public class FileDiff {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter filename 1: ");
		File file1 = new File(kbd.nextLine().strip());
		System.out.print("Enter filename 2: ");
		File file2 = new File(kbd.nextLine().strip());
		kbd.close(); // done with keyboard

		try {
			Scanner fileScan1 = new Scanner(file1);
			Scanner fileScan2 = new Scanner(file2);

			int currentLine = 1;
			while (fileScan1.hasNextLine() && fileScan2.hasNextLine()) {
				String file1Line = fileScan1.nextLine();
				String file2Line = fileScan2.nextLine();

				if (file1Line.compareTo(file2Line) != 0) {
					System.out.println("Difference at line " + currentLine);
					System.out.println(file1Line);
					System.out.println(file2Line);
					System.out.println();
				}

				currentLine++;
			}

			// now, what if one file is longer than the other?

			while (fileScan1.hasNextLine()) { //as long as there are remaining lines
				System.out.println("Unmatched line in first file:");
				System.out.println(fileScan1.nextLine());
				System.out.println();
			}

			while (fileScan2.hasNextLine()) {
				System.out.println("Unmatched line in second file:");
				System.out.println(fileScan2.nextLine());
				System.out.println();
			}

			fileScan1.close();
			fileScan2.close();
		} catch (FileNotFoundException e) {
			//only get into this catch block if one of the files couldn't
			//be opened - print the exception's message and end main()
			System.err.println(e);
			return; //exits main(), ending the program
		}
	}
}
