package classes;

public class Rating {
    private double note1;
    private double note2;
    private Student stud;
    private Subject sub;    

    public Rating(double note1, double note2, Student stud, Subject sub) {
        this.note1 = note1;
        this.note2 = note2;
        this.stud = stud;
        this.sub = sub;
    }

    public double getNote1() {
        return this.note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return this.note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }

    public Student getStud() {
        return this.stud;
    }

    public void setStud(Student stud) {
        this.stud = stud;
    }

    public Subject getSub() {
        return this.sub;
    }

    public void setSub(Subject sub) {
        this.sub = sub;
    }

    public Rating note1(double note1) {
        this.note1 = note1;
        return this;
    }

    public Rating note2(double note2) {
        this.note2 = note2;
        return this;
    }

    public Rating stud(Student stud) {
        this.stud = stud;
        return this;
    }

    public Rating sub(Subject sub) {
        this.sub = sub;
        return this;
    }
    
    @Override
    public String toString() {
        return "{" +
            " note1='" + getNote1() + "'" +
            ", note2='" + getNote2() + "'" +
            ", stud='" + getStud() + "'" +
            ", sub='" + getSub() + "'" +
            "}";
    }

    
}
