package com.codewithjava;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.salary = 20_000;
        employee.rate = 25;
        int wage  = employee.calculateWage(extraHours: 10);

        System.out.println(wage);

    }
}
