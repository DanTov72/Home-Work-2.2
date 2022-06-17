package com.company;

public class Cat extends Animal {
    Integer claw;

    public Cat(String breed, String name, Integer age, Integer claw) {
        super(breed, name, age);
        this.claw = claw;
    }

    @Override
    public void print() {
        System.out.println("Name: "+getName()+"Breed: "+getBreed()+"Age: "+getAge()+"Claw's long: "+claw);
    }
}
