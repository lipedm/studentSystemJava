package tests;
import main.Student;

public class TestStudent {

    public static void main(String[] args) {

        Student student1 =  new Student(11,"João");
        Student student2 =  new Student(12,"Mário");
        Student student3 =  new Student(13,"Vanessa");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        
    }
    
}
