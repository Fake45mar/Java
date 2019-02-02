import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Person {
    protected int age;
    protected String sex;
    protected int time;
    protected int min = 0;
    protected int max = 0;
    final int getTime(){
        Calendar cal =  Calendar.getInstance();
        Date date = cal.getTime();
        DateFormat  dateformate = new SimpleDateFormat("HH:mm:ss");
        String formatedDate = dateformate.format(date);
        String hours = formatedDate.substring(0,2);
        int now = Integer.parseInt(hours);
        return now;
    }
    final boolean requiredDrink(int clock){
        if(clock % 10 == 0){
            return true;
        }
        return false;
    }
    final boolean requiredEat(int clock){
        if(clock % 5 == 0){
            return true;
        }
        return false;
    }
}
