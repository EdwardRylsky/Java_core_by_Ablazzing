package Homework2.Task4Advanced;

/*
Написать систему управления складскими запасами. Создать класс склад, создать класс работники
(написать геттеры на все аттрибуты).
Количество работников минимум 3.
Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
"Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
У склада есть только одна позиция - Водка.
 */

public class Task4AdvancedRunner {

    public static void main(String[] args) {
        Worker bob = new Worker("Bob");
        Worker jack = new Worker("Peter");
        Worker steve = new Worker("Steve");

        Worker[] workerArray = {bob, jack, steve};

        Storehouse oceanOfVodka = new Storehouse();

        while (oceanOfVodka.getAmountBottlesOfVodka() > 0) {
            //Отправляем случайного работника на склад
            oceanOfVodka.spoilGoods(workerArray[(int) (Math.random()*workerArray.length)]);
        }

        for (Worker worker : workerArray) {
            worker.introduceYourself();
        }
    }
}
