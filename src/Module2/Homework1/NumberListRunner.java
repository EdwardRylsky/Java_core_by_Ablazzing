package Module2.Homework1;

import java.util.List;

public class NumberListRunner {
    public static void main(String[] args) throws Exception {
        NumberList<Number> test = new NumberList<>(Number.class, 10);
        Integer removable = Integer.parseInt("8");

        test.add(3);
        test.add(5);
        test.add(8);
        test.add(8.0);
        test.add(8);
        test.add(11);
        test.add(8);

        System.out.println(test);
        System.out.println();

        List<Number> subList = test.subList(1, 5);
        System.out.println(subList);
        System.out.println();

        try {
            System.out.println(test.getDouble(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println(test.contains(removable));
        System.out.println();

        test.remove(removable);

        System.out.println(test);
        System.out.println();

        System.out.println(test.getDouble(1));
        System.out.println();

        try {
            System.out.println(test.sumIntegers());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        test.remove(Double.parseDouble("8.0"));
        System.out.println();

        System.out.println(test);
        System.out.println();

        System.out.println(test.sumIntegers());
    }
}
