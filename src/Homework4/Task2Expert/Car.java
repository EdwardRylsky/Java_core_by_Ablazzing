package Homework4.Task2Expert;

public class Car {
    private double price;

    public Car(double price) {
        this.price = price;
    }

    void printPrice() {
        if (price > 0) {
            System.out.printf("%.2f", price);
        } else {
            System.out.println("Неизвестна");
        }
    }

    public double getPrice() {
        return price;
    }
}
