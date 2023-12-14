package com.swap.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class DateCheck {

    public static void main(String[] args) throws ParseException {
        String validityStart = "13032000";
        String validityEnd   = "13042030";
        DateFormat df = new SimpleDateFormat("ddMMyyyy");

        Date startDate = df.parse(validityStart);
        Date endDate = df.parse(validityEnd);

        Calendar mndtStartDate = Calendar.getInstance();
        mndtStartDate.setTime(startDate);
        int mndtStartYear = mndtStartDate.get(Calendar.YEAR);
        int mndtStartMonth = mndtStartDate.get(Calendar.MONTH);
        int mndtStartDay = mndtStartDate.get(Calendar.DAY_OF_MONTH);
        mndtStartMonth++;//As observed Calendar.get(Calendar.MONTH) returns months starts from 0 (zero) index\

        Calendar mndtEndDate = Calendar.getInstance();
        mndtEndDate.setTime(endDate);
        int mndtEndYear = mndtEndDate.get(Calendar.YEAR);
        int mndtEndMonth = mndtEndDate.get(Calendar.MONTH);
        int mndtEndDay = mndtEndDate.get(Calendar.DAY_OF_MONTH);
        mndtEndMonth++;//As observed Calendar.get(Calendar.MONTH) returns months starts from 0 (zero) index

        System.out.println("--date traces=" + mndtStartYear + "," + mndtStartMonth + "," + mndtStartDay + "," + mndtEndYear + "," + mndtEndMonth + "," + mndtEndDay);
        LocalDate finalMndtStartDate = LocalDate.of(mndtStartYear, mndtStartMonth, mndtStartDay);
        LocalDate finalMndtEndDate = LocalDate.of(mndtEndYear, mndtEndMonth, mndtEndDay);
        Period dateDiff = Period.between(finalMndtStartDate, finalMndtEndDate);
        long years = dateDiff.getYears();
        System.out.println("years diff initially  :" + years);
        int monthsDiff = dateDiff.getMonths();
        System.out.println("months Diff   :" + monthsDiff);
        long totalMonths = (years*12) + monthsDiff;
        System.out.println("totalMonths diff finally  :" + totalMonths);
        if (totalMonths > 360) {
            System.out.println("invalid mandate date range - from and to-date range must be within 30 years of limit");
        }
    }

}
