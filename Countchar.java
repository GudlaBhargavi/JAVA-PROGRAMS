import java.util.Scanner;
public class Countchar {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("enter string:");
        String s=input.nextLine();
        int count=0;
        for (int i =0; i <s.length();i++){
            if(s.charAt(i) != ' '){
                count++;
            }
            
        }
        System.out.println("total characters:" +count);
            
        }

    }

