package Homework4.Task1Advanced;

public class Fern extends Plant implements Bloomable{

    @Override
    public void bloom() {
        System.out.println("папоротник: умеет цвести");
    }
}
