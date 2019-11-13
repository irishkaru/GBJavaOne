package ru.geekbrains.java1.lesson5;

public class LessonFive {
    public static void main (String[] args){
        Animal[] zoo = {new Dog("Zuchka","black"),
                new Cat("Pirat","white"),
                new Dog ("Polkan", "red", 600, 20, 1),
                new Bird("Kesha", "white", 300),
                new Horse("Belii", "white")};

        for (int i = 0; i <zoo.length; i++){
            zoo[i].run(1100);
            zoo[i].swim(50);
            zoo[i].jumpOver(3);
        }
    }
}
