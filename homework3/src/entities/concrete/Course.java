package entities.concrete;

import java.time.LocalDate;

public class Course  {
    private int id;
    private String name;
    private String category;
    private String instructor;
    private int price;


    public Course() {
    }

    public Course(int id, String name, String category, String instructor, int price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.instructor = instructor;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
