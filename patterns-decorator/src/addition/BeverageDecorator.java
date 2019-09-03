package addition;

import coffee.Beverage;

public abstract class BeverageDecorator extends Beverage {

    private Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        super();
        this.setBeverage(beverage);
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}