import java.util.*;
import javax.swing.*;
public class mainWindow extends JFrame {
    public mainWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320, 345);
        setLocation(400, 400);
        add(new Game());
        setVisible(true);
    }
    public static void main(String[] args){
        mainWindow window = new mainWindow();
    }
}
