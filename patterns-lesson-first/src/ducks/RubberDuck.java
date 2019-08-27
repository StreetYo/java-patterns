package ducks;

import behavior.Squeak;
import behavior.NoFly;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super( new NoFly(), new Squeak() );
    }

    public void display() {
        System.out.println("Tt's a rubber duck mazafuck!");
    }

}