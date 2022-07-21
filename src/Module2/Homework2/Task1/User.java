package Module2.Homework2.Task1;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int indexNumber;
    private List<Integer> integerList= new ArrayList<>();

    public User(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }
}
