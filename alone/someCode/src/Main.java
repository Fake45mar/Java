import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, this soft is imitation standart university.\nYour role is professor.\nYour task is introduce yourself(choose subject, name, etc..)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        final String NAME = bufferedReader.readLine();
        System.out.println("Enter your age");
        final int AGE = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter subject that you will lecturer");
        final String SUBJECT = bufferedReader.readLine();
        Lector yourSelf = new Lector(NAME, AGE, SUBJECT);
        yourSelf.makeGroup();
        while(true){
            final int[] commands = {1, 2, 3, 4};
            System.out.println("1) 1 add student\n2) 2 remove student\n3) 3 get head of the group\n4) 4 choose head of the group");
            int variation = Integer.parseInt(bufferedReader.readLine());
            switch (variation){
                case 1:
                    yourSelf.addStudent();
                    break;
                case 2:
                    yourSelf.removeStudent();
                    break;
                case 3:
                    System.out.println(yourSelf.getHead());
                    break;
                case 4:
                    System.out.println("Which student do you wanna make a head of the group?");
                    int who = Integer.parseInt(bufferedReader.readLine());
                    who--;
                    yourSelf.chooseHeadOfGroup(who);
                    break;
                default:
                    break;
            }
        }
    }
}
