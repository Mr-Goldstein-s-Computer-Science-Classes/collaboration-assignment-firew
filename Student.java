import java.util.ArrayList;
public class Student {
    private String name;
    ArrayList<String> unGraded = new ArrayList<>();
    public Student(String name) {
        this.name = "null";
    }

    public void addAssignment(String assignName) {
        unGraded.add(assignName);

    }

    public void gradeAssignment(String assignment, double grade) {
        
    }

    public double getAssignmentGrade(String assignment) {

    }

    public double getOverallGrade() {

    }

    public String toString() {

    }
}
