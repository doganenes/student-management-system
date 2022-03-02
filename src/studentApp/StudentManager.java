package studentApp;

import java.util.Scanner;

public class StudentManager {

    public static void main(String[] args) {

        // Ask how many students we want to add.
        System.out.println("Enter number of new students to enroll: ");
        Scanner scan = new Scanner(System.in);
        int numOfStudents = scan.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students with for loop.
        for (int n = 0; n < numOfStudents; n++) {
            System.out.println();
            students[n] = new Student(); // create reference value with loop.
            students[n].enroll();
            students[n].payTuition();

        }

        // print toString for each students.
        for (int n = 0; n < numOfStudents; n++) {
            System.out.println();
            System.out.println(students[n].toString());
        }

    }

}
