import java.util.*;
public class Player extends Person {
    public Player(int clock, int old, String male, int deplojedObj){
        age = old;
        time = clock;
        sex = male;
        min = deplojedObj;
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                max = getTime();
            }
        }, 5000);
        boolean requiredDrink = requiredDrink(max);
        boolean requiredEat = requiredEat(max);
        getAction(requiredDrink, requiredEat);
    }
    public String getAction(boolean one, boolean two){
        String action = new String("");
        if(one){
            action = "You have to eat!";
        }
        if(two){
            action = "You have to drink!";
        }
        if(one && two){
            action = "You have to drink and eat!";
        }
        return action;
    }
}
