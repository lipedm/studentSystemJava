package tests;


import classes.Scan;
import classes.Student;

import classes.ListStudent;
// import classes.ListSubject;
// import classes.Rating;
// import classes.Course;
// import classes.Subject;
// import java.util.Scanner;
public class TestStudent {

    public static void main(String[] args) {

        // Scan scan = new Scan();
        // Student student1 = new Student(scan.inInt("Insira o Código do
        // Aluno:"),scan.inString("Insira o nome do Aluno:"));
        // Student student1 = new Student(11,"João");
        // Student student2 = new Student(12,"Mário");
        // Student student3 = new Student(13,"Vanessa");

        // System.out.println(student1.toString());
        // // System.out.println(student2.toString());
        // System.out.println(student3.toString());

        Scan scan = new Scan();
        ListStudent liststud = new ListStudent();
        Student student = new Student(scan.inInt("Insira o Código do Aluno:"),
                scan.inString("Insira o nome do Aluno:"));
        liststud.setStudent(student);
        liststud.getStudent(10);

    }

}
