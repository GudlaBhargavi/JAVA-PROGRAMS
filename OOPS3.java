import java.util.*;
public class OOPS3 {

    public static int calMul(int a,int b){
       return a*b; 
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("product:" + calMul(a, b));
    }
}
