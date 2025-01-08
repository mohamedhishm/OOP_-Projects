package UMS;

import java.util.Scanner;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for the first course (OfflineCourse):");
        System.out.print("Course Name: ");
        String courseName1 = scanner.nextLine();
        System.out.print("Course Code: ");
        String courseCode1 = scanner.nextLine();
        System.out.print("Amount : ");
        int duration1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Location: ");
        String location1 = scanner.nextLine();
        Course c1 = new OfflineCourse(courseName1, courseCode1, duration1, location1);

        ////////////////////////

        System.out.println("\nEnter details for the second course (OnlineCourse):");
        System.out.print("Course Name: ");
        String courseName2 = scanner.nextLine();
        System.out.print("Course Code: ");
        String courseCode2 = scanner.nextLine();
        System.out.print("Amount : ");
        int duration2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Schedule: ");
        String schedule2 = scanner.nextLine();
        Course c2 = new OnlineCourse(courseName2, courseCode2, duration2, schedule2);

        ////////////////

        System.out.println("\nEnter student details:");
        System.out.print("Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Student Address: ");
        String studentAddress = scanner.nextLine();
        System.out.print("Student Major: ");
        String studentMajor = scanner.nextLine();
        Student student = new Student(studentId, studentName, studentAddress, studentMajor);

////////////////////

        System.out.println("\nEnter faculty details:");
        System.out.print("Faculty University: ");
        String facultyUniversity = scanner.nextLine();
        System.out.print("Faculty Location: ");
        String facultyDepartment = scanner.nextLine();
        System.out.print("Faculty Department: ");
        String facultySpecialization = scanner.nextLine();
        Faculty faculty = new Faculty(facultyUniversity, facultyDepartment, facultySpecialization);

        // ////////////////
        System.out.println("\nEnter instructor details:");
        System.out.print("Instructor Name: ");
        String instructorName = scanner.nextLine();
        System.out.print("Instructor Specialization: ");
        String instructorSpecialization = scanner.nextLine();
        Instructor instructor = new Instructor(instructorName, instructorSpecialization);

        //////////////////////////
        System.out.println("\nCourse Details (1):");
        c1.printDetails();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nCourse Details (2):");
        c2.printDetails();
        System.out.println("-----------------------------------------------------------------------------------------");

        student.printDetails();
        System.out.println("-----------------------------------------------------------------------------------------");

        faculty.printDetails();
        System.out.println("-----------------------------------------------------------------------------------------");

        instructor.Details();
        System.out.println("-----------------------------------------------------------------------------------------");

        scanner.close();
    }
}



/*

package UMS;

public class UniversityManagementSystem {
    public static void main(String[] args) {


        Course c1 = new OfflineCourse("Introduction to Programming", "IP101", 300, "Room 205, Main Building");
        Course c2 = new OnlineCourse("Introduction to AI", "AI202", 200, "4:00 PM - 8:00 PM");

        Student student = new Student(231013063, "Mohamed Hisham", "322 Sporting St, Alex", "IS");
        Faculty faculty = new Faculty("AAST", "Abo Quir", "Computer Science");

        Instructor instructor = new Instructor("Dr. Omar", "Artificial Intelligence");

        System.out.println("\nCourse Details (1):\n");
        c1.printDetails();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nCourse Details (2):\n");
        c2.printDetails();
        System.out.println("-----------------------------------------------------------------------------------------");

        student.printDetails();
        System.out.println("-----------------------------------------------------------------------------------------");

        faculty.printDetails();
        System.out.println("-----------------------------------------------------------------------------------------");

        instructor.Details();
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}*/



