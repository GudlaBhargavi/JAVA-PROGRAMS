import java.util.*;
public class OOPS2 {

    public static int calculateSum(int a,int b){
       int sum=a+b;
       return sum; 
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter two num:2");
      int a=sc.nextInt();
      int b=sc.nextInt();  

      int sum=calculateSum(a, b);
      System.out.println("sum of two numbers:" + sum);
    }
}
