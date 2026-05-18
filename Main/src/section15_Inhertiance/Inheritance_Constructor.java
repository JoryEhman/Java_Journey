package section15_Inhertiance;


class Parent{
    Parent(){
        System.out.println("Non-Param of Parent");
    }
    Parent(int x){
        System.out.println("Param of Parent: value " + x);
    }
}

class Child extends Parent {
    Child(){
        System.out.println("Non-Param of Child");
    }
    Child(int y){
        System.out.println("Param of Child");
    }
    Child (int x, int y){
        super(x);
        System.out.println("2 Param of Child: value " + y);
    }
}

public class Inheritance_Constructor {
    public static void main(String[] args) {
        Child child1 = new Child(2, 5);
    }
}
