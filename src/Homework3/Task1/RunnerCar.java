package Homework3.Task1;

public class RunnerCar {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        Zhiguli zhiguli = new Zhiguli();

        //Task1
        toyota.playMusic();
        zhiguli.startMove();
        zhiguli.brokedown();

        //Task1 Advanced
        CarFactory carFactory = new CarFactory();
        Car[] carsArray = new Car[20];

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                carsArray[i] = carFactory.createToyota();
            } else {
                carsArray[i] = carFactory.createZhiguli();
            }
        }

        for (Car car : carsArray) {
            if (car instanceof Zhiguli) {
                ((Zhiguli) car).brokedown();
            } else if (car instanceof Toyota) {
                ((Toyota) car).playMusic();
            } else car.startMove();
        }
    }
}
