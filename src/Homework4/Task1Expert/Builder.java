package Homework4.Task1Expert;

public class Builder {

    public static HumanBuilder builder() {
        return new HumanBuilder();
    }

    public static class HumanBuilder {
        private final Human human = new Human();

        private HumanBuilder(){
        }

        HumanBuilder name(String name) {
            human.setName(name);
            return this;
        }

        HumanBuilder age(int age) {
            human.setAge(age);
            return this;
        }

        HumanBuilder weight(int weight) {
            human.setWeight(weight);
            return this;
        }

        public Human build() {
            return human;
        }
    }
}
