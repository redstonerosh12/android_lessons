package com.example.t4_secondhalf.qn1;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
        animalNoise = "Meow";

    }

    @Override
    public String makeSound(){
         return makeSoundTemplate();
    }

}


