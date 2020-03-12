package com.codewithjava;

public class Main {

    public static void main(String[] args) {
	int salary = 150;
	int extraHours = 10;
	int rate = 15;

	int wage = calaculateWage (salary, extraHours, rate);
        System.out.println(wage);
    }

    public static int calaculateWage(
            int salary,
            int extraHours,
            int rate
    ){
        return  salary + (extraHours * rate );
    }
}
