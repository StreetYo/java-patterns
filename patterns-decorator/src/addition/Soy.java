package addition;

import coffee.Beverage;

public class Soy extends BeverageDecorator {
    @Override
    public float cost() {
        return 1f + this.getBeverage().cost();
    }

    public Soy(Beverage beverage) {
        super(beverage);
        this.setDescription("Name: Soy\nPrice: $1");
    }
}