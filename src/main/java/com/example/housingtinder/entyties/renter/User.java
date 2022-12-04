package com.example.housingtinder.entyties.renter;

public class User {
    private String name;
    private int age;
    private String gender;
    private int adult_count;
    private int child_count;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public User(String name, int age, String gender, int adult_count, int child_count, String description, String image) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.adult_count = adult_count;
        this.child_count = child_count;
        this.description = description;
        this.image = image;
    }

    public User() {
    }

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAdult_count() {
        return adult_count;
    }

    public void setAdult_count(int adult_count) {
        this.adult_count = adult_count;
    }

    public int getChild_count() {
        return child_count;
    }

    public void setChild_count(int child_count) {
        this.child_count = child_count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
