import java.util.Scanner;

class Student_Detail {
    String enrollmentNo;
    String name;
    int semester;
    double cpi;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student_Detail[] students = new Student_Detail[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            students[i] = new Student_Detail();

            System.out.print("Enrollment No: ");
            students[i].enrollmentNo = sc.nextLine();

            System.out.print("Name: ");
            students[i].name = sc.nextLine();

            System.out.print("Semester: ");
            students[i].semester = sc.nextInt();
            sc.nextLine();

            System.out.print("CPI: ");
            students[i].cpi = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("Student Details:");
        for (Student_Detail student : students) {
            System.out.println("Enrollment No: " + student.enrollmentNo);
            System.out.println("Name: " + student.name);
            System.out.println("Semester: " + student.semester);
            System.out.println("CPI: " + student.cpi);
            System.out.println();
        }
    }
}
