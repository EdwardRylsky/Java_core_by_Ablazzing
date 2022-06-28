package Homework4.Task1;

public class Plane implements Flyable {
    private final int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException();
        }

        System.out.println("Самолет летит");
    }
}
