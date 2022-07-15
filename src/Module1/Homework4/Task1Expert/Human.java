package Module1.Homework4.Task1Expert;

public class Human {
    private String name;
    private int age;
    private int weight;

    private Human() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void info() {
        System.out.println(name + " —" +
                " возраст " + age +
                ", вес " + weight);
    }

    public static HumanBuilder builder() {
        return new HumanBuilder();
    }

    public static class HumanBuilder {
        private final Human newHuman = new Human();

        private HumanBuilder() {
        }

        HumanBuilder name(String name) {
            newHuman.setName(name);
            return this;
        }

        HumanBuilder age(int age) {
            newHuman.setAge(age);
            return this;
        }

        HumanBuilder weight(int weight) {
            newHuman.setWeight(weight);
            return this;
        }

        public Human build() {
            return newHuman;
        }
    }

}