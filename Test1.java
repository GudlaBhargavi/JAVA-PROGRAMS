import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the the number");
       int N=sc.nextInt();
       
       
       for(int i=0;i<=N-2;i++)
       {
        System.out.print("*");
       }
       System.out.print(".");
       for(int i=0;i<=N-2;i++)
       {
        System.out.print("*");
       }
       System.out.println();
       System.out.print("*");
       for(int i=0;i<=N-1;i++)
       {
        System.out.print(".");
       }
       System.out.print("*");
       System.out.println();
       for(int i=0;i<=N+1;i++)
       {
        System.out.print(".");
       }
       System.out.println();
       System.out.print("*");
       for(int i=0;i<=N-1;i++)
       {
        System.out.print(".");
       }
       System.out.print("*");
       System.out.println();
       for(int i=0;i<=N-2;i++)
       {
        System.out.print("*");
       }
       System.out.print(".");
       for(int i=0;i<=N-2;i++)
       {
        System.out.print("*");
       }
    }
}