package Module2.Homework1;

public class NumberListRunner {
    public static void main(String[] args) throws Exception {
        NumberList<Number> test = new NumberList<>(Number.class, 10);

        test.add(3);
        test.add(5);
        test.add(8);
        test.add(8.0);
        test.add(8);
        test.add(11);
        test.add(8);

        for (int i = 0; i < test.size(); i++) {
            System.out.print(test.get(i) + "\t");
        }
        System.out.println();
        System.out.println();

        try {
            System.out.println(test.getDouble(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        Integer eight = Integer.parseInt("8");
        System.out.println(test.contains(eight));
        System.out.println();

        test.remove(eight);

        for (int i = 0; i < test.size(); i++) {
            System.out.print(test.get(i) + "\t");
        }

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

        for (int i = 0; i < test.size(); i++) {
            System.out.print(test.get(i) + "\t");
        }

        System.out.println();
        System.out.println();
        System.out.println(test.sumIntegers());
    }
}
