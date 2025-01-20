import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a nunber btw 0 and 1000 ");
        int num=sc.nextInt();
        int a=num%10;
        int r=num/10;
        int b=r%10;
        r=r/10;
        int c=r%10;
        r=r/10;
        int d=r%10;
        r=r/10;
        int sum=a+b+c+d;
        System.out.println("the sum of digits:" +sum);
      }
 }

