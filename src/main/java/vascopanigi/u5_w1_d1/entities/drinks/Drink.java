package vascopanigi.u5_w1_d1.entities.drinks;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Drink {
    private String name;
    private double price;
    private int calories;
}
