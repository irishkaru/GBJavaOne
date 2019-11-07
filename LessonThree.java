package ru.geekbrains.java1.lesson3;


import java.util.Random;
import java.util.Scanner;

public class LessonThree {
    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int numberForWin;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';

    private static void initField() {
        System.out.print("Введите размер поля X(Ширина) и Y(Высота) через пробел>>> ");
        fieldSizeX = SCANNER.nextInt();
        fieldSizeY = SCANNER.nextInt();
        if (fieldSizeX <= fieldSizeY)
            System.out.printf("Введите количество символов для победы (от 2 до %d) через %s>>> ", fieldSizeX, "пробел");
        else
            System.out.printf("Введите количество символов для победы (от 2 до %d) через %s>>> ", fieldSizeY, "пробел");

        numberForWin = SCANNER.nextInt();

        field = new char[fieldSizeY][fieldSizeX];
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void showField() {
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print("|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.printf("Введите координаты X и Y (от 1 до %d) через %s>>> ", fieldSizeX, "пробел");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        field[y][x] = DOT_HUMAN;
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[y][x] = DOT_AI;
    }

    private static boolean checkDiagonalRight(char c, int x, int y) {

        int count = 0;

        for (int n = 0; n < numberForWin; n++) {
            if ((x + n < fieldSizeY) && (y + n < fieldSizeX)) {
                if (field[x + n][y + n] == c)
                    count += 1;
                else
                    break;

            }
        }

        if (count >= numberForWin)
            return true;

        return false;

    }

    private static boolean checkDiagonalLeft(char c, int x, int y) {

        int count = 0;

        for (int n = 0; n < numberForWin; n++) {
            if ((x - n >= 0) && (y + n < fieldSizeX)) {
                if (field[x - n][y + n] == c)
                    count += 1;
                 else
                    break;

            }
        }

        if (count >= numberForWin)
            return true;

        return false;
    }


    //Проверка строк
    private static boolean checkRows(char c, int x, int y) {

        int count = 0;

        for (int n = 0; n < numberForWin; n++) {
            if (x + n < fieldSizeY) {
                if (field[x + n][y] == c)
                    count += 1;
                else
                    break;

            }
        }

        if (count >= numberForWin)
            return true;

        return false;
    }

    //Проверка столбцов
    private static boolean checkColumns(char c, int x, int y) {

        int count = 0;

        for (int n = 0; n < numberForWin; n++) {
            if  (y + n < fieldSizeX) {
                if (field[x][y + n] == c)
                    count += 1;
                 else
                    break;

            }
        }

        if (count >= numberForWin)
            return true;

        return false;

    }

    private static boolean checkWin(char c) {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < numberForWin; j++) {

                if (checkDiagonalLeft(c, i, j) || checkDiagonalRight(c, i, j) || checkRows(c, i, j) || checkColumns(c, i, j))
                    return true;

            }

        }

        return false;
    }

    private static boolean isDraw() {
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                if (field[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initField();
        showField();
        while (true) {
            humanTurn();
            showField();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Human win!");
                break;
            }
            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }
            aiTurn();
            showField();
            if (checkWin(DOT_AI)) {
                System.out.println("Computer win!");
                break;
            }
            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }
        }

    }


}