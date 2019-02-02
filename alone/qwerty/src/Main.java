import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Artifact art1 = new Artifact(1);
        art1.getInfo();
        Artifact art2 = new Artifact(2, 4, "Aztek");
        art2.getInfo();
        Artifact art3 = new Artifact(3, -5);
        art3.getInfo();
        newRelationShips vasek = new newRelationShips("Васёк", "man", 23);
        vasek.getInfo();
        newRelationShips pasha = new newRelationShips("Pasha", "man");
        pasha.getInfo();
//        InputStream inputStream =System.in;
//        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        String age = bufferedReader.readLine();

        //        Reader inputStreamReader = new InputStreamReader(inputStream);
    }
}
