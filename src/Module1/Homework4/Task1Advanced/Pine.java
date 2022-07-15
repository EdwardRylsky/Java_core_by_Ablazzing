package Module1.Homework4.Task1Advanced;

public class Pine extends Tree implements Coneable, Smellable{
    @Override
    public void cone() {
        System.out.println("сосна: имеет шишки");
    }

    @Override
    public void smell() {
        System.out.println("сосна: умеет пахнуть");
    }
}
