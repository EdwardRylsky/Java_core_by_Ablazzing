package Module2.Homework3.Task4;

@GetMetaData
public class UserMeta {
    @GetMetaData
    private int count;
    @GetMetaData
    private String name;

    @GetMetaData
    public String GetSuperName(String prefix) throws InterruptedException {
        Thread.sleep(1000);
        return prefix;
    }
}
