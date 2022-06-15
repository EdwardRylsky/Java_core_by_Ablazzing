package Homework2;

public class Task2 {

    public static void main(String[] args) {
        int ageChildren = 10;

        if (ageChildren < 6) {
            System.out.println("Пошел в сад");
        } else if (ageChildren < 11) {
            System.out.println("Пошел в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("Пошел в среднюю школу");
        } else if (ageChildren < 27) {
            System.out.println("Пошел в универ или в армию");
        } else if (ageChildren < 65) {
            System.out.println("Пошел на работу :'(");
        } else {
            System.out.println("Пошел на пенсию...");
        }
    }
}
