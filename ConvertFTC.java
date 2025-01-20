import java.util.Scanner;
public class ConvertFTC {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the fahrenheit");
        double fahrenheit=sc.nextDouble();
        double Celsius=((5*(fahrenheit-32.0))/9.0);
        System.out.println("result:"+ Celsius);
    }
}
