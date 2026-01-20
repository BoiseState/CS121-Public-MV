import java.io.File;
import java.util.ArrayList;

/**
 * Represents one course in college.
 * @author mvail
 */
public class Course {
    //instance variables
    private String departmentCode;
    private int courseNumber;
    private int sectionNumber;
    private String semester;
    private File syllabus;
    private String instructorName;
    private ArrayList<String> enrolledStudents;
    //and more  

    //shared class constants
    private static final int MAX_ENROLLMENT = 50;

    //constructor(s)

    /**
     * Initialize a new course
     * @param departmentCode
     * @param courseNumber
     * @param semester
     */
    public Course( String departmentCode, int courseNumber, String semester ) {
        this.departmentCode = departmentCode;
        this.courseNumber = courseNumber;
        this.semester = semester;
        syllabus = null; //don't have a "default" syllabus valid for all courses
        instructorName = null; //no "default" instructor
        enrolledStudents = new ArrayList<String>(); //empty list, ready for enrollment
    }

    //getters/setters

    public String getDepartmentCode() { //getters don't usually have parameters
        return departmentCode;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    //etc.

    /**
     * Update syllabus
     * @param file new syllabus file
     */
    public void setSyllabus( File file ) {
        this.syllabus = file; //replaces old syllabus with new syllabus
    }

    /**
     * Update instructor
     * @param instructorName
     */
    public void setInstructor( String instructorName ) {
        this.instructorName = instructorName; //replaces instructor
    }

    /**
     * Add given student to enrolled students list
     * @param studentName
     */
    public void addStudent( String studentName ) {
        enrolledStudents.add(studentName);
    }

    /**
     * Remove the student with given name.
     * @param studentName
     * @return true if successful, else false
     */
    public boolean removeStudent( String studentName ) {
        if (enrolledStudents.contains(studentName)) {
            enrolledStudents.remove(studentName); //can remove that student
            return true;
        } else {
            return false; //can't remove that student
        }
    }

    //toString()
    public String toString() {
        String str = "Course: " + departmentCode + " " + courseNumber + "\n"
            + "Instructor: " + instructorName + "\n"
            + "Enrollment: " + enrolledStudents.size();
        return str;
    }

}
