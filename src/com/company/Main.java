package com.company;

public class Main {

    public static void main(String[] args) {
        String str = String.format("%.2f", Calculator.plus(1, 2));
        System.out.println(str);
        String str_1 = String.format("%.2f", Calculator.minus(1, 2));
        System.out.println(str_1);
        String str_2 = String.format("%.2f", Calculator.multiplication(1, 2));
        System.out.println(str_2);
        String str_3 = String.format("%.2f", Calculator.percent(1, 2));
        System.out.println(str_3);
    }
}

class Calculator {
    static double plus (double numone, double numtwo){
        return numone + numtwo;
    }
    static double minus (double numone, double numtwo){
        return numone - numtwo;
    }
    static double multiplication (double numone, double numtwo) {
        return numone * numtwo;
    }
    static double devision (double numone, double numtwo){
        return numone / numtwo;
    }
    static double percent (double numone, double numtwo){
        return (numone / 100) * numtwo;
    }
}