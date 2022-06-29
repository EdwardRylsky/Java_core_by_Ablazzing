package Homework4.Task1Expert;

public class BuilderRunner {
    public static void main(String[] args) {
        Human human = Builder.builder().name("Петр").age(20).weight(80).build();
        human.info();
    }
}