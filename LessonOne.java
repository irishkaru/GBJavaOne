package ru.geekbrains.java1.lesson1;


import java.util.Scanner;

public class LessonOne {
    public static void main(String[] args) {

        System.out.println("Домашнее задание по Java!");

        // Задание 2: создание переменных всех пройденных типов данных, и инициализировать их значения


        //Задание 3: вычислить выражение a * (b + (c / d)
        System.out.println("\nЗадание 3. Вычислим выражение a * (b + (c / d) " + calculate(3,5,11,4) );


        // Задание 4 метод, проверяем сумму двух чисел, лежит ли она в пределах от 10 до 20(включительно),
        // если да – вернуть true, в противном случае – false;

        System.out.println("\nЗадание 4 (a + b) > = 10  и  < = 20");
        Scanner scan = new Scanner((System.in));

        System.out.print("Введите число а = ");
        int a4 = scan.nextInt();

        System.out.print("Введите число b = ");
        int b4 = scan.nextInt();

        System.out.print(summa(a4, b4));

        //Задание 5 проверяем положительное или отрицательное число
        System.out.print("\n\nЗадание 5. Проверяем число положительное или отрицательное. ");
        znak(-5);

        //Задание 6 отрицательное ли число
        System.out.print("\nЗадание 6. Проверяем отрицательное ли число. ");
        System.out.println(proverkaOtr(57));

        //Задание 7 Печатаем имя
        System.out.print("\nЗадание 7. Приветствуем пользователя. ");
        printMyText("Anybody");

        //Задание 8. Определяем высокосный год или нет.
        System.out.print("\nЗадание 8. Определяем высокосный ли год. \nВведите год в виде целого числа ");
        int god = scan.nextInt();
        proverkaGoda(god);


    }
    // Метод вычисляет выражение a * (b + (c / d))
    public static float calculate(int a, int b, int c, int d) {

       return  a * (b + (c * 1.0f / d));

    }

    // Метод проверяет лежит ли сумма чисел a и b в пределах от 10 до 20 (вкл)
    public static boolean summa (int a, int b) {
        int s = a + b;
         return  (s >= 10 && s <= 20);
    }

    //Метод проверяет отрицательное число или положительное
    public static void znak(int a) {

        String str = (a >=0 )? " положительное":" отрицательное";
        System.out.println("Число " + a + str);
        
    }

    //Метод выводит true, если число отрицательное
    public static boolean proverkaOtr(int a) {

        return (a < 0 );

    }

    //Метод печатает сообщение «Привет, указанное_имя!»
    public static void printMyText(String txtToPrint) {

        System.out.println("Привет, " + txtToPrint);
    }

    //Метод проверяет высокосный ли год и печатает сообщение
    public static void proverkaGoda(int g) {
        if (g % 4 ==0 && g % 100!=0 ||g % 400==0) {
            System.out.println("Год " + g + " высокосный");
        }
        else {
            System.out.println("Год " + g + " не высокосный");
        }
    }

}
