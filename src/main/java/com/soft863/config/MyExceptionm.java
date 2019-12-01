package com.soft863.config;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyExceptionm extends Exception {
    private String detail;

    public MyExceptionm(String detail) {
        this.detail = detail;
    }

    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        //时间转换
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //推迟当前时间方法
        System.out.println("当前时间转换" + currentTime.format(formatter));
        LocalDateTime date_test1 = currentTime.plusDays(1);
        LocalDateTime date_test2 = currentTime.plusHours(2);
        LocalDateTime date_test3 = currentTime.plusMinutes(3);
        LocalDateTime date_test4 = currentTime.plusMonths(4);
        LocalDateTime date_test5 = currentTime.plusYears(5);
        LocalDateTime date_test6 = currentTime.plusWeeks(1);

    }
}
