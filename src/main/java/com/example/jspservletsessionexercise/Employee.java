package com.example.jspservletsessionexercise;

import java.util.ArrayList;

public class Employee {
    private String name;
    private int age;
    private double salary;
    public Employee(){}
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static ArrayList<Employee> employees(ArrayList<Employee> emps){
        Employee e1= new Employee("Can",18,1500);
        Employee e2= new Employee("Ali",20,1900);
        Employee e3= new Employee("John",29,3000);
        Employee e4= new Employee("Jack",48,2300);

        emps.add(e1);
        emps.add(e2);
        emps.add(e3);
        emps.add(e4);

        return emps;
    }
}
