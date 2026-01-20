/**
 * Example code that expects a String for name, an int for age,
 * and a boolean for interest in this example.
 * @author mvail
 */
public class CmdLineValidation {
    public static void main(String[] args) {
        if (args.length != 3) { //correct number of expected args?
            printUsage();
            return;
        }
        String name = args[0];
        int age;
        try {
            age = Integer.parseInt(args[1]); //is it an integer as expected?
        } catch (NumberFormatException e) {
            printUsage();
            return;
        }
        boolean interested;
        if (args[2].equals("true") || args[2].equals("false")) {
            interested = Boolean.parseBoolean(args[2]); //returns true if String is "true", else false
        } else {
            printUsage();
            return;
        }
        
        //after validation, I can do whatever the program wanted
        System.out.println("What? " + name + " is " + age + "?!? It is " + interested + " you are interested.");
        
    }

    /** Print usage message to the console. */
    private static void printUsage() {
        System.out.println("Usage: java CmdLineValidation [name] [age] [interest (true/false)]");
    }
}
