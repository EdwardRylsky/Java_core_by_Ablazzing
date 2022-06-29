package Homework4.Task1Advanced;

/*
Создать следующую структуру из классов и интерфейсов:
	дерево -> ель (имеет шишки, умеет пахнуть)
	дерево -> сосна (имеет шишки, умеет пахнуть)
	растение -> роза (умеет цвести, умеет пахнуть)
	растение -> папоротник (умеет цвести)
Создать у каждого класса по объекту, распределить по массивам интерфейсов
И у каждого массива вызвать характерный метод
Ожидание:
	сосна : умеет пахнуть
	ель : умееть пахнуть
	роза: умееть пахнуть
	роза: умеет цвести
	папоротник: умеет цвести
 */
import java.util.ArrayList;

public class TaskRunner {
    public static void main(String[] args) {
        ArrayList<Bloomable> bloomables = new ArrayList<>();
        ArrayList<Coneable> coneables = new ArrayList<>();
        ArrayList<Smellable> smellables = new ArrayList<>();

        Object[] objects = {new Pine(), new Rose(), new Spruce(), new Fern()};
        for (Object object : objects) {
            if (object instanceof Bloomable) {
                bloomables.add((Bloomable) object);
            }

            if (object instanceof Coneable) {
                coneables.add((Coneable) object);
            }

            if (object instanceof Smellable) {
                smellables.add((Smellable) object);
            }
        }

        for (Bloomable bloomable : bloomables) {
            bloomable.bloom();
        }

        for (Smellable smellable : smellables) {
            smellable.smell();
        }

        for (Coneable coneable : coneables) {
            coneable.cone();
        }
    }
}
