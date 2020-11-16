package classes;

import java.util.ArrayList;
import java.util.List;

public class Course {
    List<Rating> ratings;

    public Course() {
        ratings = new ArrayList<>();
    }

    public Course(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Rating> getRatings() {
        return this.ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public Course ratings(List<Rating> ratings) {
        this.ratings = ratings;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " ratings='" + getRatings() + "'" +
            "}";
    }

}
