package com.company;
public class Main {
    public static void main(String[] args) {
        Dog dog = (Dog) createNewObject("com.company.Dog");
        dog.print();
        System.out.println("---------------------------");
        Cat cat = (Cat) createNewObject("com.company.Cat");
        cat.print();
        System.out.println("---------------------------");
        Cow cow = (Cow) createNewObject("com.company.Cow");
        cow.print();
    }

    public static Animal createNewObject(String className) {

        Dog dog = new Dog("Sheepdog", "Smoke", 5, 1);

        Cat cat = new Cat("Siamese", "Baby", 2, 2);

        Cow cow = new Cow("Scottish", "Byrenka", 10, 5);
        if (className == "com.company.Dog") {
            return dog;
        } else if (className == "com.company.Cat") {
            return cat;
        } else {
            return cow;
        }

    }
}
