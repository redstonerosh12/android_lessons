// TODO Complete this 
package com.example.homework3A.qn1;

//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;
//import java.util.HashMap;
//import java.util.Map;

public class FarmFactory implements AnimalFactory{



    public Animal createAnimal(String type, String name) {
        switch (type) {
            case "Cat":
                return new Cat(name);
            case "Dog":
                return new Dog(name);
            case "Cow":
                return new Cow(name);
            default:
                return null;
        }

    }
}


//    private Map<String, Class<? extends Animal>> animalClasses = new HashMap<>();
//
//    {
//        animalClasses.put("Cat", Cat.class);
//        animalClasses.put("Dog", Dog.class);
//        animalClasses.put("Cow", Cow.class);
//    }
//
//    @Override
//    public Animal createAnimal(String type, String name) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
//        Class<? extends Animal> animalClass = animalClasses.get(type);
//        Constructor<? extends Animal> constructor = animalClass.getDeclaredConstructor(String.class);
//
//        if(animalClass != null){
//            return animalClass.getConstructor(String.class).newInstance(name);
//        }
//        else{
//            return null;
//        }
//
//
//    }
