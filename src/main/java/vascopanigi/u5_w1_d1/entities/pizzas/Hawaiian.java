package vascopanigi.u5_w1_d1.entities.pizzas;

public class Hawaiian extends Pizza {
    public Hawaiian() {
        super("Hawaiian", 6.49, 1250);
    }

    @Override
    public String createDescription() {
        return "Hawaiian (ananas, cheese, ham, pineapple)";
    }
}
