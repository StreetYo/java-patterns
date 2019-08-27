package pattern_observer_classes;

import java.util.ArrayList;

import interfaces.IObserver;
import interfaces.ISubject;

public class Observer implements IObserver {

    private ISubject subject;
    private String message = "";

    public ISubject getSubject() {
        return this.subject;
    }

    public void setSubject(ISubject newSubject) {
        if(this.subject != null) { this.subject.removeObserver(this); }
        this.subject = newSubject;
        this.subject.registerObserver(this);
    }

    public Observer(ISubject subject) {
        this.setSubject(subject);
    }
    
    public void update(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

}