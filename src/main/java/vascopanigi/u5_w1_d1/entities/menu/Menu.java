package vascopanigi.u5_w1_d1.entities.menu;

import lombok.AllArgsConstructor;
import vascopanigi.u5_w1_d1.entities.drinks.Drink;
import vascopanigi.u5_w1_d1.entities.pizzas.Pizza;
import vascopanigi.u5_w1_d1.entities.toppings.Topping;

import java.util.List;

@AllArgsConstructor
public class Menu {
    public List<Topping> toppings;
    private List<Pizza> pizzas;
    private List<Drink> drinks;

    public void printMenu() {
        final int NAME_WIDTH = 45;
        final int PRICE_WIDTH = 10;
        final int CALORIES_WIDTH = 10;

        System.out.printf("%-" + NAME_WIDTH + "s%" + PRICE_WIDTH + "s%" + CALORIES_WIDTH + "s%n", "Pizzas", "Price", "Calories");

        for (Pizza pizza : pizzas) {
            System.out.printf("%-" + NAME_WIDTH + "s%" + PRICE_WIDTH + ".2f%" + CALORIES_WIDTH + "d%n", pizza.createDescription(), pizza.getPrice(), pizza.getCalories());
        }

        System.out.printf("\n%-" + NAME_WIDTH + "s%" + PRICE_WIDTH + "s%" + CALORIES_WIDTH + "s%n", "Toppings", "Price", "Calories");

        for (Topping topping : toppings) {
            System.out.printf("%-" + NAME_WIDTH + "s%" + PRICE_WIDTH + ".2f%" + CALORIES_WIDTH + "d%n", topping.getTopping_name(), topping.getTopping_price(), topping.getTopping_calories());
        }

        System.out.printf("\n%-" + NAME_WIDTH + "s%" + PRICE_WIDTH + "s%" + CALORIES_WIDTH + "s%n", "Drinks", "Price", "Calories");

        for (Drink drink : drinks) {
            System.out.printf("%-" + NAME_WIDTH + "s%" + PRICE_WIDTH + ".2f%" + CALORIES_WIDTH + "d%n", drink.getName(), drink.getPrice(), drink.getCalories());
        }
    }
}
