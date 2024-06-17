package vascopanigi.u5_w1_d1.entities.pizzas;

public class Pepperoni extends Pizza {
    public Pepperoni() {
        super("Pepperoni", 5.20, 1350);
    }

    @Override
    public String createDescription() {
        return "Pepperoni (tomato, cheese, salami)";
    }
}
