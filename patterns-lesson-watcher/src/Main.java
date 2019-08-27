import interfaces.IObserver;
import interfaces.ISubject;
import pattern_observer_classes.*;

public class Main {
    public static void main(String... args) {
        Main.version2(args);
    }

    public static void version2(String... args) {

        JavaSubject subject = new JavaSubject();

        JavaObserver[] observers = {new JavaObserver(subject), new JavaObserver(subject), new JavaObserver(subject)};

        for (JavaObserver observer : observers) {
            System.out.println("Observer message: " + observer.getMessage());
        }

        subject.notify("qwerty bitch");

        for (JavaObserver observer : observers) {
            System.out.println("Observer message: " + observer.getMessage());
        }

        subject.deleteObserver(observers[1]);

        subject.notify("Some new message verse 1");

        for (JavaObserver observer : observers) {
            System.out.println("Observer message: " + observer.getMessage());
        }
        
    }

    public static void version1(String... args) {

        ISubject subject = new Subject();

        IObserver[] observers = {new Observer(subject), new Observer(subject), new Observer(subject)};

        for (IObserver observer : observers) {
            System.out.println("Observer message: " + ((Observer) observer).getMessage());
        }

        subject.notifyObservers("qwerty MZ");

        for (IObserver observer : observers) {
            System.out.println("Observer message: " + ((Observer) observer).getMessage());
        }

        subject.removeObserver(observers[1]);

        subject.notifyObservers("Some new message");

        for (IObserver observer : observers) {
            System.out.println("Observer message: " + ((Observer) observer).getMessage());
        }
    }
}
