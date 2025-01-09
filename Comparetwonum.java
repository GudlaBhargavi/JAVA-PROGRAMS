import java.util.Scanner;
public class Comparetwonum{
 public static void main(String[]args) {
    Scanner in = new Scanner(System.in);
    int n1;
    int n2;
    System.out.println("input first integer");
    n1= in.nextInt();
    System.out.println("input second integer:");
    n2=in.nextInt();
    if(n1==n2)
        System.out.println( n1+"=="+n2);
    if(n1 != n2)
        System.out.printf("%d!= %d\n", n1,n2);
     }
}