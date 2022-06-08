/*
        //Даны переменные String hi, world и char newLine
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже)
        //затроить (Можно вызвать тольку одну команду System.out.print())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!
 */

import java.util.Locale;

public class Task1 {

    public static void main(String[] args) {
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            stringBuilder.append(hi.trim());
            stringBuilder.append(world.toLowerCase());
            stringBuilder.append(newLine);
        }

        System.out.println(stringBuilder);
    }
}
