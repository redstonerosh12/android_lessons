package com.example.t4_secondhalf.qn1;

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
