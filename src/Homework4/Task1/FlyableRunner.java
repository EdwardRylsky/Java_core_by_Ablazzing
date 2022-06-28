package Homework4.Task1;

public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyables = {new Duck(true), new Plane(-5),
                            new Duck(false), new Plane(10)};

        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                if (flyable instanceof Duck) {
                    System.out.println("Ошибка: утка ранена");
                }
                if (flyable instanceof Plane) {
                    System.out.println("Ошибка: пассажиров в самолете меньше 0");
                }
            }
        }
    }
}
