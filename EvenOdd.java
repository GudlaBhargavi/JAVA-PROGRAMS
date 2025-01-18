import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("enter a num:");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}

