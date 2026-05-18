package section15_Inhertiance;

class Super {
    public void display(){
        System.out.println("Super Class Display");
    }
}

class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub Class Display");
    }
}

class TV{
    public void switchOn(){
        System.out.println("TV is Switched ON");
    }
    public void changeChannel(){
        System.out.println("Tv channel is Changing");
    }
}

class SmartTV extends TV{
    @Override
    public void switchOn(){
        System.out.println("SmartTV is Switched ON");
    }
    @Override
    public void changeChannel(){
        System.out.println("SmartTV channel is Changing");
    }

    public void browse(){
        System.out.println("SmartTV browsing");
    }
}

class Car {
    public void start(){System.out.println("Car Started");}
    public void accelerate(){System.out.println("Car is Accelerated");}
    public void changeGear(){System.out.println("Car Gear Changed");}
}

class LuxuryCar extends Car {
    @Override
    public void changeGear(){
        System.out.println("Automatic Gear");
    }
    public void openRoof(){
        System.out.println("Sun Roof is Opened");
    }
}

public class Overriding {
    public static void main(String[] args) {
        LuxuryCar c = new LuxuryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        c.openRoof();
    }
}
