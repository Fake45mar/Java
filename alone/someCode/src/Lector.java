import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
public class Lector implements Managing {
    private String name = "";
    private String gender = "";
    private int age = 0;
    private String state;
    private String subject;
    private int whoIsHead = 0;
    private String [] randomNames  = {"Kamilla", "Josh", "David", "Drake", "Danila", "Diana", "Hanna", "Juliana", "Sofa"};
    private Random rand = new Random();
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


    private ArrayList<Student> listStudendts = new ArrayList<Student>();

    public void chooseHeadOfGroup(int ammountStudents){
         listStudendts.get(ammountStudents).isHeadGroup = true;
         whoIsHead = ammountStudents;
    }
    public void makeGroup() throws IOException {
        int max = 50;
        int min = 17;
        System.out.println("Enter ammount of students");
        int ammountStudents = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < ammountStudents; i++) {
            listStudendts.add(0, new Student(randomNames[rand.nextInt(randomNames.length - 1)], rand.nextInt((max - min) + 1) + min, rand.nextInt((4 - 1) + 1) + 1));
        }
        listStudendts.get(rand.nextInt(ammountStudents - 1) + 1).getHeadGroup();
        for(Student student : listStudendts){
            System.out.println(student.toString());
        }
    }
    public void addStudent() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name");
        String name = bufferedReader.readLine();
        System.out.println("Enter age");
        int age = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter course");
        int course = Integer.parseInt(bufferedReader.readLine());
        listStudendts.add(new Student(name, age, course));
    }
    public void removeStudent() throws IOException{
        int loop = 0;
        for(Student student : listStudendts){
            loop ++;
            System.out.print(loop + " ");
            System.out.println(student.toString());
        }
        System.out.println("Which student do you wanna kick down?");
        int num = Integer.parseInt(bufferedReader.readLine());
        num--;// Listing started at 0 index
        System.out.println(listStudendts.get(num) + ": will be kicked");
        listStudendts.remove(num);
    }
    public String getHead(){
        for(Student student : listStudendts){
            if (student.isHead(student) != null){
                return student.toString();
            }
        }
        return null;
    }
    public Lector(String name, int age, String subject){
        this.name = name;
        this.age = age;
        this.subject = subject;
    }
}
