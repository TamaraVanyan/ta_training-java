package javaclasses;

import java.time.LocalDate;
import java.util.*;

public class StudentElements {
    public static void main(String args[]) {
        Student[] mainStudents = new Student[5];

        mainStudents[0] = new Student(1415142545, "Mark", "Manukyan", "Armeni",
                LocalDate.parse("1998-12-15"), "Goris", "37491929394", "Math", 2, 530);
        mainStudents[1] = new Student(1425452362, "Gago", "Manukyan", "Anuni",
                LocalDate.parse("1997-05-14"), "Goris", "37491949392", "Math", 2, 570);
        mainStudents[2] = new Student(1131423563, "Ara", "Petrosyan", "Anuni",
                LocalDate.parse("1999-11-25"), "Goris", "37494989565", "Math", 3, 530);
        mainStudents[3] = new Student(1101421161, "Aram", "Poghosyan", "Anuni",
                LocalDate.parse("1996-01-29"), "Erevan", "37494984795", "Economics", 4, 860);
        mainStudents[4] = new Student(1101478161, "Armen", "Poghosyan", "Anuni",
                LocalDate.parse("1995-03-08"), "Erevan", "37496362323", "Economics", 4, 860);

        String facultyToFind = "Math";
        int courseToFind = 2;
        int groupToFind = 530;
        int yearOfBirthToFind = 1997;

        // list of the students in the given faculty
        System.out.println("List of the students from Math " + facultyToFind + ":");
        printStudents(studentsOfFaculty(mainStudents, facultyToFind));

        // list of the students in the given faculty and course

        System.out.println("\nList of the students from " + facultyToFind + " faculty and " + courseToFind + " course:");
        printStudents(studentsOfSoemeFaculty(mainStudents, "Math", courseToFind));

        // list of the students born after the given year
        System.out.println("\nList of the students born after the year " + yearOfBirthToFind + ":");
        printStudents(birthdayStudent(mainStudents, LocalDate.ofEpochDay(yearOfBirthToFind)));

        // list of the students in the given group
        System.out.println("\nList of the students from " + groupToFind + " group:");
        printStudents(groupOfStudent(mainStudents, groupToFind));
    }

    private static List<Student> studentsOfFaculty(Student[] students, String faculty) {
        List<Student> filteredStudents = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            if (faculty.equals(students[i].getFaculty()))
                filteredStudents.add(students[i]);
        }
        return filteredStudents;
    }

    private static List<Student> studentsOfSoemeFaculty(Student[] students, String faculty, int course) {
        List<Student> filteredStudents = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty) && students[i].getCourse() == course)
                filteredStudents.add(students[i]);
        }
        return filteredStudents;
    }

    private static List<Student> birthdayStudent(Student[] students, LocalDate date) {
        List<Student> filteredStudents = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getDate().getYear() > date.getYear())
                filteredStudents.add(students[i]);
        }
        return filteredStudents;
    }

    private static List<Student> groupOfStudent(Student[] students, int group) {
        List<Student> filteredStudents = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup() == group)
                filteredStudents.add(students[i]);
        }
        return filteredStudents;
    }

    private static void printStudents(List<Student> students) {
        for (int i = 0; i < students.size(); i++)
            System.out.println("Full name: " + students.get(i).getName() + " " + students.get(i).getSurname() + ", faculty: " + students.get(i).getFaculty() + ", course: " + students.get(i).getCourse() + ", group: " + students.get(i).getGroup() + ".");
    }
}

