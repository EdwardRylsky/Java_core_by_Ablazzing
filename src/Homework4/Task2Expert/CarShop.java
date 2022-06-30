package Homework4.Task2Expert;

import org.w3c.dom.ls.LSOutput;

public class CarShop {
    private final Car car;

    public CarShop(Car car) {
        this.car = car;
    }

    void sellCar() {
        printGreeting();
        car.printPrice();
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
