package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 3 числа");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        if (a%5 == 0 && b%5 == 0 && c%5 == 0)
            System.out.println("a=" + a + ", " + "b=" + b + ", " + "c="+ c);
        else if (a%5 == 0 && b%5 == 0)
            System.out.println("a=" + a + ", " + "b=" + b);
        else if (a%5 == 0 && c%5 == 0)
            System.out.println("a=" + a + ", " + "c=" + c);
        else if (b%5 == 0 && c%5 == 0)
            System.out.println("b=" + b + ", " + "c=" + c);
        else if (a%5 == 0)
            System.out.println("a=" + a );
        else if (b%5 == 0 )
            System.out.println("b=" + b );
        else if (c%5 == 0)
            System.out.println( "c=" + c);
        else System.out.println("нет значений, кратных 5");
        System.out.println("Результат целочисленного деления a на b:" + a/b);
        System.out.println("Результат деления a на b:" + (double)a/b);
        System.out.println("Результат деления a на b с округлением в большую сторону:" + Math.ceil((double)a/b));
        System.out.println("Результат деления a на b с округлением в большую сторону:" + Math.floor((double)a/b));
        System.out.println("Результат деления a на b с математическим округлением:" + Math.round((double)a/c));
        System.out.println("Остаток от деления b на c:" + b%c);
        System.out.println("Наименьшее значение из a и b:" + Math.min(a,b));
        System.out.println("Наибольшее значение из b и c:" + Math.max(b,c));






    }
}