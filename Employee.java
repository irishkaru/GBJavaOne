/*

* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
*** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался
личный уникальный идентификационный порядковый номер
 */


package ru.geekbrains.java1.lesson4;


public class Employee {
    private int ID;
    private String fullName;
    private String position;
    private String phone;
    private int salary;
    private int birthYear;
    private static int count = 0;


    private Employee() {
        this.count++;
        this.ID = this.count;
    }

    public Employee(String fullName, String position, String phone, int salary, int birthYear) {
        this();
        this.fullName = fullName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birthYear = birthYear;
    }

    public String getFullName() {
        return fullName;
    }
    public String getPosition() {
        return position;
    }
    public String getPhone() {
        return phone;
    }
    public int getSalary() {
        return salary;
    }

    public int getAge(){
        return 2019 -birthYear;
    }


    void setChangeSalary(int age, int sum){
        if (this.getAge() > age) {
            this.salary = this.salary + sum;
        }

    }





}
