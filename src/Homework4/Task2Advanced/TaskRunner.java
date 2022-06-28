package Homework4.Task2Advanced;

import java.util.ArrayList;

public class TaskRunner {
    public static void main(String[] args) {
        //создаем бренд с двумя магазинами
        Brand magnit = new Brand(2);

        //создаем поломанные часы
        Watch brokenWatch = new Watch(false);

        //выдаем поломанные часы работнику 1го магазина
        magnit.getStores()[0].worker.setWatch(brokenWatch);

        ArrayList<Watch> watches = new ArrayList<>();

        for (Store store : magnit.getStores()){
            watches.add(store.worker.getWatch());
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
