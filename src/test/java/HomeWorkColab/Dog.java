
package HomeWorkColab;

import java.util.ArrayList;
import java.util.Arrays;

public class Dog {

    //dog attributes
    public String name;
    public String breed;
    public int age;
    public String size;
    public String color;
    public String gender;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setInfo("Pizza", "Mut", 6, "Large", "Black n Brown", "Male");

        Dog dog2 = new Dog();
        dog2.setInfo("Calculus", "German Short-hair", 7, "Medium", "Black Grey", "Male");

        Dog dog3 = new Dog();
        dog3.setInfo("Winner", "Husky", 13, "Large", "White", "Male");

        Dog dog4 = new Dog();
        dog4.setInfo("Puppy", "Golden Lab", 8, "Large", "White-Yellow", "Male");

        Dog dog5 = new Dog();
        dog5.setInfo("Maggie", "Blue Heeler", 6, "Medium", "Black with white paws", "Female");

        Dog dog6 = new Dog();
        dog6.setInfo("Chunklin", "Pit-Rot-Blood Mix", 8, "Large", "Black n' Brown", "Male");

        Dog dog7 = new Dog();
        dog7.setInfo("Keeper", "Husky", 3, "Large", "White n' Black", "Female");

        Dog dog8 = new Dog();
        dog8.setInfo("Neptune", "Husky", 13, "Large", "Brown", "Female");

        Dog dog9 = new Dog();
        dog9.setInfo("Brutis", "Lassie Dog", 10, "Medium", "White Brown Black", "Male");

        Dog dog10 = new Dog();
        dog10.setInfo("Hiro", "Shiba-Inu", 8, "Small", "White", "Male");



        ArrayList<Dog> dogs = new ArrayList<>(Arrays.asList(dog1,dog2,dog3,dog4,dog5,dog6,dog7,dog8,dog9,dog10));
        dogs.removeIf(p -> p.breed !="Husky");

        for(Dog each : dogs){
            each.getInfo();
        }


    }


    //set info
    public void setInfo(String dogName, String dogBreed, int dogAge, String dogSize, String dogColor,
                        String dogGender){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        size = dogSize;
        color = dogColor;
        gender = dogGender;
    }

    //get info
    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("breed = " + breed);
        System.out.println("age = " + age);
        System.out.println("size = " + size);
        System.out.println("color = " + color);
        System.out.println("gender = " + gender);
    }
    //remove if


}
