package StudentPck;

import java.util.LinkedList;

public class Student{
    public static void main(String[] args) {
        LinkedList<Studentretrive> studentList = new LinkedList<>();

        // Create three student objects
        Studentretrive student1 = new Studentretrive("John", 80.5f);
        Studentretrive student2 = new Studentretrive("Alice", 90.2f);
        Studentretrive student3 = new Studentretrive("Bob", 75.8f);

        // Add the students to the linked list
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        float gradeThreshold = 80.0f;
        LinkedList<Studentretrive> studentsAboveThreshold = retrieveStudents(studentList, gradeThreshold);

        System.out.println("Students with grades above " + gradeThreshold + ":");
        for (Studentretrive student : studentsAboveThreshold) {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade());
        }
    }

    public static LinkedList<Studentretrive> retrieveStudents(LinkedList<Studentretrive> studentList, float gradeThreshold) {
        LinkedList<Studentretrive> studentsAboveThreshold = new LinkedList<>();

        for (Studentretrive student : studentList) {
            if (student.getGrade() > gradeThreshold) {
                studentsAboveThreshold.add(student);
            }
        }

        return studentsAboveThreshold;
    }
}

Output:
Students with grades above 80.0:
Name: John, Grade: 80.5
Name: Alice, Grade: 90.2

