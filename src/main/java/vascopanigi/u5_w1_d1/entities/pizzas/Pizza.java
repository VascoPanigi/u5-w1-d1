package vascopanigi.u5_w1_d1.entities.pizzas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Pizza {
    protected String name;

    protected double price;
    protected int calories;

    public abstract String createDescription();
}
