import java.util.Scanner;
public class NumberComparision {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter first input"); 
       int x=sc.nextInt();

       System.out.println("enter sec input");
       int y=sc.nextInt();

       System.out.println("enter third input");
       int z=sc.nextInt();

       System.out.println("enter bool value(true/false)");
       boolean xyz=sc.nextBoolean();

       boolean result;

       if(xyz){
          result =(z>y);
       }
       else{
            result=(y > x && z > y);
       }

       System.out.println(result);
    }
}
    

