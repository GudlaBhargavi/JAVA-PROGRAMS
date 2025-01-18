import java.util.*;
public class SumEqualThirdInteger {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input first number:");
        int x =sc.nextInt();
        System.out.println("Input the second number:");
        int y =sc.nextInt();
        System.out.println("Input the third number:");
        int z =sc.nextInt();

        boolean result =(x+y==z)||(y+z==x)||(z+x==y);
        System.out.println("the result is:" + result);

        System.out.println();
       
    }

}
