package section15_Inhertiance;

class SuperClass{
    public void display(){
        System.out.println("Super Display");
    }
}

class SubClass extends SuperClass{
    @Override
    public void display(){
        System.out.println("Sub Display");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {

    }
}
