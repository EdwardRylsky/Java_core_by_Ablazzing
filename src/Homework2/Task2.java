/*
Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
Проверьте работоспособность условий, через изменение значения переменной.
 */
package Homework2;

public class Task2 {

    public static void main(String[] args) {
        int ageChildren = 10;

        if (ageChildren < 6) {
            System.out.println("Пошел в сад");
        } else if (ageChildren < 11) {
            System.out.println("Пошел в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("Пошел в среднюю школу");
        } else if (ageChildren < 27) {
            System.out.println("Пошел в универ или в армию");
        } else if (ageChildren < 65) {
            System.out.println("Пошел на работу :'(");
        } else {
            System.out.println("Пошел на пенсию...");
        }
    }
}
