import java.util.ArrayList;

/**
 * Collects Courses
 * @author mvail
 */
public class CourseCatalog {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<Course>();
        
        courses.add( new Course("CS", 121, "Fall 2025") );
        courses.add( new Course("CS", 221, "Fall 2025"));
        courses.add( new Course("MATH", 170, "Fall 2025"));

        courses.get(0).addStudent("Bill Higgins");
        courses.get(0).addStudent("Lucy Smith");
        courses.get(0).setInstructor("Mason Vail");

        for (Course c : courses) { //for each Course in courses list
            System.out.println(c);
            System.out.println();
        }
    }
}
