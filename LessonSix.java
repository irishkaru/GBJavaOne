package ru.geekbrains.java1.lesson6;

import java.io.*;
import java.lang.*;

public class LessonSix {

    public static void createFile(String path) {
        File file = new File(path);
        try {
            if (file.createNewFile())
                System.out.println("File has been created");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fillFile(String path, String str) {
        try {
            FileOutputStream f = new FileOutputStream(path, true);
            f.write(str.getBytes());
            f.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void finderWord(String path, String word){
        StringBuilder sb = new StringBuilder("");
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String s;
            while ((s = br.readLine()) != null)
                sb.append(s);

            System.out.println(" " + sb.toString().contains(word));

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
//        String currentDirectory = System.getProperty("user.dir");
//        System.out.println("The current working directory is " + currentDirectory);

        String path = "/Users/irishka/Documents/study/java/FilesForLesson";

        File dir = new File(path);

        if (dir.exists())
            System.out.println("Folder exist yet");
        else {
            boolean created = dir.mkdir();
            if (created)
                System.out.println("Folder has been created");
        }

        // создадим 2 файла
        createFile(path + "/f1.txt");
        createFile(path + "/f2.txt");

        try {
            //Заполняем файлы
            String str = "Hello, World! My name Irina Taranchieva. I am studying in GeekBrains.";
            fillFile(path + "/f1.txt", str);

            String str1 = "I like to learn new thing. I am learning Java now. It is interesting.";
            fillFile(path + "/f2.txt", str1);

            //Создаем поток input и из файла 2 данные копируем в файл 1
            FileInputStream fin = new FileInputStream(path + "/f2.txt");
            FileOutputStream fout = new FileOutputStream(path + "/f1.txt");

            while (fin.available() > 0)
                fout.write(fin.read());
            fin.close();
            fout.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Поиск в файле f1.txt словосочетания I like");
        finderWord(path + "/f1.txt", "I like");

        System.out.println("Поиск в каталоге словосочетания I like");
        File folder = new File(path);
        File[] listF = folder.listFiles();

        for (File file : listF) {
            if (file.isFile()) {
                System.out.print(file.getName());
                finderWord(file.toString(),"I like");
            }
        }
    }
}

