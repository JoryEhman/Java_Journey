package section14_oop;

public class Rectangle {
    private double length;
    private double width;

    //getLength
    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length){
        if (length > 0) {
            this.length = length;
        } else {
            length = 0;
        }
    }

    public void setWidth(double width){
        if (width > 0){
            this.width = width;
        } else {
            width = 0;
        }
    }

    public double area(){
        return length * width;
    }

    public double perimeter(){
        return (2 * length) + (2 * width);
    }
}
class Testing{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.setLength(10.5);
        r1.setWidth(5.5);
        System.out.println("The area of r1 is: " + r1.area());
        System.out.println("The perimeter of r1 is: " + r1.perimeter());
    }
}
