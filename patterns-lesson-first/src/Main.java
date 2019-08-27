import behavior.NoFly;
import ducks.*;

public class Main {

    public static void main(String... args) {

        Duck[] ducks = { new RubberDuck(), new RedHeadDuck() };

	ducks[1].setFlyBehavior(new NoFly());
	
	for(int i = 0; i < ducks.length; i++) {
		ducks[i].performFly();
        	ducks[i].performQuack();
	}
    }

}