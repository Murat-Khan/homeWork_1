import java.util.Random;

public class Animal {
    private String name;
    private String breed;
    private int age;
    private Color color;

    public Animal(String name, String breed, int age, Color color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public String showData() {
        return "Name: " + name +
                "\nBreed: " + breed +
                "\nAge: " + age +
                "\nColor: " + color;
    }




}