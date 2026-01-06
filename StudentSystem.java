import java.util.Scanner;


class Student {
    String name;
    int age;
    double marks;

    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}


public class StudentSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        double totalMarks = 0;

        // Input data for 3 students
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Marks: ");
            double marks = sc.nextDouble();

            students[i] = new Student(name, age, marks);
            totalMarks += marks;
        }

        double averageMarks = totalMarks / students.length;

        // Formatted Output
        System.out.println("\n--- Student Records ---");
        System.out.printf("%-15s %-10s %-10s%n", "Name", "Age", "Marks");
        System.out.println("-----------------------------------");

        for (Student s : students) {
            System.out.printf("%-15s %-10d %-10.2f%n",
                    s.name, s.age, s.marks);
        }

        System.out.printf("\nAverage Marks: %.2f%n", averageMarks);
        sc.close();
    }
}
