package vascopanigi.u5_w1_d1.entities.toppings;

import vascopanigi.u5_w1_d1.entities.pizzas.Pizza;

public class Ananas extends Topping {
    public Ananas(Pizza pizza) {
        super(pizza);
    }

    public Ananas() {
        super("Ananas", 35.00, 300);
    }

    @Override
    public String addTopping() {
        return pizza.createDescription() + ", ananas";
    }

    public double getPrice() {
        return pizza.getPrice() + 35.00;
    }

    public int getCalories() {
        return pizza.getCalories() + 300;
    }
}
