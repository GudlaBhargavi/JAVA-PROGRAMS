import java.util.*;
public class CompareFloat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter float no=");
        double a=sc.nextDouble();

        System.out.println("enter float no=");
        double b=sc.nextDouble();

        a=Math.round(a*1000);
        System.out.println(a);
        a=a/1000;
        System.out.println(a);

        b=Math.round(b*1000);
        System.out.println(b);
        b=b/1000;
        System.out.println(b);

        if(a==b){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }

    }
}
