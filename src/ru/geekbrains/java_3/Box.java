package ru.geekbrains.java_3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> limit;

    public float getWeight() {
        if (limit.size() == 0) {
            return 0;
        }

        float weight = limit.get(0).getWeight() * limit.size();
        return weight;
    }

    public boolean compare(Box<?> another) {
        return this.getWeight() == another.getWeight();
    }

    public void addBox (Box<T> another) {
        for (int i = 0; i < limit.size(); i++) {
            another.addFruit(limit.get(i));
        }
        limit.clear();
    }

    public void addFruit (T newFruit) {
        limit.add(newFruit);
    }
}


