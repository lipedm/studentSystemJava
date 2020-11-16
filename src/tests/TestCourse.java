package tests;

import classes.Course;
import classes.Rating;
import classes.Student;
import classes.Subject;

public class TestCourse {

    public static void main(String[] args) {


        Student a1 = new Student(30,"felipe");
        Subject d1 =  new Subject(100,"prog OO");
        Rating r1 = new Rating(3, 4, a1, d1);        
        Course c1 = new Course();
        c1.setRating(r1);

        System.out.println( c1.toString());

    }
}