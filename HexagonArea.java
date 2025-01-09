import java.util.Scanner;
public class HexagonArea {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("input the length");
        double l =in.nextDouble();
        System.out.println("area="+hexarea(l)+"\n");
    }

    public static double hexarea(double s){
        return (6*(s*s))/(4 * Math.tan(Math.PI/6));
    }
    
}
