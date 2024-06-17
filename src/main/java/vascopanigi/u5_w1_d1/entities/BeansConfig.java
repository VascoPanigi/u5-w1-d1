package vascopanigi.u5_w1_d1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vascopanigi.u5_w1_d1.entities.drinks.Cola;
import vascopanigi.u5_w1_d1.entities.drinks.Drink;
import vascopanigi.u5_w1_d1.entities.drinks.Water;
import vascopanigi.u5_w1_d1.entities.menu.Menu;
import vascopanigi.u5_w1_d1.entities.pizzas.Hawaiian;
import vascopanigi.u5_w1_d1.entities.pizzas.Margherita;
import vascopanigi.u5_w1_d1.entities.pizzas.Pepperoni;
import vascopanigi.u5_w1_d1.entities.pizzas.Pizza;
import vascopanigi.u5_w1_d1.entities.toppings.*;

import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfig {
    @Bean
    public Pizza margherita() {
        return new Margherita();
    }

    @Bean
    public Pizza pepperoni() {
        return new Pepperoni();
    }

    @Bean
    public Pizza hawaiian() {
        return new Hawaiian();
    }

    @Bean
    public Drink cola() {
        return new Cola();
    }

    @Bean
    public Drink water() {
        return new Water();
    }

    @Bean
    public Topping ananas() {
        return new Ananas();
    }

    @Bean
    public Topping salami() {
        return new Salami();
    }

    @Bean
    public Topping ham() {
        return new Ham();
    }

    @Bean
    public Topping cheese() {
        return new Cheese();
    }

    @Bean
    public Menu menu() {
        List<Pizza> pizzas = Arrays.asList(margherita(), hawaiian(), pepperoni());
        List<Topping> toppings = Arrays.asList(ananas(), salami(), ham(), cheese());
        List<Drink> drinks = Arrays.asList(cola(), water());
        return new Menu(toppings, pizzas, drinks);
    }

}
