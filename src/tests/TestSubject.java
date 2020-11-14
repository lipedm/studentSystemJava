package tests;
import main.Subject;

public class TestSubject {
    public static void main(String[] args) {

        Subject subject1 =  new Subject(1,"Mátematica");
        Subject subject2 =  new Subject(2,"Portugues");
        Subject subject3 =  new Subject(3,"Física");

        System.out.println(subject1.toString());
        System.out.println(subject2.toString());
        System.out.println(subject3.toString());

        
    }
    
}
