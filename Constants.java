public class Constants {
    public static final double PI=3.14159;
    
    public static double calculatedArea(double radius){
        return PI*radius*radius;
    }
    public static void main(String[] args) {
      double radius=5.0;
      double area=calculatedArea(radius);
      System.out.println(radius);
      System.out.println(area);
    }
}

