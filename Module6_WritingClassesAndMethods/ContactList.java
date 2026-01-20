import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Manages a collection of Contacts
 * 
 * @author mvail
 */
public class ContactList {
    private ArrayList<Contact> list; //collection of Contacts
    private File listFile; //file recording Contacts between sessions

    private static final String HEADER_LINE = "LName,FName,Email,Phone";

    /**
     * Initialize ContactList. If a file with the given
     * file name exists, the contents of that list are
     * read to create Contacts. If no previous file
     * with that name exists, create a new empty list.
     * 
     * @param listFileName
     */
    public ContactList(String listFileName) {
        list = new ArrayList<Contact>();
        listFile = new File(listFileName);
        try {
            Scanner fileScan = new Scanner(listFile);
            String headerLine = fileScan.nextLine(); // consuming header from file
            while (fileScan.hasNextLine()) { //each line is a contact
                String line = fileScan.nextLine();
                Scanner lineScan = new Scanner(line); //break up line with 2nd Scanner
                lineScan.useDelimiter(","); //contact values separated by commas
                String lastName = lineScan.next();
                String firstName = lineScan.next();
                String email = lineScan.next();
                String phone = lineScan.next();
                Contact contact = new Contact(firstName, lastName, email, phone);
                list.add(contact);
                lineScan.close();
            }
            fileScan.close();
            Collections.sort(list); // maintain list in sorted order
        } catch (FileNotFoundException fnfe) {
            // Create a new listFile
            try {
                PrintWriter pw = new PrintWriter(listFile);
                pw.println(HEADER_LINE);
                pw.close();
            } catch (FileNotFoundException e) {
                System.out.println("Unable to write to " + listFileName);
            }
        }
    }

    /**
     * Create a Contact with the given values
     * and append its data to the list.
     * 
     * @param lastName
     * @param firstName
     * @param email
     * @param phoneNumber
     */
    public void addContact(String lastName, String firstName, String email, String phoneNumber) {
        Contact newContact = new Contact(firstName, lastName, email, phoneNumber);
        list.add(newContact);

        // Append new Contact data to listFile
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(listFile, true));
            pw.print(lastName + ",");
            pw.print(firstName + ",");
            pw.print(email + ",");
            pw.println(phoneNumber);
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to write to " + listFile.getName());
        }

        Collections.sort(list); // maintaining list in sorted order
    }

    /**
     * Remove and return the Contact at the given
     * index. Rewrite list file with only the
     * remaining Contacts.
     * Not that if an invalid index is passed in, an
     * IndexOutOfBoundsException will be thrown.
     * NOTE: File rewrite is not yet implemented.
     * 
     * @param index
     * @return removed Contact
     */
    public Contact removeContact(int index) {
        Contact removedContact = list.remove(index);

        // Rewrite listFile so it only contains remaining Contacts
        try {
            PrintWriter pw = new PrintWriter(listFile);
            pw.println(HEADER_LINE);
            for (Contact c : list) {
                pw.print(c.getLastName() + ",");
                pw.print(c.getFirstName() + ",");
                pw.print(c.getEmail() + ",");
                pw.println(c.getPhoneNumber());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to write to " + listFile.getName());
        }

        return removedContact;
    }

    @Override
    public String toString() {
        String str = "Contact List contains " + list.size() + " contacts:\n";
        for (int i = 0; i < list.size(); i++) {
            str += i + " - " + list.get(i).toString() + "\n";
        }
        return str;
    }
}
