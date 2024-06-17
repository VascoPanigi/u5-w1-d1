package vascopanigi.u5_w1_d1.entities.toppings;

import vascopanigi.u5_w1_d1.entities.pizzas.Pizza;

public class Cheese extends Topping {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public Cheese() {
        super("Cheese", 2.00, 200);
    }

    @Override
    public String addTopping() {
        return pizza.createDescription() + ", cheese";
    }

    public double getPrice() {
        return pizza.getPrice() + 2.00;
    }

    public int getCalories() {
        return pizza.getCalories() + 200;
    }
}
