package section14_oop;

//What are the things you need to write a class?
//Properties and Methods!!
//Nouns == Properties
//Verbs == Methods
public class Circle {

    public double radius;

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public double circumference(){
        return perimeter();
    }

    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.radius = 3; //Hardcoding data member to 3
        System.out.println("The circles area: " + c1.area());
        System.out.println("The circles perimeter: " + c1.perimeter());
        System.out.println("The circles circumference: " + c1.circumference());
    }
}
