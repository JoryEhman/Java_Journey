package Abstract_Classes;


//Concrete Classes vs Abstract Classes
//Concrete Classes can be used to create objects, Abstract Classes cannot
abstract class Super {

    public Super(){
        System.out.println("Super Constructor");
    }

    public void method1(){
        System.out.println("Super method1");
    }

    //If an abstract method exists, you must declare the class as abstract
    abstract public void method2();
}

class Sub extends Super{

    public Sub(){
        System.out.println("Sub Constructor");
    }

    @Override
    public void method2(){
        System.out.println("Sub method2");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Super s;
        s = new Sub();
        s.method2();
    }
}

