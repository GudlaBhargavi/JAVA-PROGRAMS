import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string:");
        char[] s =input.nextLine().toCharArray();
        System.out.println("reverse String");
        for(int i =s.length-1;i>=0;i--){
            System.out.print(s[i]);
        }
        //System.out.println("\n");

    }
}
