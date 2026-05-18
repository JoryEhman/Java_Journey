package Inhertiance;

class Animal {
    protected String type;
    protected int numLegs;
    protected boolean isMammal;
    protected boolean hasTail;
    protected boolean isHungry = false;

    Animal(){
        this.type = "Default Animal";
        this.numLegs = 2;
        this.isMammal = false;
        this.hasTail = false;
    }

    Animal(String type, int numLegs, boolean isMammal, boolean hasTail){
        this.type = type;
        this.numLegs = numLegs;
        this.isMammal = isMammal;
        this.hasTail = hasTail;
    }

    public void walking(){
        System.out.println("The " + this.type + " is now walking");
    }

    public void running(){
        walking();
        System.out.println("Shifting gears");
        System.out.println("The " + this.type + " is now running with its " + this.numLegs + " legs");
    }

    public boolean signalHunger(){
        System.out.println("The " + this.type + " realizes its hungry");
        return true;
    }

    public void eating(){
        if (isHungry){
            System.out.println("It is now eating");
            isHungry = false;
        } else {
            System.out.println("The " + this.type + " is not hungry");
            isHungry = true;
        }
    }

    public void waggingTail(boolean hasTail){
        if (hasTail){
            System.out.println("The " + this.type + " is now wagging tail");
        } else {
            System.out.println("The " + this.type + " has no tail to wag");
        }
    }

    public void isHungry(){
        if(isHungry){
            System.out.println("The " + this.type + " is hungry");
        } else {
            System.out.println("The " + this.type + " is not hungry");
        }
    }

    public void print(){
        System.out.println("This is a " + this.type + " with " + this.numLegs + " legs");
    }
}