package Homework4.Task1Expert;

/*
Реализовать шаблон Builder для класса Human (атрибуты - возраст, имя, вес. Метод: инфо о человеке):
Для этого шаблона характерно:
1. приватный конструктор,
2. вложенный статический класс (HumanBuilder)
3. статический метод builder(), который возврашает экземпляр типа HumanBuilder.
Во время инициализации HumanBuilder, создается объект класса Human, и записывается в приватный атрибут.
4. Класс HumanBuilder имеет методы, которые имеют тоже самое название, что и атрибуты класса Human,
которые вызывают сеттеры у экземпляра класса Human.
5. HumanBuilder имеет метод build, который возвращает готовый объект типа Human.
Ожидаемый результат
    Human human = Builder.builder().name("Петр").age(20).weight(80).build();
    human.info()
    Петр - возраст 20, вес 80
 */

public class BuilderRunner {
    public static void main(String[] args) {
        Human human = Builder.builder().name("Петр").age(20).weight(80).build();
        human.info();
    }
}