import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main{
    public static void binarySearch(ArrayList<Integer> vector,int searched){
       int low = 0,
               high = vector.size();
       while(low <= high){
           int medium = vector.size() / 2;
           if(searched == vector.get(medium)){
               System.out.println("Searched value of arraylist" + " " + vector.get(medium) + " located by index " + medium);
               break;
           }
           else if(searched < vector.get(medium)){
               System.out.println("Lower");
               high = medium - 1;
               System.out.println(low);
           }
           else if(searched > vector.get(medium)){
               System.out.println("Higher");
               low = medium + 1;
               System.out.println(high);
           }
       }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sizeArrayList = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer>vector = new ArrayList<>();
        for (int i = 0; i < sizeArrayList; i++) {
            int input = Integer.parseInt(bufferedReader.readLine());
            vector.add(input);
        }
        int searchElem = Integer.parseInt(bufferedReader.readLine());
        binarySearch(vector, searchElem);
    }
}