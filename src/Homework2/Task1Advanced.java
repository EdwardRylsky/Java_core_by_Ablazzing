package Homework2;

/*
Написать цикл, который будет прибавлять число к result до тех пор,
пока не получиться больше 1_000_000.
Дано:
double increment = 0.01123;
double result = 0;
Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
Внимание: число может измениться, и не должно приводить к изменению вашего кода.
 */

public class Task1Advanced {

    public static void main(String[] args) {
        double increment = 0.01123;
        double result = 0;
        int counter;

        if (increment > 0) {
            for (counter = 0; result < 1_000_000; counter++) {
                result += increment;
            }

            System.out.println(counter);
        }
    }
}
