package ru.geekbrains.java1.lesson5;

public abstract class Animal {
    protected String name;
    protected String color;

    protected float runLimit;
    protected float swimLimit;
    protected float jumpLimit;

    protected Animal(String name, String color,
                     float runLimit, float swimLimit, float jumpLimit){
        this.name = name;
        this.color = color;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    void run(float distance){
        if (distance < runLimit)
        System.out.println(name + " runs a distance "+ distance + " метров.");
        else
            System.out.println(name + " runs a distance "+ runLimit + " метров.");
    }

    void jumpOver(float height){
        if (height < jumpLimit)
        System.out.println(name + " jumps over a barrier in height "+ height + " метров.");
        else
            System.out.println(name + " jumps over a barrier in height "+ jumpLimit + " метров.");
    }

    void swim(float distance) {
        if (distance < swimLimit)
            System.out.println(name + " swims a distance " + distance + " метров.");
        else
            System.out.println(name + " swims a distance " + swimLimit + " метров.");
    }
}
