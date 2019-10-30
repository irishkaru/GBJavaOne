package ru.geekbrains.java1.lesson1;

import apple.laf.JRSUIConstants;
import sun.security.util.ManifestDigester;

import java.util.Scanner;

public class LessonOne {
    public static void main(String[] args) {

        System.out.println("Домашнее задание по Java!");

        // Задание 2: создание переменных всех пройденных типов данных, и инициализировать их значения
        // вывожу переменные для себя
        int i = 56;
        System.out.println("i = " + i);

        byte b1 = 1;
        System.out.println("b = " + b1);

        short sh = -2;
        System.out.println("sh = " + sh);

        long l = -9223372;
        System.out.println("l = " + l);

        float f = 34.56f;
        System.out.println("f = " + f);

        double d1 = -78.6667;
        System.out.println("d = " + d1);

        char ch = 2000;
        System.out.println("ch = " + ch);

        boolean bo = false;
        System.out.println("bo = " + bo);

        //Задание 3: вычислить выражение a * (b + (c / d)
        System.out.println("\nЗадание 3. Вычислим выражение a * (b + (c / d) " );

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число а = ");
        int a = scan.nextInt();

        System.out.print("Введите число b = ");
        int b = scan.nextInt();


        System.out.print("Введите число c = ");
        int c = scan.nextInt();

        System.out.print("Введите число d = ");
        int d = scan.nextInt();

       float res =  calculate(a,b,c,d);

        System.out.println(a+ " * (" +b + " +("+ c +" / "+d+") = " + res + "\n");

        // Задание 4 метод, проверяем сумму двух чисел, лежит ли она в пределах от 10 до 20(включительно),
        // если да – вернуть true, в противном случае – false;

        System.out.println("Задание 4 (a + b) > = 10  и  < = 20");
        System.out.print("Введите число а = ");
        int a4 = scan.nextInt();

        System.out.print("Введите число b = ");
        int b4 = scan.nextInt();

        System.out.print("("+a4 + " + " + b4+") > = 10 и < = 20  " + summa(a4, b4));

        //Задание 5 проверяем положительное или отрицательное число
        System.out.print("\n\nЗадание 5. Проверяем число положительное или отрицательное. \nВведите число ");
        int a5 = scan.nextInt();
        znak(a5);

        //Задание 6 отрицательное ли число
        System.out.print("\nЗадание 6. Проверяем отрицательное ли число. \nВведите число ");
        int a6 = scan.nextInt();

        System.out.println(proverkaOtr(a6));

        //Задание 7 Печатаем имя
        System.out.print("\nЗадание 7. Приветствуем пользователя. \nВведите имя ");
        String str = scan.next();

        printMyText(str);

        //Задание 8. Определяем высокосный год или нет.
        System.out.print("\nЗадание 8. Определяем высокосный ли год. \nВведите год в виде целого числа ");
        int god = scan.nextInt();
        proverkaGoda(god);


        // write your code here
    }
    // Метод вычисляет выражение a * (b + (c / d))
    public static float calculate(int a, int b, int c, int d) {

       return  (float)a * ((float)b + ((float)c / (float)d));

    }

    // Метод проверяет лежит ли сумма чисел a и b в пределах от 10 до 20 (вкл)
    public static boolean summa (int a, int b) {
        int s = a + b;
         if (s >= 10 && s <= 20) {
             return true;
         }
        else {
            return false;
        }
    }

    //Метод проверяет отрицательное число или положительное
    public static void znak(int a) {

        if (a >=0 ) {
            System.out.println("Число " + a + " положительное");
        }
        else {
            System.out.println("Число " + a + " отрицательное");
        }

    }

    //Метод выводит true, если число отрицательное
    public static boolean proverkaOtr(int a) {

        if (a < 0 ) {
            return (true);
        }
        else {
            return (false);
        }

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
