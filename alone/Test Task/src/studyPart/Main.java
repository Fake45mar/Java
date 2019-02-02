package studyPart;
import java.util.*;
public class Main {
    static boolean praroster = false;
    static Scanner input = new Scanner(System.in);
    static int[] course = new int[10];
    static String[] name = new String[10];
    static int loop = -1;
    static Object[] group = new Object[10];
    static boolean[] voice = new boolean[10];
    public static void main(String args[]){
        System.out.println("Привет мир, это моя первая программа!");
        System.out.println("Выберите действие из перечисленных(Добавить студента, выбрать старосту, проверить наличие студентов))");
        chooseAction();
        System.out.println(Arrays.asList(name));
    }
    public static void chooseAction(){
        System.out.println("Список команд следующий" +
                " Добавить, " + " Выбрать, " + " Проверить ");
        String switchAct = input.nextLine();
        switch (switchAct){
            case "Добавить":
                addStudent();
                break;
            case "Выбрать":
                chooseThePraepostor();
                break;
            case "Проверить":
                verifStudent();
                break;
            default:
                System.out.println("Ваша команда введена не корректно!");
                chooseAction();
        }
    }
    public static void addStudent() {
        loop++;
        if (loop >= 10) {
            System.out.println("Группа полная");
            chooseAction();
        }
        else {
            Student stud = new Student();
            stud.Student();
            group[loop] = stud.group;
            course[loop] = stud.course;
            name[loop] = stud.name;
            stud.praepost = praroster;
            chooseAction();
        }
    }
    public static void chooseThePraepostor() {
        int loopTrue = 0, loopFalse = 0;
        System.out.println("Выбор старосты дело ответственное, выберите номер человека по списку");
        System.out.println(Arrays.asList(name));
        int num = input.nextInt();
        input.nextLine();
        num -= 1;
        if (praroster == true) {
            System.out.println(name[num] + " Староста!");
        } else {
            System.out.println("Голосование");
            for (int i = 0; i < voice.length - 1; i++) {
                if (name[i] == null) {
                    continue;
                } else {
                    voice[i] = input.nextBoolean();
                    input.nextLine();
                    if (voice[i] == true) {
                        //System.out.println("+1");
                        loopTrue++;
                    } else {
                        //System.out.println("-1");
                        loopFalse++;
                    }
                }
            }
            if (loopTrue > loopFalse) {
                System.out.println("Работает!");
                praroster = true;
                System.out.println(name[num] + "- Староста!");
                chooseAction();
            } else {
                System.out.println("Работает");
                praroster = false;
                System.out.println(name[num] + "- К сожалениею не староста!");
                chooseAction();
            }
        }
    }
    public static void verifStudent(){
        int loopTrue = 0, loopFalse = 0;
        for(int i = 0;i < name.length;i++){
            if(name[i] == null){
                loopTrue++;
                System.out.println("Студент под номером " + i + " Отсутствует!");
            }
            else{
                loopFalse++;
                System.out.println("Студент под номером " + i + " Присутствует!");
            }
        }
        if(loopFalse++ > loopTrue){
            if(loopFalse == 10){
                System.out.println("Не пришла вся группа!");
            }
            else{
                System.out.println("Не пришла большая часть группы!");
            }
        }
        chooseAction();
    }
}
