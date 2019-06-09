import java.io.*;
import java.net.Socket;
public class Client {
    public static void main(String[] args) throws IOException {
        String hostname = args[0];
        int port = Integer.parseInt(args[1]);
        try(Socket socket = new Socket(hostname, port)){
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            String text;
            do{
                text = new BufferedReader(new InputStreamReader(System.in)).readLine();
                out.println(text);
                InputStream input = socket.getInputStream();

            }
        }
    }
}
