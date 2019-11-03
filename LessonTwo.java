package ru.geekbrains.java1.lesson1;

import java.util.Arrays;

public class LessonTwo {

    public static void main(String[] args) {
       /* 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
       Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
       */

        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Task 1: "+ Arrays.toString(changeElementsArray(arr)));

        /*2 Задать пустой целочисленный массив размером 8.
         Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
         */
        System.out.println("Task 2: " + Arrays.toString(fillArray (new int [8])));

        /* Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
        написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
         */
        int[]arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Task 3: "+ Arrays.toString(multiplyElementsArray(arr3)));

        //Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
        int[]arr4 = {1, 5, 3, 2, 0, 4, 5, 2, -8, 8, 9, 1 };
        System.out.println("Task 4: "+ minMaxElements(arr4));

        /* Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
         *  заполнить его диагональные элементы единицами, используя цикл(ы);
         */
        int [][]arr5 = fillArraysDiagonal(new int[5][5]);
        System.out.println("Task 5: ");

        for (int i =0; i<arr5.length;i++){
            System.out.println(Arrays.toString(arr5[i]));
        }

        /*Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть
        true если в массиве есть место, в котором сумма левой и правой части массива равны.
        Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false
         */
        int[]arr6 = {1, 1, 1, 2, 1, 6};
        System.out.println("Task 6: "+  checkBalance(arr6));


        /*Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным),
        при этом метод должен циклически сместить все элементы массива на n позиций.
         */
        int[]arr7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Task 7: "+ Arrays.toString(shiftElements(arr7, 2)));
    }


    //Метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    public static int[] changeElementsArray(int[] arr) {
        for (int i =0; i<arr.length; i++) {
            arr[i] = (arr[i] == 0)? 1:0;
        }
        return arr;
    }

    //Метод, заполняющий его значениями 1 4 7 10 13 16 19 22;
    public static int[] fillArray(int[] arr) {
        int n = 1;
        for (int i =0; i<arr.length; i++) {
            arr[i] = n;
            n += 3;
        }
        return arr;
    }

    //Метод принимающий на вход массив и умножающий числа меньше 6 на 2
    public static int[] multiplyElementsArray(int[] arr) {
        for (int i =0; i<arr.length; i++) {
            arr[i] = (arr[i] < 6)? arr[i]*2:arr[i];
        }
        return arr;
    }

    //Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
    public static String minMaxElements(int[] arr) {
        int min = arr [0];
        int max = arr [0];

        for (int i =0; i<arr.length; i++) {
            min = (arr[i] < min)? arr[i]:min;
            max = (arr[i] > max)? arr[i]:max;
        }
        return "Min: "+ min + " Max: "+max;
    }

    // Метод заполняющий диагональные элементы единицами;
    public static int[][] fillArraysDiagonal(int[][]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i == j || i+j == arr.length-1) ? arr[i][j] = 1 : 0;
            }
        }
        return arr;
    }

    //Метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
    public static boolean checkBalance (int[]arr){
        //Высчитываем общую сумму
        int total_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            total_sum += arr[i];
        }

        if (total_sum % 2 != 0) {
            return false;
        }

        int sum_part = 0;
        for (int i = 0; i < arr.length; i++) {
            sum_part += arr[i];
            if (total_sum - sum_part == total_sum/2) {
                return true;
            }
        }
        return false;
    }

    // Метод должен циклически сместить все элементы массива на n позиций.
    public static int[] shiftElements(int[] arr, int n) {
        int[]brr = new int[arr.length]; //без вспомогательного массива не знаю
        int j =0;
        for (int i =0; i<arr.length; i++) {
            j = i + n;
            if (j >= arr.length) {
                j-=arr.length;
            }
            if (j <0) {
                j+=arr.length;
            }
             brr[j]=arr[i];

        }
        return brr;
    }
    ///8
    // Метод должен циклически сместить все элементы массива на n позиций.

}
