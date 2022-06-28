package Homework4.Task2Advanced;

public class Brand {
    private Store[] stores;

    public Brand(int storesNumbers, int workersNumber) {
        this.stores = new Store[storesNumbers];

        for (int i = 0; i < storesNumbers; i++) {
            stores[i] = new Store(workersNumber);
        }
    }

    public Store[] getStores() {
        return stores;
    }
}
