package section15_Inhertiance;

class Rectangle {
    int length;
    int breadth;

    Rectangle(){
        this.length = 1;
        this.breadth = 1;
    }
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void display(){
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }
}

class Cuboid extends Rectangle {
    int height;

    Cuboid(){
        height = 1;
    }
    Cuboid(int height){
        this.height = height;
    }
    Cuboid (int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }
    public int volume(){
        return length * breadth * height;
    }
}

public class Inheritance_Constructors_More {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid(5, 5, 2);
        System.out.println("Cuboid's volume = " + c1.volume());
    }
}
