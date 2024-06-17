package vascopanigi.u5_w1_d1.entities.toppings;

import vascopanigi.u5_w1_d1.entities.pizzas.Pizza;

public class Ham extends Topping {
    public Ham(Pizza pizza) {
        super(pizza);
    }

    public Ham() {
        super("Ham", 1.00, 150);
    }

    @Override
    public String addTopping() {
        return pizza.createDescription() + ", ham";
    }

    public double getPrice() {
        return pizza.getPrice() + 1.00;
    }

    public int getCalories() {
        return pizza.getCalories() + 150;
    }
}
