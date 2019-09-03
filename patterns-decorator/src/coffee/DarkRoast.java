package coffee;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        super();
        super.setDescription("Coffee: Dark roast\nPrice: $15.99");
    }

    public float cost() {
        return 15.99f;
    }
}