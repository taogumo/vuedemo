package com.soft863;

import java.text.ParseException;
import java.util.Random;

public class test {

    public static void main(String[] args) throws ParseException, InterruptedException {

        double r = Math.random();
        System.out.println(r);
        r = Math.random();
        System.out.println(r);
        System.out.println(Math.ceil(1.645));
        System.out.println(Math.floor(1.645));
        Random random = new Random();
        System.out.println(random.nextInt(11));
        System.out.println(random.nextInt(11));
        System.out.println(random.nextInt(11));
        System.out.println(random.nextInt(11));
       /* System.out.println(0.2 + 0.1);
        System.out.println(0.2 - 0.1);
        System.out.println(0.2 * 0.1);
        System.out.println(0.2 / 0.1);
        BigDecimal bigDecimal = new BigDecimal("0.2232423");
        BigDecimal bigDecimal1 = new BigDecimal("0.1");
        double d = bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
        BigDecimal bigDecimal2 = bigDecimal.add(bigDecimal1);
        System.out.println(bigDecimal2);*/
      /*  Date date = new Date();
        System.out.println(date);
        date = new Date(System.currentTimeMillis());
        System.out.println(date);
        long dtime = date.getTime();
        System.out.println(dtime);
        System.out.println(System.currentTimeMillis());
        boolean isAfter = date.after(new Date());
        System.out.println(isAfter);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss");
        String time = simpleDateFormat.format(date);
        System.out.println(time);
        Date date1 = simpleDateFormat.parse(time);
        System.out.println(date1);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 2, 3);
        calendar.setTime(date);
        int year = calendar.getActualMaximum(Calendar.DATE);
        System.out.println(calendar);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time11 = localDateTime.format(dateTimeFormatter);
        System.out.println(time11);
        Period.between(localDateTime.toLocalDate(), localDateTime.toLocalDate()).getDays();
        LocalDateTime instantStart = LocalDateTime.now();
        Thread.sleep(1000);
        LocalDateTime instantEnd = LocalDateTime.now();
        long second = Duration.between(instantStart, instantEnd).getSeconds();

        Instant now = Instant.now();
        System.out.println("now:"+now);
        Instant nowBeijing = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));
        System.out.println("now:"+nowBeijing);
*/

    }
}
