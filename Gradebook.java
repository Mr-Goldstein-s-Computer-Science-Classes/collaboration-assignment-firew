import java.sql.Array;
import java.util.ArrayList;

public class Gradebook {
    private ArrayList<String> assignmentList;
    private ArrayList<Double> gradeList;
    private ArrayList<Student> studentList;
    public Gradebook() {
        assignmentList = new ArrayList<String>();
        gradeList = new ArrayList<Double>();
        studentList = new ArrayList<Student>();
    }

    public void createStudent(String name) {
        studentList.add(new Student(name));
    }

    public void addAssignment(String assignment) {

    }

    public void gradeAssignment(String assignment, String studentName, double grade) {

    }

    public double getAverageGrade(String assignment) {

    }

    public double getMinimumGrade(String assignment) {

    }

    public double getMaximumGrade(String assignment) {

    }

    public double getAverageOverall() {

    }

    public double getMaxOverall() {

    }

    public double getMinOverall() {

    }

    public double getStudentsGrade() {

    }

    public String toString() {

    }//Returns the names of the students and the names of the assignments as a String

    public Student getStudent(String studentName) {

    }
}
