package Module1.Homework1;/*
    Создать метод маскирования персональных данных, который:
    Телефон (до/после маскирования): 79991113344 / 7999***3344
    Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
    Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.

    Входящие параметры: String text
    Возвращаемый результат: String

    Примеры возможного текста:
    <client>(Какие-то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>
    "<client>(Какие-то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"

    <client>(Какие-то данные)<data></data></client> - "<client>(Какие то данные)<data></data></client>"

    <client>(Какие-то данные)<data>Иванов Иван Иванович;79991113344</data></client>
    "<client>(Какие-то данные)<data>И****в Иван И.;7999***3344</data></client>"
 */

import java.util.Scanner;

public class Task1Expert {
    public static void main(String[] args) {

        String input;
        String dataContent;

        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        System.out.println("Введите строку данных: ");
        input = scanner.nextLine();

        if (input.contains("<data></data>")) {
            System.out.println(input);
        } else {
            result.append(input, 0, input.indexOf("<data>") + "<data>".length());

            dataContent = input.substring(input.indexOf("<data>") + "<data>".length(), input.indexOf("</data>"));
            String[] dataArray = dataContent.split(";");

            for (int i = 0; i < dataArray.length; i++) {
                if (dataArray[i].matches("[0-9]{11}")) {
                    result.append(maskingPhoneNumber(dataArray[i]));
                }

                if (dataArray[i].contains("@")) {
                    result.append(maskingMail(dataArray[i]));
                }

                if (dataArray[i].contains(" ")) {
                    result.append(maskingFIO(dataArray[i]));
                }
                if (i < dataArray.length - 1) {
                    result.append(";");
                }
            }

            result.append(input.substring(input.indexOf("</data>")));
        }

        System.out.println(result);
    }

    // 79991113344 -> 7999***3344
    public static String maskingPhoneNumber(String phoneNumber) {
        return phoneNumber.substring(0, 4) + "***" +
                phoneNumber.substring(6);
    }

    // test@yandex.ru -> tes*@******.ru
    public static String maskingMail(String mail) {
        StringBuilder result = new StringBuilder();

        int atIndex = mail.indexOf("@");
        int firstDotAfterAt = mail.indexOf('.', atIndex);

        result.append(mail, 0, atIndex - 1);
        result.append("*@");

        result.append("*".repeat(Math.max(0, firstDotAfterAt - atIndex - 1)));
        result.append(mail.substring(firstDotAfterAt));

        return result.toString();
    }

    // Иванов Иван Иванович -> И****в Иван И.
    public static String maskingFIO(String FIO) {
        StringBuilder result = new StringBuilder();
        String[] FIOArray = FIO.split(" ");

        // Фамилия
        result.append(FIOArray[0].charAt(0));
        result.append("*".repeat(Math.max(0, FIOArray[0].length() - 2)));
        result.append(FIOArray[0].charAt(FIOArray[0].length() - 1)).append(" ");

        // Имя
        result.append(FIOArray[1]).append(" ");

        // Отчество
        result.append(FIOArray[2].charAt(0)).append(".");

        return result.toString();
    }
}
