import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Reading from a CSV file with known format:
 *  LName,FName,Email,Phone
 * @author mvai
 */
public class FileParseContacts {
    public static void main(String[] args) {
        final String DELIMITERS = ",";
        try {
            //attempt to open the file in a Scanner - a "dangerous" operation, so in a try block
            Scanner fileScan = new Scanner(new File("contactList1.txt"));
            //"eating" the first line FOR THIS INPUT FILE because it is a header, not a contact
            // Not every input file has a header line, so don't do this if it doesn't apply!
            String headerLine = fileScan.nextLine(); 
            //read the file a line at a time
           while(fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                //now break that line into tokens
                Scanner lineScan = new Scanner(line);
                lineScan.useDelimiter(DELIMITERS); //separate tokens by commas instead of whitespace
                String lName = lineScan.next(); //breaking up a single String into tokens
                String fName = lineScan.next(); // is the only time you should ever be
                String email = lineScan.next(); // using next(), nextInt(), nextDouble()
                String phone = lineScan.next(); // etc.
                //now I can use those tokens however I want
                System.out.println("Send email to " + fName + " " + lName + " at " + email
                    + " or call at (" + phone.substring(0,3) + ")" + phone.substring(3, 6) + "-"
                    + phone.substring(6) + ".");
                lineScan.close(); //done with this line scanner
            }
            fileScan.close(); //done with this file scanner
        } catch (FileNotFoundException e) {
            //we only get here if the Scanner couldn't open the file in the try block
            System.out.println("Sorry. Couldn't open the file.");
        }
    }
}
