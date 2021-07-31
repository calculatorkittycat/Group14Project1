
package HomeWorkColab;

public class Dog {

    //dog attributes
    public String name;
    public String breed;
    public int age;
    public String size;
    public String color;
    public String gender;

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
}
