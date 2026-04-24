package section14_oop;

public class ConstructorTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.printObject();
        System.out.println();
        Product p2 = new Product("Nintendo Switch 2", 450.00, 30000);
        p2.printObject();
        System.out.println();
        Product p3 = new Product("Kiwis", 7.99);
        p3.printObject();
    }
}
