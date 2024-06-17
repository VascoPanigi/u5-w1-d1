package vascopanigi.u5_w1_d1.entities.pizzas;

public class Margherita extends Pizza {
    public Margherita() {
        super("Margherita", 4.99, 1104);
    }


    @Override
    public String createDescription() {
        return "Margherita (tomato, cheese)";
    }
}
