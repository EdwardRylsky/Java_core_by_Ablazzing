package Module1.Homework4.Task1;

public class Duck implements Flyable{
    private final boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (this.isInjured) {
            throw new FlyException("Ошибка: утка ранена");
        }
        System.out.println("Утка летит");
    }
}
