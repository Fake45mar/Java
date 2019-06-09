import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class client {
    private DatagramSocket socket;
    private InetAddress address;
    private boolean running;
    private byte[] buf;
    public client(int port) throws SocketException {
        socket = new DatagramSocket();
        address =
    }
    public void run() throws IOException {
        running = true;
        while(running){
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            InetAddress address = packet.getAddress();
            int port = packet.getPort();
            pa
        }
    }
}
