package StaticExamples;

public class CoffeeMachine {
    private float coffeeQuantity;
    private float milkQuantity;
    private float waterQuantity;
    private float sugarQuantity;

    //static makes it accessible to the class itself, not any instantiated objects
    static private CoffeeMachine my = null;

    private CoffeeMachine(){
        coffeeQuantity = 1;
        milkQuantity = 1;
        waterQuantity = 1;
        sugarQuantity = 1;
    }

    public void fillWater(float waterQuantity){
        this.waterQuantity = waterQuantity;
    }

    public void fillSugar(float sugarQuantity){
        this.sugarQuantity = sugarQuantity;
    }

    public float getCoffee(){
        return 0.15f;
    }

    static CoffeeMachine getInstance(){
        if (my == null){
            my = new CoffeeMachine();
        }
        return my;
    }
}

class Singleton {
    public static void main(String[] args) {
        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();
        CoffeeMachine m3 = CoffeeMachine.getInstance();

        System.out.println(m1 + " " + m2 + " " + m3);
        if (m1 == m2 && m2 == m3){
            System.out.println("SAME");
        }
    }
}
