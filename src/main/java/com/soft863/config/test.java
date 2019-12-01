package com.soft863.config;

import java.time.LocalDateTime;
import java.time.Period;

public class test {

    public static void main(String[] args) {

        String b = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a");
        stringBuffer.append(b);
        stringBuffer.append(1);
        System.out.println(stringBuffer.toString());

        LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime endTime = startTime.minusDays(7);

        int daysNum = Period.between(startTime.toLocalDate(), endTime.toLocalDate()).getDays();
        System.out.println(daysNum);
       /* String s1 = new String("123");
        String internS1 = s1.intern();
        String poolsS1 = "123";*/



    /*   String s7 = new String("abc");
        //     String s7 = new String("ab")+new String("c");
        System.out.println(s7==s7.intern());
        String s8 = "abc";
        String s9 = new String("abc");
        System.out.println(s7.intern());
        System.out.println(s7==s7.intern());
        System.out.println(s8==s7.intern());
        System.out.println(s9==s7.intern());
        System.out.println(s9.intern()==s7.intern());
*/
//        String str = "12";
      /*  String s = new String("1") + new String("2");
        System.out.println(s.intern() == s);*/

       /* Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1);
//        System.out.println(integer1 == integer2);
//        System.out.println(integer1.equals(integer1));

        int int1 = 1000;
        int int2 = 1000;
        System.out.println(integer1 == int1);
       *//* System.out.println(int1==int2);

        Integer i = new Integer(100);
        Integer j = 1000;
        Integer k = 1000;
        System.out.println(k==j);*//*

        String hello = "hello";
        String hel = "hel";
        String lo = "lo";
        System.out.println(hello == hel + "lo");

        String str1 = "abc";
        String str2 = new String("abc");
        System.out.println(str1 == str2);

//        String s = new String("1") + new String("2");
        String stra = "12";*/

    }


}
