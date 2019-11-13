package ru.geekbrains.java1.lesson5;

public class Horse extends Animal{
    private static final float defaultRunLimit = 500f;
    private static final float defaultSwimLimit = 10f;
    private static final float defaultJumpLimit = 0.5f;

    public Horse(String name, String color,
                 float runLimit, float swimLimit, float jumpLimit){
        super(name, color, runLimit, swimLimit, jumpLimit);
    }

    public Horse(String name, String color){
        super(name, color, defaultRunLimit, defaultSwimLimit, defaultJumpLimit);
    }
}
