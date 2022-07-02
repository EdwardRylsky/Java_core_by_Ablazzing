package Homework4.Task2Advanced;

/*
магазин (обладает работниками)
работник (обладает часами)
часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
Бренд (обладает массивом магазинов)
Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
у каждого работника по часам. У одного работника часы сломаны, у второго нет.
После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
обработать ошибку сломанных часов.
Ожидание вывода на экран:
    Часы тикают
    Ошибка: Часы сломались.
 */
import java.util.ArrayList;

public class TaskRunner {
    public static void main(String[] args) {
        //создаем бренд с двумя магазинами
        Brand magnit = new Brand(2);

        //создаем массивы работяг для магазинов
        Worker[] workers1 = {new Worker()};
        Worker[] workers2 = {new Worker()};

        //передаем массивы работяг в магазины
        magnit.getStores()[0].setWorkers(workers1);
        magnit.getStores()[1].setWorkers(workers2);

        //создаем поломанные часы
        Watch brokenWatch = new Watch(false);

        //выдаем поломанные часы одному работнику
        workers1[0].setWatch(brokenWatch);

        ArrayList<Watch> watches = new ArrayList<>();

        //собираем часы по всем работягам всех магазинов
        for (Store store : magnit.getStores()){
            for (Worker worker : store.getWorker()){
                watches.add(worker.getWatch());
            }
        }

        //проверяем каждые часы
        for (Watch watch : watches) {
            try {
                watch.tick();
            } catch (WatchBrokenError e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
