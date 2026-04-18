package section14_oop;

public class Rectangle {
    public double length;
    public double width;

    public double area(){
        return length * width;
    }

    public double perimeter(){
        return (2 * length) + (2 * width);
    }

    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.length = 2;
        r1.width = 3;
        //2 * 3
        System.out.println("The area of r1 is: " + r1.area());
        //(2 * 2) + (2 * 3) = 4 + 6
        System.out.println("The perimeter of r1 is: " + r1.perimeter());
    }
}
