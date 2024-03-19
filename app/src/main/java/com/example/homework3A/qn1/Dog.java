package com.example.homework3A.qn1;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
        animalNoise = "Woof";
    }

    @Override
    public String makeSound(){
        return makeSoundTemplate();
    }
}
