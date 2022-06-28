package Homework4.Task2Advanced;

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
                System.out.println("Ошибка: Часы сломались");
            }
        }
    }
}
