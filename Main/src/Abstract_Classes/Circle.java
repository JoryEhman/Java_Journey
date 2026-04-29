package Abstract_Classes;

abstract class Shape {
    abstract double perimeter();
    abstract double area();
}

public class Circle extends Shape {

    private double radius;
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Test {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        System.out.println("Circle's perimeter: " + circle.perimeter());
        System.out.println("Circle's area: " + circle.area());


        Shape rectangle = new Rectangle(1.0, 2.0);
        System.out.println("Rectangle's perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle's area: " + rectangle.area());
    }
}

