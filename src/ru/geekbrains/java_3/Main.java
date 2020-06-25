package ru.geekbrains.java_3;

public class Main {

    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box2.addFruit(new Apple());
        box3.addFruit(new Orange());
        box1.addBox(box2);
        //box2.addBox(box3); Ошибка
    }
}
