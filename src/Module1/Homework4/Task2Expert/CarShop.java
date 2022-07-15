package Module1.Homework4.Task2Expert;

public class CarShop {
    private final Car car;

    public CarShop(Car car) {
        this.car = car;
    }

    void sellCar() {
        printGreeting();
        try {
            car.printPrice();
        } catch (Exception e) {
            System.out.print("Неизвестна мне");
        }
        printOffer();
    }

    private void printGreeting() {
        System.out.println("Здравствуй клиент, цена этого авто:");
    }

    private void printOffer() {
        if (car.getPrice() > 0) {
            System.out.println("\nХочешь купить авто?");
        } else {
            System.out.println("\nДавайте посмотрим другое авто?");
        }
    }
}
