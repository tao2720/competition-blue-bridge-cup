package lanqiao2013_Java_B;

import java.util.Calendar;

public class _01世纪末的星期 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        for (int year = 1999; year < 10000; year+=100) {

            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,11);//12月
            calendar.set(Calendar.DAY_OF_MONTH,31);
            if (calendar.get(Calendar.DAY_OF_WEEK)==1){
                System.out.println(year);
                break;
            }

        }
    }


}
