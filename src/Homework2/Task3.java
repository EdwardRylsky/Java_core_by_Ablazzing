/*
    boolean chicken = true;
    boolean vegetables = false;
    boolean sour = true;
    boolean toast = true;
    boolean sausage = true;
    boolean eggs = true;
Задача: Повара попросили сделать салат.
Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
Если ингредиентов нет, то повар объявляет: У меня ничего нет
Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
Проверьте работоспособность условий, через изменение значения переменных.
 */
package Homework2;

public class Task3 {

    public static void main(String[] args) {
        boolean chicken = true;
        boolean vegetables = true;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;

        if (chicken && sour && toast && vegetables) {
            System.out.println("Делаем Цезарь!");
        } else if (vegetables && eggs && (chicken || sausage)) {
            System.out.println("Делаем Оливье");
        } else if (vegetables) {
            System.out.println("Делаем овощной");
        } else {
            System.out.println("Ходите голодными. У меня ничего нет!");
        }
    }
}
