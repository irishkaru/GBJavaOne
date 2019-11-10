package ru.geekbrains.java1.lesson4;

public class LessonFour {

    public static void employeesOver40(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > 40)
                System.out.println(arr[i].getFullName() + " " + arr[i].getPosition() + " " + arr[i].getPhone() + " " + arr[i].getSalary() + " " + arr[i].getAge());
        }
    }

    public static void main(String[] args) {

        //Cоздаем массив из 5 сотрудников.С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        Employee[] arr = new Employee[5];

        arr[0] = new Employee("Иванов Иван Иваныч", "Бухгалтер", "(902) 435-76-67", 35000, 1970);
        arr[1] = new Employee("Иванов Петр Сергевич", "Слесарь", "(940) 400-30-20", 15000, 1963);
        arr[2] = new Employee("Сидоров Александр Петрович", "Электрик", "(910) 623-15-67", 20000, 1986);
        arr[3] = new Employee("Черныш Семен Иваныч", "Крановщик", "(905) 856-90-34", 20000, 1979);
        arr[4] = new Employee("Никифоров Иван Сергеевич", "Водитель", "(902) 347-96-38", 15000, 1989);

        //Вывести сотрудников старше 40
        System.out.println("Сотрудники старше 40");
        employeesOver40(arr);


        //Вывести при помощи методов из пункта 3 ФИО и должность.
        System.out.println("Список сотрудников");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getFullName() + " " + arr[i].getPosition());
        }

        //Всем сотрудникам старше 45 увеличить зп на 5000
        for (int i = 0; i < arr.length; i++) {
            arr[i].setChangeSalary(45, 5000);

        }


    }
}
