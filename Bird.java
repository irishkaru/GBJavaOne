package ru.geekbrains.java1.lesson5;

public class Bird extends Animal{

    private static final float defaultRunLimit = 5f;
    private static final float defaultSwimLimit = 0f;
    private static final float defaultJumpLimit = 0.2f;
    private float height;

    public Bird(String name, String color, float height,
                float runLimit, float jumpLimit){
        super(name, color, runLimit, defaultSwimLimit, jumpLimit);

        this.height = height;
    }

    public Bird(String name, String color, float height){
        super(name, color, defaultRunLimit, defaultSwimLimit, defaultJumpLimit);
        this.height = height;
    }

    @Override
    void swim(float distance) {
        System.out.println(name + " can not swim");
    }
}
