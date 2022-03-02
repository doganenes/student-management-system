package studentApp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private static String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 500;
    private static int id = 1000;

    /**
     * Constructor: prompt user to enter student's name and year
     */
    public Student() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = scan.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = scan.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
        this.gradeYear = scan.nextInt();
        setStudentID(); // called setStudentID() method.
    }

    /**
     * Generate an ID
     *
     * @return ID
     */
    private String setStudentID() {

        id++;
        this.studentID = gradeYear + "" + id;
        return studentID; // studentID must be String

    }


    /**
     * Enroll in courses
     */
    public void enroll() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter course to enroll. (Q or q to quit.)");
            String course = scanner.nextLine();

            if (!course.equals("Q") && !course.equals("q")) {

                courses += "\n" + course;
                tuitionBalance += costOfCourse;
            } else {
                break; // end the loop
            }
        } while (true);

    }

    /**
     * View Balance
     */
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    /**
     * Pay tuition
     */
    public void payTuition() {
        viewBalance();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your payment: $");
        int payment = scan.nextInt();

        if (tuitionBalance >= payment) {
            tuitionBalance -= payment;
            System.out.println("Thank you for payment of: $" + payment);
        } else {
            System.out.println("***** Remaining mustn't less than zero. *****");
        }

        viewBalance(); // showing remaining tuition balance

    }

    /**
     * @return show status (overriding default toString() method.)
     */
    public String toString() {

        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentID +
                "\nCourses enrolled: " + courses + "\nBalance: " + tuitionBalance;
    }

}
