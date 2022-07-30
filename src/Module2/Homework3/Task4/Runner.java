package Module2.Homework3.Task4;

/*
1. Создать аннотацию GetMetaData, которая может быть над атрибутом, методом, классом
2. Создать класс UserMeta, с атрибутом String name, int count, методом GetSuperName(String prefix)
3. Создать обработчик аннотации GetMetaData, так чтобы:
3.1 При нахождении @GetMetaData над классом, то печатаем все атрибуты класса
3.2 При нахождении @GetMetaData над атрибутом, чтобы печаталось значение атрибута этого поля
3.3 При нахождении @GetMetaData над методом, печатаем сколько времени выполнялся метод.
4. Создаем класс Runner, запускаем
 */

import java.lang.reflect.*;
import java.util.HashMap;

public class Runner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        UserMeta userMeta = new UserMeta();
        HashMap<String, String> map = new HashMap<>();

        //Обработка аннотаций в классе
        if (userMeta.getClass().isAnnotationPresent(GetMetaData.class)) {
            Field[] declaredFields = userMeta.getClass().getDeclaredFields();
            for (Field declaredField : declaredFields) {
                System.out.println(declaredField);
            }
        }

        //Обработка аннотаций в поле
        Field[] declaredFields = userMeta.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(GetMetaData.class)) {
                declaredField.setAccessible(true);
                System.out.println(declaredField.get(userMeta));
            }
        }

        //Обработка аннотаций в методе
        for (Method declaredMethod : userMeta.getClass().getDeclaredMethods()) {
            if (declaredMethod.getName().equals("GetSuperName")) {
                if (declaredMethod.isAnnotationPresent(GetMetaData.class)) {
                    GetMetaData annotation = declaredMethod.getAnnotation(GetMetaData.class);
                    long start = System.currentTimeMillis();
                    declaredMethod.invoke(userMeta, "Prefix");
                    long end = System.currentTimeMillis();
                    System.out.println("Время выполнения метода '" + declaredMethod + "' составило: " + (end - start) + " миллисекунд");
                }
            }
        }
    }
}
