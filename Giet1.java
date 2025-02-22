import java.util.*;

public class Giet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter r value: ");
        int r = sc.nextInt();
        
        System.out.print("Enter unit value: ");
        int unit = sc.nextInt();
        
        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();

        int arr[] = new int[s];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements of the array are:");
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int totalFoodNeeded = r * unit;
        int totalFood = 0;

        for (int i = 0; i < arr.length; i++) {
            totalFood += arr[i];
            if (totalFood >= totalFoodNeeded) {
                System.out.println("Minimum number of days: " + (i + 1));
                return;
            }
        }

        System.out.println("Not enough food available.");
    }
}

