package Module1.Homework4.Task2Advanced;

public class Brand {
    private Store[] stores;

    public Brand(int storesNumbers) {
        this.stores = new Store[storesNumbers];

        for (int i = 0; i < storesNumbers; i++) {
            stores[i] = new Store();
        }
    }

    public Store[] getStores() {
        return stores;
    }
}
