/**
 * Reports the command line arguments passed in to main(), where the number
 * of arguments is not known in advance.
 * @author mvail
 */
public class CmdLineEcho {
    public static void main(String[] args) {
        System.out.println("These are your " + args.length + " command line arguments:");
        for(int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }
        //OR
        // for (String arg : args) {
        //     System.out.println(arg);
        // }
    }
}
