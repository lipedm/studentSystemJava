package tests;

import classes.Rating;
import classes.Student;
import classes.Subject;

public class TestRating {
    public static void main(String[] args) {
        Student a1 = new Student(30,"felipe");
        Subject d1 =  new Subject(100,"Matematica");
        Rating rating = new Rating(3, 4, a1, d1);

        System.out.println( rating.toString());
    }
}
