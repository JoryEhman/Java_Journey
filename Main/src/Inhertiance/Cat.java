package Inhertiance;

public class Cat extends Animal {
    private String name;
    private int age;
    private String breed;

    Cat(){
        this.name = "cat";
        this.age = 1;
        this.breed = "Tiger";
    }

    Cat(String name, int age, String breed) {
        super("cat", 4, true, true);
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void purring(){
        System.out.println("The cat is purring");
    }

    @Override
    public void print(){
        System.out.println("This is a " + this.type + " with " + this.numLegs + " legs");
        System.out.println("It's name is " + this.name + ", its age is " + this.age);
        System.out.println("It's breed is " + this.breed);
    }
}
