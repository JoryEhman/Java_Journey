package Interfaces;

//By default, interface methods are "public abstract"
//Concrete Classes inherit and implement these, so they cannot be private
interface Test {

    //can we have identifiers? -> Yes. We should try to label them in all CAPS, so to easily
    //identify them as identifiers from the Interface themselves.
    //By default, these are static/final. Meaning they cannot be altered
    final static int X = 10;
    void meth1();
    void meth2();

    //If a method is explicitly defined as "static" then it can have a body. Otherwise, they by default
    //they are "public abstract" meaning that the class inheriting will give its definition

    //private methods are now allowed (past java 9), only used internally. default methods can access
    //the private methods internally
    private void meth3() {
        System.out.println("Meth3 of Test accessed despite being private");
    }
    default void meth5(){
        meth3();
    }

}

//Interface's can extend from other Interfaces
interface Test2 extends Test{
    void meth4();
}

//Must define the methods inherited
class My implements Test2{
    public void meth1(){}
    public void meth2(){}
    public void meth4(){}
}

public class InterfacePractice {
    public static void main(String[] args){
        //We can directly access the static values/methods
        System.out.println(Test.X);

        My m = new My();
        m.meth5();
    }
}
