package ru.geekbrains.java1.lesson5;

public class Dog extends Animal {

    private static final float defaultRunLimit = 500f;
    private static final float defaultSwimLimit = 10f;
    private static final float defaultJumpLimit = 0.5f;

    public Dog(String name, String color,
                 float runLimit, float swimLimit, float jumpLimit){
        super(name, color, runLimit, swimLimit, jumpLimit);
    }

    public Dog(String name, String color){
        super(name, color, defaultRunLimit, defaultSwimLimit, defaultJumpLimit);
    }
}
