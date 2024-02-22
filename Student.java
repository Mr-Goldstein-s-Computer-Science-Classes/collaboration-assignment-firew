import java.util.ArrayList;
public class Student {
    private String name;
    private String assignName;
    ArrayList<String> unGraded = new ArrayList<>();
    ArrayList<String> gradedAssignments = new ArrayList<>();
    ArrayList<Double> grades = new ArrayList<>();
    public Student(String name) {
        this.name = name;
    }

    private String getAssignName() {
        return assignName;
    }

    private void setAssignName() {
        this.assignName = assignName;
    }

    private double getGradesSize() {
        return grades.size();
    }

    public void addAssignment(String assignName) {
        unGraded.add(assignName);

    }

    public void gradeAssignment(String assignment, double grade) {
        unGraded.remove(assignment);
        gradedAssignments.add(assignment);
        grades.add(grade);

    }

    public double getAssignmentGrade(String assignment) {
        return grades.get(gradedAssignments.indexOf(assignment));
    }

    public double getOverallGrade() {
        double overallGrade = 0.0;
        for(double g : grades) {
            overallGrade += g;
        }
        overallGrade /= getGradesSize();
        return overallGrade;
    }

    public String toString() {
        return "Name: " + name + " Overall Grade: " + getOverallGrade();
    }
}
