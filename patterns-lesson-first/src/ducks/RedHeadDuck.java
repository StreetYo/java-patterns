package ducks;

import behavior.SimpleQuack;
import behavior.FlyWithWings;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super( new FlyWithWings(), new SimpleQuack() );
    }

    public void display() {
        System.out.println("I'm a redhead duck!");
    }

}