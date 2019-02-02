import java.util.*;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]) {
//        day dayOne = new day();
//        dayOne.setDays(20);
//        dayOne.getDays();
        int number = input.nextInt();input.nextLine();
        char[] str = new char[20];
        str = Integer.toString(number).toCharArray();
        System.out.println(str);
    }
}
