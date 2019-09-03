package addition;

import coffee.Beverage;

public class Whip extends BeverageDecorator {
    public float cost() {
        return 2f + this.getBeverage().cost();
    }

    public Whip(Beverage beverage) {
        super(beverage);
        this.setDescription("Name: Whip\nPrice: $2");
    }
}