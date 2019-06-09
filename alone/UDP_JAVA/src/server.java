import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class server {
    private DatagramSocket serverSocket;
    private boolean running;
    private byte[] buf = new byte[256];
    public void server(int port) throws SocketException {
        serverSocket = new DatagramSocket(port);
    }
    public void run()throws IOException {
        running = true;
        while(running){
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            serverSocket.receive(packet);
            InetAddress address = packet.getAddress();
            int port = packet.getPort();
            packet = new DatagramPacket(buf, buf.length, address, port);
            String received = new String(packet.getData(), 0, packet.getLength());
            if(received.equals("end")){
                running = false;
                continue;
            }
            serverSocket.send(packet);
        }
        serverSocket.close();
    }
}