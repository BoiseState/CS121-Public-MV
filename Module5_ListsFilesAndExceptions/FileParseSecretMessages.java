import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Demonstrate parsing a file in the preferred two-Scanner approach where one
 * Scanner reads input one line at a time and the second Scanner breaks that
 * line into tokens. Builds a message from tokens that start with a capital
 * letter.
 * Associated input files "parsing1.txt" and "parsing2.txt" contain embedded
 * secret messages.
 * 
 * @author mvail
 */
public class FileParseSecretMessages {

	/** @param args unused */
	public static void main(String[] args) {
		//prompt for filename
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter the name of the file to parse: ");
		String filename = kbd.nextLine().strip(); //strip() removes leading/trailing whitespace
		kbd.close(); //close Scanner after you're done with it
		
		//create File object - file may or may not be an existing file at this point
		File file = new File(filename);
		
		String message = "";
		try {
			//this Scanner will read the file one whole line at a time
			Scanner fileScan = new Scanner(file);
			int lineCount = 0;
			int tokenCount = 0;
			while (fileScan.hasNextLine()) { //unknown number of lines in file
				String line = fileScan.nextLine(); //get whole next line from file
				//System.out.println(line); //just for debugging/development use
				lineCount++;
				//this Scanner will break up a line into individual tokens
				Scanner lineScan = new Scanner(line);
				while (lineScan.hasNext()) { //unknown number of tokens per line
					String token = lineScan.next(); //get next token from line
					//System.out.println(token); //just for debugging/development use
					tokenCount++;
					//if token starts with a capital letter, add letter to message
					if (token.charAt(0) >= 'A' && token.charAt(0) <= 'Z') {
						message += token.charAt(0);
					}
				}
				lineScan.close(); //close Scanners after you're DONE with it
			}
			fileScan.close(); //close Scanner after you're DONE with it
			System.out.println("Number of lines: " + lineCount);
			System.out.println("Number of tokens: " + tokenCount);
			System.out.println("Message: " + message);
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, \"" + filename + "\" cannot be opened.");
			return; //exit main() if we couldn't open the expected file
		}
		
	} //end of main()
	
} //end of FileParseDemo
