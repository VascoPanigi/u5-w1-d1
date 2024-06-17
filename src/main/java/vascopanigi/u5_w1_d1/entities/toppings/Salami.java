package vascopanigi.u5_w1_d1.entities.toppings;

import vascopanigi.u5_w1_d1.entities.pizzas.Pizza;

public class Salami extends Topping {
    public Salami(Pizza pizza) {
        super(pizza);
    }

    public Salami() {
        super("Salami", 3.00, 200);
    }

    @Override
    public String addTopping() {
        return pizza.createDescription() + ", salami";
    }

    public double getPrice() {
        return pizza.getPrice() + 3.00;
    }

    public int getCalories() {
        return pizza.getCalories() + 200;
    }
}
