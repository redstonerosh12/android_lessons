package com.example.homework3A.qn1;

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


