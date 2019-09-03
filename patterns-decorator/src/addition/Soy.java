package addition;

import coffee.Beverage;

public class Soy extends BeverageDecorator {
    public float cost() {
        return 1f + super.getBeverage().cost();
    }

    public Soy(Beverage beverage) {
        super(beverage);
        super.setDescription("Name: Soy\nPrice: $1");
    }
}