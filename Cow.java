package com.company;

import com.company.Animal;

public class Cow extends Animal {
    Integer horns;

    public Cow(String breed, String name, Integer age, Integer horns) {
        super(breed, name, age);
        this.horns = horns;
    }

    @Override
    public void print() {

        System.out.println("Name: "+getName()+"Breed: "+getBreed()+"Age: "+getAge()+"Horns long: "+horns);
    }


}
