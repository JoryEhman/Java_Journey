package section14_oop;

public class Product {
    private int itemNum;
    private String name;
    private double price;
    private int quantity;

    private static int itemIndex = 0;

    public int getItemNum(){
        return itemIndex;
    }
    public void setItemNum(){
        ++itemIndex;
    }
1
    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name.isEmpty()){
            this.name = "Placeholder";
        } else {
            this.name = name;
        }
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0.00;
        }
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public Product(){
        setItemNum();
        setName("Placeholder Item");
        setPrice(0.00);
        setQuantity(1);
    }

    public Product(String name){
        setItemNum();
        setName(name);
        setPrice(3.99);
        setQuantity(10);
    }

    public Product(String name, double price){
        setItemNum();
        setName(name);
        setPrice(price);
        setQuantity(10);
    }

    public Product(String name, double price, int quantity){
        setItemNum();
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public void printObject(){
        System.out.println("Product Item Number: " + getItemNum());
        System.out.println("Product Item Name: " + getName());
        System.out.println("Product Item Price: $" + getPrice());
        System.out.println("Product Item Quantity: " + getQuantity());
    }
}
