package Module2.Homework3;

import java.util.HashMap;
import java.util.Objects;

/*
Создать класс CarBroken
Создать экземпляра класса HashMap<CarBroken, Integer>
Переопределить hashcode и equals так, чтобы при вставке любого CarBroken в HashMap,
всегда CarBroken попадал в один бакет.
 */
public class Task3 {
    static class CarBroken {
        private int serialNumber = 0;
        private String model = "Lada";

        public CarBroken() {
        }

        public CarBroken(int serialNumber, String model) {
            this.serialNumber = serialNumber;
            this.model = model;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CarBroken carBroken = (CarBroken) o;
            return serialNumber == carBroken.serialNumber && Objects.equals(model, carBroken.model);
        }

        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public String toString() {
            return "CarBroken{" +
                    "serialNumber=" + serialNumber +
                    ", model='" + model + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        HashMap<CarBroken, Integer> carBrokenMap = new HashMap<>();

        carBrokenMap.put(new CarBroken(), 5);
        carBrokenMap.put(new CarBroken(1, "A"), 5);
        carBrokenMap.put(new CarBroken(1, "B"), 5);
        carBrokenMap.put(new CarBroken(1, "C"), 5);
        carBrokenMap.put(new CarBroken(1, "D"), 5);
        carBrokenMap.put(new CarBroken(1, "E"), 5);

        System.out.println(carBrokenMap);

    }
}
