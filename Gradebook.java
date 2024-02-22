import java.sql.Array;
import java.util.ArrayList;

public class Gradebook {
    private ArrayList<String> assignmentList;
    private ArrayList<ArrayList> gradeList;
    private ArrayList<Student> studentList;
    private ArrayList<String> studentNames;
    public Gradebook() {
        assignmentList = new ArrayList<String>();
        gradeList = new ArrayList<ArrayList>();
        studentList = new ArrayList<Student>();
        studentNames = new ArrayList<String>();
    }

    public void createStudent(String name) {
        studentList.add(new Student(name));
        studentNames.add(name);
    }

    public void addAssignment(String assignment) {
        assignmentList.add(assignment);
        gradeList.add(new ArrayList<Double>());
    }

    public void gradeAssignment(String assignment, String studentName, double grade) {
        gradeList.get(assignmentList.indexOf(assignment)).add(grade);
        studentList.get(studentNames.indexOf(studentName)).gradeAssignment(assignment, grade);
    }

    public double getAverageGrade(String assignment) {
        ArrayList<Double> grades = gradeList.get(assignmentList.indexOf(assignment));
        if (grades.size() == 0)
            return -999;
        double i = 0;
        int num = grades.size();
        for (double x : grades) {
            i+=x;
        }
        return i/num;
    }

    public double getMinimumGrade(String assignment) {
        ArrayList<Double> grades = gradeList.get(assignmentList.indexOf(assignment));
        if (grades.size() == 0)
            return -999;
        double i = 0;
        for (double x : grades) {
            if (x < i)
                i = x;
        }
        return i;
    }

    public double getMaximumGrade(String assignment) {
        ArrayList<Double> grades = gradeList.get(assignmentList.indexOf(assignment));
        if (grades.size() == 0)
            return -999;
        double i = 0;
        for (double x : grades) {
            if (x > i)
                i = x;
        }
        return i;
    }

    public double getAverageOverall() {
        double i = 0;
        int num = studentNames.size();
        for (String x : studentNames) {
            i += getStudentsGrade(x);
        }
        return i/num;
    }

    public double getMaxOverall() {
        double i = 0;
        for (String x : studentNames) {
            if (getStudentsGrade(x) > i)
                i = getStudentsGrade(x);
        }
        return i;
    }

    public double getMinOverall() {
        double i = 0;
        for (String x : studentNames) {
            if (getStudentsGrade(x) < i)
                i = getStudentsGrade(x);
        }
        return i;
    }

    public double getStudentsGrade(String studentName) {
        return studentList.get(studentNames.indexOf(studentName)).getOverallGrade();
    }

    public String toString() {
        String toString = "";
        for (String x : studentNames) {
            toString += studentList.get(studentNames.indexOf(x)).toString();
            toString += "\n";
        }
        return toString;
    }//Returns the names of the students and the names of the assignments as a String

    public Student getStudent(String studentName) {
        return studentList.get(studentNames.indexOf(studentName));
    }
}
