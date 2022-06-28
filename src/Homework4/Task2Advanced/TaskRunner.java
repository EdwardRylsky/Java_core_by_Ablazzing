package Homework4.Task2Advanced;

import java.util.ArrayList;

public class TaskRunner {
    public static void main(String[] args) {
        //создаем бренд с двумя магазинами
        Brand magnit = new Brand(2, 1);

        //создаем поломанные часы
        Watch brokenWatch = new Watch(false);

        //выдаем поломанные часы 1му работнику 1го магазина
        magnit.getStores()[0].getWorker()[0].setWatch(brokenWatch);

        ArrayList<Watch> watches = new ArrayList<>();

        for (Store store : magnit.getStores()){
            for (Worker worker : store.getWorker()){
                watches.add(worker.getWatch());
            }
        }

        for (Watch watch : watches) {
            try {
                watch.tick();
            } catch (WatchBrokenError e) {
                System.out.println("Ошибка: Часы сломались");
            }
        }
    }
}
