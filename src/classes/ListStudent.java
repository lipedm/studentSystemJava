package classes;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {

    List<Student> students;

    public ListStudent() {
        students = new ArrayList<>();
    }

    public Student getStudent(int code) {
        for (Student obj : students) {
            if (obj.getCode() == code) {
                System.out.println("Value: " + obj.toString());
                return obj;
            }
        }
        return null;
    }

    public void printStudents() {
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).toString());
        }
    }

    public void setStudent(Student e) {
        students.add(e);
    }

}
