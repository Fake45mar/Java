import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        int[] arr = new int[i];
        int n = 0;
        while(true) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number == -1) {
                int sum = 0;
                for (int j = 0; j < arr.length; j++) {
                    sum += arr[j];
                    System.out.println(arr[j]);
                }
                System.out.println(Arrays.toString(arr));
                break;
            }
            arr[i - 1] = number;
            i++;
            System.out.println(i);
        }
    }
}