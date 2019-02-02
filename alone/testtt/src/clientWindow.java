import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class clientWindow extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private final JTextField jtextfieldURL = new JTextField("Tittle");
    public static String URL = new String("");
    JFrame jframe = new JFrame();
    public static void main(String[] args) {
        new clientWindow();
    }
    public clientWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
//        setAlwaysOnTop(true);
        setBackground(Color.black);
        jtextfieldURL.setPreferredSize(new Dimension(20,20));
        add(jtextfieldURL, BorderLayout.NORTH);
        setVisible(true);
        URL = jtextfieldURL.getText();
    }
}
