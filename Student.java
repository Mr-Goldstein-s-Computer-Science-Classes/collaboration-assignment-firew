import java.util.ArrayList;
public class Student {
    private String name;
    public Student(String name) {
        this.name = "null";
    }

    public void addAssignment(String assignName) {
        ArrayList<String> unGraded = new ArrayList<>();
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
