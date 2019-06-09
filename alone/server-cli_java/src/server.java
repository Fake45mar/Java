import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class server {
    public static void main(String[] args) throws IOException {
//        if(args.length < 1)return;
//        int port = Integer.parseInt(args[0]);
        try(ServerSocket serverSocket = new ServerSocket(8080)){
            System.out.println("$erver has started on port");
            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("New client");
                OutputStream out = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(out, true);
                writer.println(new Date().toString());
            }
        }
        catch(IOException exc){
            System.out.println("Server exception" + exc);
            exc.printStackTrace();
        }
    }
}
