public class Initializer {
   static int initialValue;
   
   static{
    initialValue=1000;
    System.out.println("Static block:initialValue initialized to"+initialValue);

   }
   public static void main(String []args){
    System.out.println("before creating an instance="+Initializer.initialValue);

    Initializer initializer=new Initializer();
    System.out.println("after creating an instancr="+Initializer.initialValue);
   }
}
