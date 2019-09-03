package addition;

import coffee.Beverage;

public class Milk extends BeverageDecorator {
    public float cost() {
        return 1.5f + this.getBeverage().cost();
    }

    public Milk(Beverage beverage) {
        super(beverage);
        this.setDescription("Name: Milk\nPrice: $1.5");
    }
}