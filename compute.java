import java.util.Scanner;
public class compute {
    public static void main(String []args){
        System.out.println("input the value of n:");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int result = n+(n*10+n)+(n*100+n*10+n);
        System.out.println("result of n + nn + nnn: " + result);
    }
}
