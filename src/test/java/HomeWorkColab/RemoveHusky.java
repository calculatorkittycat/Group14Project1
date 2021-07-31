package HomeWorkColab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveHusky {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setInfo("Pizza","Mut",6,"Large","Black n Brown","Male");

        Dog dog2 = new Dog();
        dog2.setInfo("Calculus","German Short-hair",7,"Medium","Black Grey", "Male");

        Dog dog3 = new Dog();
        dog3.setInfo("Winner","Husky",13,"Large","White","Male");

        Dog dog4 = new Dog();
        dog4.setInfo("Puppy","Golden Lab",8,"Large","White-Yellow","Male");

        Dog dog5 = new Dog();
        dog5.setInfo("Maggie","Blue Heeler",6,"Medium","Black with white paws","Female");

        Dog dog6 = new Dog();
        dog6.setInfo("Chunklin","Pit-Rot-Blood Mix", 8,"Large","Black n' Brown","Male");

        Dog dog7 = new Dog();
        dog7.setInfo("Keeper","Husky",3,"Large","White n' Black","Female");

        Dog dog8 = new Dog();
        dog8.setInfo("Neptune","Husky",13,"Large","Brown","Female");

        Dog dog9 = new Dog();
        dog9.setInfo("Brutis","Lassie Dog",10,"Medium","White Brown Black","Male");

        Dog dog10 = new Dog();
        dog10.setInfo("Hiro","Shiba-Inu",8,"Small","White","Male");


        //Array List
        ArrayList<Object> dogs = new ArrayList<>();
        dogs.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5,dog6,dog7,dog8,dog9,dog10));


        //Collections.replaceAll(dogs,"Husky","");








    }


}
