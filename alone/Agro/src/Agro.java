import java.util.*;
public class Agro {
    public Scanner input = new Scanner(System.in);
    private String[] lett;
    public Agro(){
        while(true){
            System.out.println("Введите строку");
            String str = input.nextLine();
            lett = new String[str.length()];
            if(str.equals("") || str.equals(" ")){
                break;
            }
            System.out.println("Введите символы или слово(строку) для поиска");
            String diffStr = input.nextLine();
            if(diffStr.length() < 2){
                lett = str.split("");
            }
            else{
                lett = str.split(" ");
            }
            for (int i = 0; i <lett.length ; i++) {
                if(lett[i].indexOf(diffStr) != -1){
                    System.out.println("Чтобы закончить, нажмите Enter или введите пробел");
                    System.out.println(str);
                }
                else{
                    continue;
                }

            }
        }
    }
}
