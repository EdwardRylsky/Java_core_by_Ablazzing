package Homework4.Task2Advanced;

public class Store {
    private Worker[] workers;

    public Store(int workersNumber) {
        this.workers = new Worker[workersNumber];

        for (int i = 0; i < workersNumber; i++) {
            workers[i] = new Worker();
        }
    }

    public Worker[] getWorker() {
        return workers;
    }


}
