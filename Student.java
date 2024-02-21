import java.util.ArrayList;
public class Student {
    private String name;
    private String assignName;
    ArrayList<String> unGraded = new ArrayList<>();
    ArrayList<String> graded = new ArrayList<>();
    public Student(String name) {
        this.name = "null";
    }

    public void addAssignment(String assignName) {
        unGraded.add(assignName);

    }

    public void gradeAssignment(String assignment, double grade) {
        unGraded.remove(assignment);
        graded.add(assignment);

    }

    public double getAssignmentGrade(String assignment) {

    }

    public double getOverallGrade() {

    }

    public String toString() {

    }
}
