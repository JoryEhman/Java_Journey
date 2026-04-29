package Inhertiance;

class testingAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.print();
        System.out.println();

        /*Animal dog = new Dog("Snoopy", 15, "Multi-poo");
        dog.print();
        dog.waggingTail(true);
        dog.eating();
        dog.signalHunger();
        dog.eating();
        dog.isHungry();*/

        Animal animal2 = new Cat("Reina", 4, "idk");
        animal2.print();
    }
}