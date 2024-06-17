package vascopanigi.u5_w1_d1.entities.toppings;

import lombok.Getter;
import vascopanigi.u5_w1_d1.entities.pizzas.Pizza;

@Getter
public abstract class Topping {
    protected String topping_name;
    protected double topping_price;
    protected int topping_calories;
    protected Pizza pizza;

    public Topping(String topping_name, double topping_price, int topping_calories) {
        this.topping_name = topping_name;
        this.topping_price = topping_price;
        this.topping_calories = topping_calories;
    }

    public Topping(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String addTopping();
}
