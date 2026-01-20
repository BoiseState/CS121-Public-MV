/**
 * Demo taking in and validating command line arguments.
 * @author mvail
 */
public class CmdLineDemo {
    public static void main(String[] args) {
        //When expecting command line arguments, you should always validate
        // that you got what you needed. If not, you should report what was
        // expected with a "usage" statement and exit.
        if (args.length != 2) {
            System.out.println("Usage: java CmdLnDemo age name");
            System.out.println("where age is an integer and name is a string.");
            return; //ends main()
        }

        //Let's just repeat back ("echo") the command line arguments.
        for (String arg : args) { //or for loop with 0 to args.length-1 indexes
            System.out.println(arg);
        }

        //Use wrapper class parse methods to convert command line arg Strings to
        // primitive data types.
        int age = Integer.parseInt(args[0]); //convert String to int
        String name = args[1]; //no conversion needed for Strings

        System.out.println("Oh, my word! " + name + " is " + age + " years old!?!");
    }
}
