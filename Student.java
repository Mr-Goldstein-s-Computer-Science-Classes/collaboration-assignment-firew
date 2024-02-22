import java.util.ArrayList;
public class Student {
    private String name;
    private String assignName;
    ArrayList<String> unGraded = new ArrayList<>();
    ArrayList<String> gradedAssignments = new ArrayList<>();
    ArrayList<Double> grades = new ArrayList<>();
    public Student(String name) {
        this.name = "null";
    }

    private String getAssignName() {
        return assignName;
    }

    private void setAssignName() {
        this.assignName = assignName;
    }

    public void addAssignment(String assignName) {
        unGraded.add(assignName);

    }

    public void gradeAssignment(String assignment, double grade) {
        unGraded.remove(assignment);
        gradedAssignments.add(assignment);
        grades.add(grade);
        grades.set(gradedAssignments.indexOf(assignment), grade);

    }

    public double getAssignmentGrade(String assignment) {
        return grades.get();
    }

    public double getOverallGrade() {
        double overallGrade = 0.0;

    }

    public String toString() {

    }
}
