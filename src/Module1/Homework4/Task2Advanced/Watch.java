package Module1.Homework4.Task2Advanced;

public class Watch implements Tickable{
    private final boolean isBroken;

    public Watch(boolean isBroken) {
        this.isBroken = isBroken;
    }

    @Override
    public void tick() throws WatchBrokenError {
        if (this.isBroken) {
            throw new WatchBrokenError("Ошибка: Часы сломались");
        } else {
            System.out.println("Часы тикают");
        }
    }
}
