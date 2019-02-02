package chatClient;

import chatNetwork.TCPConnection;
import chatNetwork.TCPConnectionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class clientWindow extends JFrame implements ActionListener, TCPConnectionListener {
    private static final String IP_ADDR = "192.168.1.132";
    private static final int PORT = 8189;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new clientWindow();
            }
        });
    }
    private final JTextArea log = new JTextArea();
    private final JTextField fieldNickname = new JTextField();
    private final JTextField fieldInput = new JTextField();
    private TCPConnection connection;
    private clientWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        log.setEditable(false);
        log.setLineWrap(true);
        fieldInput.addActionListener(this);
        add(log, BorderLayout.CENTER);
        add(fieldInput, BorderLayout.SOUTH);
        add(fieldNickname, BorderLayout.NORTH);
        setVisible(true);
        try {
            connection = new TCPConnection(this, IP_ADDR, PORT);
        } catch (IOException e) {
            printMSG("Connection exception: " + e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = fieldInput.getText();
        if(msg.equals(""))return;
        fieldInput.setText(null);
        connection.sendMessage(fieldNickname.getText() + ": " +  msg);
    }

    @Override
    public void onConnectionReady(TCPConnection tcpConnection) {
        printMSG("Connection ready...");
    }

    @Override
    public void onReceiveString(TCPConnection tcpConnection, String s) {
        printMSG(s);
    }

    @Override
    public void onDisconnect(TCPConnection tcpConnection) {
        printMSG("Connection disconnect...");
    }

    @Override
    public void onException(TCPConnection tcpConnection, Exception e) {
        printMSG("Connection exception: " + e);
    }
    private synchronized void printMSG(String msg){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                log.append(msg + "\n");
                log.setCaretPosition(log.getDocument().getLength());
            }
        });
    }
}
