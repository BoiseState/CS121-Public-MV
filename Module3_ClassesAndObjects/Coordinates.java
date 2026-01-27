import java.awt.Point;

/**
 * Demonstrates how to use the Point object.
 * @author CS121 instructors
 */
public class Coordinates
{
    public static void main(String[] args)
    {
        // Declare and instantiate object
        Point origin = new Point(10, 20);
        // 'origin' is an 'object reference' to a Point.
        // 'new Point(10,20)' calls the Point constructor
        //   and 'instantiates', or creates, a Point
        //   object with x=10 and y=20

        // Invoke getX method and store result
        double x = origin.getX();
        // Using the 'dot operator' to call the
        //   'getX()' method of the Point object
        //   at the other end of the 'origin'
        //   object reference.
        // 'getX()' returns its answer as a double,
        //   so we are storing the return value in
        //   a double variable.

        // Print the x coordinate
        System.out.println("Origin X: " + x);
        // Notice the dots in the println() statement.
        // 'System.out' is an object connected to the
        //   console/terminal. 'System' is an object
        //   roughly representing the operating system and
        //   'out' is a sub-object representing the console.
        // 'println()' is a method belonging to System.out.
        // Whatever String we 'pass' into the method in the
        //   parentheses is what println() will write to the
        //   console. The type of values a method expects
        //   are called its 'formal parameters' and the values
        //   we pass in to assign to those parameters are
        //   called 'arguments'.

        // Set origin (x,y) to (0,0)
        origin.setLocation(0, 0);

        // Get a String describing origin
        System.out.println(origin.toString()); 

    }
}
