import java.util.Scanner;
public class Polygonarea {
    public static void main(String []args){
        Scanner input =new Scanner(System.in);
        System.out.println("first value");
        double s=input.nextDouble();
        System.out.println("area ="+Polygonareaa(s)+"\n");
    }
    public static double Polygonareaa(double a){
        return(6*(a*a))/(4*Math.tan(Math.PI/6));
    }
    
}
