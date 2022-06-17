package com.company;

public class Dog extends Animal {
    Integer teeth;


    public Dog(String breed, String name, Integer age, Integer teeth) {
        super(breed, name, age);
        this.teeth = teeth;
    }

    @Override
    public void print() {
        System.out.println("Name: "+getName()+"Breed: "+getBreed()+"Age: "+getAge()+"Teeth's long: "+teeth);
    }


}
