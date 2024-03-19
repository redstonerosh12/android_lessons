package com.example.t4_secondhalf.qn1;
import java.util.Objects;

public abstract class Animal {
    protected String animalNoise = "null";
    private String name;

    Animal(String name){
        this.name = name;
    }

    public String getName() {return this.getClass().getSimpleName() + ":" + name; }

    public abstract String makeSound();

    protected String makeSoundTemplate(){
        return getName() + " says " + animalNoise;
    }
    
    // override toString(), equals() and hashCode()
    @Override
    public String toString(){
        return getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;

        return getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}