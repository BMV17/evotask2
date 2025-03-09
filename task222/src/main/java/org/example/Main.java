package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Введите дату в формате dd.MM.yyyy:");
        Scanner console = new Scanner(System.in);
        String strDate = console.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date parsingDate;
        try {
            Date date = format.parse(strDate);
            // System.out.println(format.format(date));

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DATE, 45);
            System.out.println("Дата после увеличения на 45 дней: " + format.format(calendar.getTime()));

            calendar.set(Calendar.MONTH, 0);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            System.out.println("Дата после сдвига на начало года: " + format.format(calendar.getTime()));

            calendar.setTime(date);
            String dayWeek = new SimpleDateFormat("EEEE").format(date);
            // System.out.println(dayWeek);
            if (dayWeek.equals("суббота")) {
                calendar.add(Calendar.DATE, 13);
                System.out.println("Дата после увеличения на 10 рабочих дней: " + format.format(calendar.getTime()));
            }
            if (dayWeek.equals("воскресенье")) {
                calendar.add(Calendar.DATE, 12);
                System.out.println("Дата после увеличения на 10 рабочих дней: " + format.format(calendar.getTime()));
            }
            if (!dayWeek.equals("суббота") && !dayWeek.equals("воскресенье")) {
                calendar.add(Calendar.DATE, 14);
                System.out.println("Дата после увеличения на 10 рабочих дней: " + format.format(calendar.getTime()));
            }

            System.out.println("Введите вторую дату в формате dd.MM.yyyy:");
            String strDate2 = console.nextLine();
            Date date2 = format.parse(strDate2);

            int answer = 0;


            if (date.after(date2)) {
                long difference1 = date.getTime() - date2.getTime();
                int days = (int) (difference1 / (24 * 60 * 60 * 1000));
                answer = (days/7)*5 + days%7;
                            }

            else {
                long difference2 = date2.getTime() - date.getTime();
                int days = (int) (difference2 / (24 * 60 * 60 * 1000));
                answer = (days/7)*5 + days%7;
                            }

            System.out.print("Количество рабочих дней между введенными датами: " + answer);}


        catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + format);
        }
    }
}
