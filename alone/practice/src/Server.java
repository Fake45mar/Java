import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.ServerSocket;
public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    public void start(int port) throws IOException{
        try(ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("listening on port " + Integer.toString(port));
            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("New client");
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                String data;
                do{
                    data = in.readLine();
                    System.out.println(data);
                    out.println("Answer");
                } while(!data.equals("bye"));
                socket.close();
            }
        }
        catch(IOException iex){
            System.out.println(iex.getMessage());
            iex.printStackTrace();
        }
    }
    public void stop() throws IOException{
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
}
