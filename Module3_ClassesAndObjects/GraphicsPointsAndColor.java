import java.awt.Color;
import java.awt.Point;

/**
 * Demo Point and Color classes used in MiniFig activity.
 * @author mvail
 */
public class GraphicsPointsAndColor {
    public static void main(String[] args) {
        //instantiate/construct a new Point with x 10 and y 20 values
        Point p1 = new Point(10, 20); 

        //display the String returned from the Point's toString() method
        System.out.println("My point: " + p1.toString());
        //display the value of the Point's x value
        // (sadly, accessible directly, without any getter method)
        System.out.println("My point's x: " + p1.x);

        //instantiate a new Color with red 255, green 45, and blue 55
        // (so full red, near 18% green, and 21% blue)
        Color c1 = new Color(255, 45, 55);
        //display the String returned from the Color's toString() method
        System.out.println("My color: " + c1.toString());
    }
}
