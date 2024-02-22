public class Main {
    public static void main(String[] args) {
        Gradebook grades = new Gradebook();
        grades.createStudent("Tyler");
        grades.createStudent("James");
        grades.createStudent("Ethan");
        grades.createStudent("Scotty");
        grades.createStudent("David");
        grades.createStudent("Patrick");

        grades.addAssignment("Stacks and Queues Station Activity");
        grades.addAssignment("Stacks and queues programs");
        grades.addAssignment("Stacks and queues quiz");
        grades.addAssignment("Github Exploration");

        grades.gradeAssignment("Stacks and Queues Station Activity", "Tyler", 94.0);
        grades.gradeAssignment("Stacks and Queues Station Activity", "James", 14.0);
        grades.gradeAssignment("Stacks and Queues Station Activity", "Ethan", 5.0);
        grades.gradeAssignment("Stacks and Queues Station Activity", "Scotty", 100.0);
        grades.gradeAssignment("Stacks and Queues Station Activity", "David", 0.0);
        grades.gradeAssignment("Stacks and Queues Station Activity", "Patrick", 79.0);

        grades.gradeAssignment("Stacks and queues programs", "Tyler", 100.0);
        grades.gradeAssignment("Stacks and queues programs", "James", 64.0);
        grades.gradeAssignment("Stacks and queues programs", "Ethan", 100.0);
        grades.gradeAssignment("Stacks and queues programs", "Scotty", 101.0);
        grades.gradeAssignment("Stacks and queues programs", "David", 26.0);
        grades.gradeAssignment("Stacks and queues programs", "Patrick", 99.0);

        grades.gradeAssignment("Stacks and queues quiz", "Tyler", 100.0);
        grades.gradeAssignment("Stacks and queues quiz", "James", 100.0);
        grades.gradeAssignment("Stacks and queues quiz", "Ethan", 100.0);
        grades.gradeAssignment("Stacks and queues quiz", "Scotty", 87.0);
        grades.gradeAssignment("Stacks and queues quiz", "David", 92.0);
        grades.gradeAssignment("Stacks and queues quiz", "Patrick", 83.0);
    }
}
