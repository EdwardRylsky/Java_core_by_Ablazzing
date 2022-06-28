package Homework4.Task1Advanced;

public class Spruce extends Tree implements Coneable, Smellable{
    @Override
    public void cone() {
        System.out.println("ель: имеет шишки");
    }

    @Override
    public void smell() {
        System.out.println("ель: умеет пахнуть");
    }
}
