package section15_Inhertiance;

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
}

//Inherits the properties and methods of Circle
class Cylinder extends Circle {
    public double height;

    public double volume(){
        return area() * height;
    }
}

class Test {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.radius = 7;
        c.height = 10;

        System.out.println("Volume of Cylinder: " + c.volume());
        System.out.println("Area of Cylinder: " + c.area());
     }
}
