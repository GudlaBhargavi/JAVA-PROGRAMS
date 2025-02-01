
import java.io.*;
import java.lang.*;

public class Monkey {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader( new InputStreamReader(System.in)); 
        int n=Integer.parseInt(br.readLine());
        System.out.println("total number of monkeys:");

        int e_b=Integer.parseInt(br.readLine());
        System.out.println("enter total number of eatable bananas by single monkey:");

        int e_p=Integer.parseInt(br.readLine());
        System.out.println("enter total number of eatable peanuts by single monkey:");

        int m=Integer.parseInt(br.readLine());
        System.out.println("enter total number of bananas:");

        int p=Integer.parseInt(br.readLine());
        System.out.println("enter the total number of peanuts:");

        int m_e_b=m/e_b;//6
        System.out.println("monkey eat banana:"+m_e_b);

        int m_e_p=p/e_p;//4
        System.out.println("monkey eat banana:"+m_e_p);

        int m_left =n-(m_e_b+m_e_p); //20-(6+4)


        if(m%e_b!=0 || p%e_p!=0){
            m_left--;
        }
        System.out.println(m_left);


    }
        
}
