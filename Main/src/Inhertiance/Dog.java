package Inhertiance;

class Dog extends Animal {
     private String name;
     private int age;
     private String breed;

    Dog(){
        this.type = "Dog";
        this.name = "Default Name";
        this.age = 1;
        numLegs = 4;
        isMammal = true;
        hasTail = true;
    }

    Dog(String name, int age, String breed){
        super("dog", 4, true, true);
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void bark(){
        System.out.println("This + " + this.type + " is barking...");
    }

    public void sit(){
        System.out.println("This + " + this.type + " is sitting...");
    }

    @Override
    public void print(){
        System.out.println("This is a " + this.type + " with " + this.numLegs + " legs");
        System.out.println("It's name is " + this.name + ", its age is " + this.age);
        System.out.println("It's breed is " + this.breed);
    }
}