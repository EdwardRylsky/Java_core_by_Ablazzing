package Homework4.Task2Expert;

public class Car {
    private double price;

    public Car(double price) {
        this.price = price;
    }

    void printPrice() throws Exception {
        if (price > 0) {
            System.out.printf("%.2f", price);
        } else {
            throw new Exception("Ошибка: стоимость меньше нуля");
        }
    }

    public double getPrice() {
        return price;
    }
}
