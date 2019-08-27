package pattern_observer_classes;
import java.util.Observable;

public class JavaSubject extends Observable {
    public void notify(String message) {
        this.setChanged();
        this.notifyObservers(message);
    }
}