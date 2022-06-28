package Homework4.Task1;

public class Duck implements Flyable{
    private final boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (this.isInjured) {
            throw new FlyException();
        }
        System.out.println("Утка летит");
    }
}
