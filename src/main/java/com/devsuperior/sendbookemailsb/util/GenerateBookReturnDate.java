package com.devsuperior.sendbookemailsb.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GenerateBookReturnDate {

    public static int numDaysToReturnBook = 7;
    private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static String getDate(Date loan_date) {
        Calendar calendar = dateToCalendar(loan_date);
        calendar.add(Calendar.DATE, numDaysToReturnBook);
        return dateFormat.format(calendarToDate(calendar));
    }

    private static Object calendarToDate(Calendar calendar) {
        return calendar.getTime();
    }

    private static Calendar dateToCalendar(Date loan_date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(loan_date);
        return calendar;
    }
}
