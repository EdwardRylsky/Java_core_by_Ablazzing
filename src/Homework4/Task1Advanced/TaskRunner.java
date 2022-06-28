package Homework4.Task1Advanced;

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
