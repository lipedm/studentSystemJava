package classes;

import java.util.ArrayList;
import java.util.List;

public class ListSubject {
    
    List<Subject> subject;

    public ListSubject(){
        subject = new ArrayList<>();
    }

    public Subject getSubject(int code) {
        for (Subject obj : subject) {
            if (obj.getCode() == code) {
                System.out.println("Value: " + obj.toString());
                return obj;
            }
        }
        return null;
    }

    public void printSubjects() {
        for (int i = 0; i < subject.size(); i++){
            System.out.println(subject.get(i).toString());
        }
    }

    public void setSubject(Subject e) {
        subject.add(e);
    }    
}
