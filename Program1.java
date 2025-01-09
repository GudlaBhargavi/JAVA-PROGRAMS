//import java.util.*;
class Program1{
public static void main(String []args){
   int n=1011;
   int t=n;
   int r=0;
   int i=0;
   int d=0;
   
   while(t>0)
   {
     r = t % 10;
     t= t/10;
     d=d + r *(int)Math.pow(2,i++);
   }
     System.out.println(d);
    }
  }