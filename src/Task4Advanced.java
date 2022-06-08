/*
    В слове "Hello world!" заменить все l на r, сделать все буквы заглавными, выбрать первые 8 символов
 */

public class Task4Advanced {
    public static void main(String[] args) {
        String str = "Hello world!";

        System.out.println(str.replace('l', 'r').toUpperCase().substring(0,7));
    }
}
