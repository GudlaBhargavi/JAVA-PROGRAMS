import java.util.*;
public class OOPS1 {

    public static void printMyName(String Name){
        System.out.println(Name);
        return;

        
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String Name=sc.next();

        printMyName(Name);//call fun
        
    }
}
