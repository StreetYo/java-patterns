import addition.Milk;
import coffee.Beverage;
import coffee.DarkRoast;

public class Main {
    public static main(String... args) {

        Beverage coffee = new DarkRoast();
        coffee = new Milk(coffee);
        coffee = new Whip(coffee);

        System.out.println(coffee.getDescription());
    }
} 