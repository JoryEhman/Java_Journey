package section14_oop;

public class Cylinder {
    private double radius;
    private double height;

    private double volume(){
        return (Math.PI * Math.pow(radius, 2) * height);
    }

    private double curvedSA(){
        return 2 * (Math.PI * radius * height);
    }

    private double totalSA(){
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }

    private double topArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args){
        Cylinder c = new Cylinder();
        c.radius = 2;
        c.height = 3;

        System.out.println("The volume of c: " + c.volume());
        System.out.println("The curved surface area of c: " + c.curvedSA());
        System.out.println("The total surface area of c: " + c.totalSA());
        System.out.println("The top area of c: " + c.topArea());
    }
}
