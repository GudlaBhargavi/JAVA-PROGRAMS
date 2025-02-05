import java.util.*;
public class Greatest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  a input:");

        int a=sc.nextInt();
        System.out.println("enter  b input:");
        int b=sc.nextInt();
        System.out.println("enter  c input:");
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is greates");
        }
        else if(b>c){
            System.out.println("b is greatest");
        
        }
        else{
            System.out.println("c is greatest");
        }
    }
}
