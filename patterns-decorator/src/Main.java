import addition.*;
import coffee.*;

public class Main {
    public static void main(String... args) {

        Beverage coffee = new DarkRoast();
        coffee = new Milk(coffee);
        coffee = new Whip(coffee);

        System.out.println(coffee.getDescription());
    }
} 