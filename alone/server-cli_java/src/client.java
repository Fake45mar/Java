import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.Buffer;

public class client {
    public static void main(String[] args) throws IOException {
//        if(args.length < 2)return;
        String host = "0.0.0.0";
        int port = 8080;
        System.out.println(host + " " + port);
        try(Socket socket = new Socket(host, port)){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String time = bufferedReader.readLine();
            System.out.println(time);
        }
        catch (UnknownHostException ex){
            System.out.println("Server not found: " + ex.getMessage());
        }
        catch(IOException ex){
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}
//    Tue Jun 04 15:15:30 EEST 2019
//Tue Jun 04 15:15:58 EEST 2019
