package datetest;

import java.time.LocalDate;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();  //不用构造函数
        Date ad = new Date();
        String as = new String();  //要用new构造
        System.out.println(d);
        System.out.println(ad);
    }
}
