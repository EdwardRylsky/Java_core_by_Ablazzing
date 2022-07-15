package Module1.Homework1;/*
    Создать переменные с ростом, весом.
    Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
    Пример результата вывода на экран:
    21.0
 */

public class Task2 {
    public static void main(String[] args) {
        double weight = 72;
        double height = 1.73;
        double BMI = weight/(height * height);

        System.out.printf("Индекс массы тела равен: %.2f", BMI);
    }
}
