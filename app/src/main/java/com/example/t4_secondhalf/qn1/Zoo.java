package com.example.t4_secondhalf.qn1;

import java.util.*;

public class Zoo {

    private AnimalFactory animalFactory;
    private List<Animal> animalList;

    Zoo(AnimalFactory animalFactory){
        // TODO Complete the constructor
        animalList = new ArrayList<>();
        this.animalFactory = animalFactory;
    }

    public void addAnimal(String type, String name){
        
       // TODO Complete this method
        Animal animal = animalFactory.createAnimal(type, name);
        if(animal != null) {
            animalList.add(animal);
        }


    }

    public String performConcert(){
        // TODO Complete this method
        String concert = "";
        for(Animal animal: animalList){
            concert += animal.makeSound() + "*";
        }
        return concert;
    }

    @Override
    public String toString() {
        // TODO Complete this method 
        return animalList.toString();
    }


}
