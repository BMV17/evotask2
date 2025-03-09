package org.example;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задание 4.1
        System.out.println("Введите строку");
        Scanner console = new Scanner(System.in);
        String str1 = console.nextLine();
        System.out.println("Введите подстроку");
        String str2 = console.nextLine();
        String str3 = str1.replace(str2, " ");
        String str31 = str1.replace(str2, "  ");
        if (str2.length()==1)
            System.out.println("Подстрока'" + str2 + "' встречается " + (str31.length() - str1.length())  + " раза");
        if(str2.length()!=1 && !str1.equals(str2))
            System.out.println("Подстрока'" + str2 + "' встречается " + (str1.length() - str3.length())/(str2.length() - 1) + " раза");
        if(str2.length()!=1 && str1.equals(str2))
            System.out.println("Подстрока'" + str2 +"' встречается " + 1 + " раз");

        // Задание 4.2
        System.out.println("Введите строку");
        String str = console.nextLine();
        String str11 = str.replace("кака", "вырезано цензурой");
        String str22 = str11.replace("бяка", "вырезано цензурой");
        System.out.println(str22);

        // Задание 4.3
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        String strDate = console.nextLine();
        String str111 = strDate.substring(6,10);
        String str222 = strDate.substring(3,5);
        String str333 = strDate.substring(0,2);
        System.out.println(str111 + "-" + str222 + "-" + str333 );

        // Задание 4.4
        System.out.println("Введите дату в формате dd.MM.yyyy:");
        String strDate1 = console.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date parsingDate;
        try{
            Date date = formatter.parse(strDate1);
            SimpleDateFormat formatterNew = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(formatterNew.format(date));
        } catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + formatter);
        }
    }
}