package Homework4.Task1Expert;

public class Human {
    private String name;
    private int age;
    private int weight;

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
}