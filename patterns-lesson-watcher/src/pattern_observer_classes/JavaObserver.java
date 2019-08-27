package pattern_observer_classes;
import java.util.Observable;
import java.util.Observer;

public class JavaObserver implements Observer {

    private Object message = "";

    public JavaObserver(Observable sub) {
        sub.addObserver(this);
    }

    public void update(Observable subject, Object args) {
        this.message = args;
    }

    public Object getMessage() {
        return this.message;
    }

}