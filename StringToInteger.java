import java.util.Scanner;
public class StringToInteger {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Input a number (string) :");
    String s=sc.nextLine();
    int result=Integer.parseInt(s);
    System.out.println("the integer value is:" + result);


    }

}
