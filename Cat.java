package ru.geekbrains.java1.lesson5;

public class Cat extends Animal {

    private static final float defaultRunLimit = 200f;
    private static final float defaultSwimLimit = 0f;
    private static final float defaultJumpLimit = 2f;

    public Cat(String name, String color,
               float runLimit, float jumpLimit) {
        super(name, color, runLimit, defaultSwimLimit, jumpLimit);
    }

    public Cat(String name, String color) {
        super(name, color, defaultRunLimit, defaultSwimLimit, defaultJumpLimit);
    }

    @Override
    void swim(float distance) {
        System.out.println(name + " can not swim");
    }
}
