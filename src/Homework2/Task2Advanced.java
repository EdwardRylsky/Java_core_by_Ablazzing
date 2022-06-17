package Homework2;

/*
Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
Например, дано: [1,1,1,1,1]
Ожидаемый результат: [0,1,0,1,0]
 */

public class Task2Advanced {

    public static void main(String[] args) {
        int[] input = {1,1,1,1,1,1};

        for (int i = 0; i < input.length; i = i + 2) {
            input[i] = 0;
        }

        for (int number : input) {
            System.out.print(number + " ");
        }
    }
}
