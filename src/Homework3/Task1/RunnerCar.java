package Homework3.Task1;

public class RunnerCar {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        Zhiguli zhiguli = new Zhiguli();

        toyota.playMusic();
        zhiguli.startMove();
        zhiguli.brokedown();
    }
}
