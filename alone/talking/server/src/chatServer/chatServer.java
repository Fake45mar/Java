package chatServer;

import chatNetwork.TCPConnection;
import chatNetwork.TCPConnectionListener;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

public class chatServer  implements TCPConnectionListener {
    public static void main(String[] args){
        new chatServer();
    }
    private final ArrayList<TCPConnection> connections = new ArrayList<>();
    private chatServer(){
        System.out.println("Server is running!");
        try(ServerSocket serverSocket = new ServerSocket(8189)){
            while(true){
                try {
                    new TCPConnection(this, serverSocket.accept());
                } catch(IOException e){
                    System.out.println("TCPConnection exception: " + e);
                }
            }
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public synchronized void onConnectionReady(TCPConnection tcpConnection) {
        connections.add(tcpConnection);
        sendToAllConnections("Connected: " + tcpConnection);
    }

    @Override
    public synchronized void onReceiveString(TCPConnection tcpConnection, String s) {
        sendToAllConnections(s);
    }

    @Override
    public synchronized void onDisconnect(TCPConnection tcpConnection) {
        connections.remove(tcpConnection);
        sendToAllConnections("Disconnected: " + tcpConnection);
    }

    @Override
    public synchronized void onException(TCPConnection tcpConnection, Exception e) {
        System.out.println("TCPConnection exception: " + e);
    }
    private void sendToAllConnections(String value){
        System.out.println(value);
        final int cnt = connections.size();
        for (int i = 0; i < cnt; i++) {
            connections.get(i).sendMessage(value);
        }
    }
}
