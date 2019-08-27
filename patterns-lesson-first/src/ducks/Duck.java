package ducks;

import behavior.IFlyBehavior;
import behavior.IQuackBehavior;

public abstract class Duck {

    private IFlyBehavior flyBehavior;
    private IQuackBehavior quackBehavior;

    public Duck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("Swiming...");
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void performFly() {
        this.flyBehavior.fly();
    }

    abstract void display();
}