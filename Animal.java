package com.company;

public abstract class Animal implements Printable {
    private String breed;
    private String name;
    private Integer age;

    public Animal(String breed, String name, Integer age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
