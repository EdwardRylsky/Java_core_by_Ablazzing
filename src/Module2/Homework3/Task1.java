package Module2.Homework3;

/*
1. Создать класс User, с двумя атрибутами - int age, String name
2. Создать экземпляр класса HashSet<User>
3. Переопределить hashcode и equals у User так, чтобы при записи в HashSet, были только уникальные name юзера
 */

import java.util.HashSet;
import java.util.Objects;

public class Task1 {
    static class User{
        private int age = 0;
        private String name = "John";

        public User() {
        }

        public User(String name) {
            this.name = name;
        }

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return name.equals(user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            HashSet<User> users = new HashSet<>();

            users.add(new User("A"));
            users.add(new User("B"));
            users.add(new User("C"));
            users.add(new User(1, "A"));
            users.add(new User(9,"E"));
            users.add(new User(2,"A"));
            users.add(new User());
            users.add(new User("A"));
            users.add(new User("C"));
            users.add(new User("A"));

            System.out.println(users);
        }
    }
}
