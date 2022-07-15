package Module1.Homework4.Task1;

public class Plane implements Flyable {
    private final int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
        }

        System.out.println("Самолет летит");
    }
}
