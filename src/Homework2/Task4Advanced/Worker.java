package Homework2.Task4Advanced;

public class Worker {

    String name;
    int numberSpoiledGoods = 0;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberSpoiledGoods() {
        return numberSpoiledGoods;
    }

    void hooray() {
        System.out.println("Ура, я испортил водку!");
        numberSpoiledGoods++;
    }

    void introduceYourself() {
        System.out.printf("Меня зовут %s, и я испортил бутылок водки: %d", name, numberSpoiledGoods);
        System.out.println();
    }
}
