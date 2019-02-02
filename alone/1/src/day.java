public class day {
    public int second;
    public int hours;
    public int days;
    public void setDays(int amount){
        days = amount;
        hours = 24 * days;
        second = 60*60*24*days;
    }
    public void getDays(){
        System.out.println("Days - " + days + " Hours - " + hours + " second - " + second);
    }
}
