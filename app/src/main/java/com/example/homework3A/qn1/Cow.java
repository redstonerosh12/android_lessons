package com.example.homework3A.qn1;
public class Cow extends Animal{
    public Cow(String name) {
        super(name);
        animalNoise = "Moo Moo";
    }

    @Override
    public String makeSound(){
        return makeSoundTemplate();
    }


}
