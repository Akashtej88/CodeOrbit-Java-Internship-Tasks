import java.util.ArrayList;
import java.util.Scanner;

// Stores student names and marks, then prints a summary report.
public class StudentGradeManagement {
    static class Student {
        String name;
        double marks;

        Student(String name, double marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("How many students do you want to enter? ");
        int count;

        try {
            count = Integer.parseInt(sc.nextLine().trim());
            if (count <= 0) {
                System.out.println("Please enter a number greater than zero.");
                sc.close();
                return;
            }

            for (int i = 0; i < count; i++) {
                System.out.println("\\nStudent " + (i + 1));

                System.out.print("Enter name: ");
                String name = sc.nextLine().trim();
                if (name.isEmpty()) {
                    name = "Student " + (i + 1);
                }

                System.out.print("Enter marks (0-100): ");
                double marks = Double.parseDouble(sc.nextLine().trim());

                if (marks < 0 || marks > 100) {
                    System.out.println("Marks must be between 0 and 100. Try this student again.");
                    i--;
                    continue;
                }

                students.add(new Student(name, marks));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered. Please run the program again.");
            sc.close();
            return;
        }

        double total = 0;
        double highest = students.get(0).marks;
        double lowest = students.get(0).marks;
        Student topStudent = students.get(0);
        Student lowStudent = students.get(0);

        for (Student student : students) {
            total += student.marks;

            if (student.marks > highest) {
                highest = student.marks;
                topStudent = student;
            }
            if (student.marks < lowest) {
                lowest = student.marks;
                lowStudent = student;
            }
        }

        double average = total / students.size();

        System.out.println("\\n========== STUDENT SUMMARY REPORT ==========");
        System.out.printf("%-22s %s%n", "Student Name", "Marks");
        System.out.println("--------------------------------------------");
        for (Student student : students) {
            System.out.printf("%-22s %.2f%n", student.name, student.marks);
        }
        System.out.println("--------------------------------------------");
        System.out.printf("Average marks : %.2f%n", average);
        System.out.printf("Highest marks : %.2f (%s)%n", highest, topStudent.name);
        System.out.printf("Lowest marks  : %.2f (%s)%n", lowest, lowStudent.name);
        System.out.println("============================================");

        sc.close();
    }
}
