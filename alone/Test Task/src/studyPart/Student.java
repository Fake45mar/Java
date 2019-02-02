package studyPart;

import java.util.Scanner;

public class Student {
    Scanner input = new Scanner(System.in);
    public String name;
    public int course;
    public String group;
    public boolean praepost = false;
    public void Student(){
        System.out.println("Введите имя студента - ");
        name = input.nextLine();
        System.out.println("Введите курс студента - ");
        course = input.nextInt();input.nextLine();
        System.out.println("Введите группу студента - ");
        group = input.nextLine();
    }
}
