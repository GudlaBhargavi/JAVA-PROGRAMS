
import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int sum=0;
        int n;
        n=sc.nextInt();

        System.out.println("first n natural numbers are:" +n);

         for(i=1;i<=n;i++)
         {
            System.out.println(i);
            sum+=i;
            System.out.println(sum);

        }
    }    
}
