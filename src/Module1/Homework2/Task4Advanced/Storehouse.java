package Module1.Homework2.Task4Advanced;

public class Storehouse {
    int amountBottlesOfVodka = 10;

    public Storehouse() {
    }

    public Storehouse(int amountBottlesOfVodka) {
        this.amountBottlesOfVodka = amountBottlesOfVodka;
    }

    public int getAmountBottlesOfVodka() {
        return amountBottlesOfVodka;
    }

    void spoilGoods(Worker worker) {
        if (amountBottlesOfVodka > 0) {
            amountBottlesOfVodka--;
            worker.hooray();
        }
    }
}
