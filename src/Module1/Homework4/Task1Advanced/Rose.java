package Module1.Homework4.Task1Advanced;

public class Rose extends Plant implements Bloomable, Smellable{
    @Override
    public void bloom() {
        System.out.println("роза: умеет цвести");
    }

    @Override
    public void smell() {
        System.out.println("роза: умееть пахнуть");
    }
}
