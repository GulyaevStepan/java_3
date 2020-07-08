package ru.geekbrains.java_3;

import java.util.ArrayList;

public class Foo<T> {
    private T[] list;

    public Foo (T... list) {
        this.list = list;
    }

    public T[] getList() {
        return list;
    }

    public void change(int num1, int num2) {
        T obj = list[num1];
        list[num1] = list[num2];
        list[num2] = obj;
    }

    public ArrayList<T> toList () {
        ArrayList<T> result = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            result.add(list[i]);
        }
        return result;
    }
}
