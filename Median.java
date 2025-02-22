import java.io.*;
import java.util.*;

public class Median {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[n]; 

        String[] input = br.readLine().trim().split(" "); 

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]); 
        }

        Arrays.sort(arr); 
        System.out.println(arr[n / 2]); 
       
    }
}
