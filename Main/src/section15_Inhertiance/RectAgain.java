package section15_Inhertiance;
class RectAgain {
    int length;
    int breadth;
    int x = 10;

    RectAgain(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}

class CuboidAgain extends RectAgain{
    int height;
    int x = 20;

    CuboidAgain(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }

    void display(){
        System.out.println(super.x);
        System.out.println(x);
    }
}

class TestCuboids {
    public static void main(String[] args) {
        CuboidAgain c1 = new CuboidAgain(3, 2, 5);
        c1.display();
    }
}