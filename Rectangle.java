public class Rectangle {
    public double length;
    public double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    public Rectangle(Rectangle rectangle){
        this.length=rectangle.length;
        this.width=rectangle.width;
    }

    public static void main(String[] args) {
      Rectangle rect1 = new Rectangle(12.5,4.5);
      
      System.out.println("r1 length:" + rect1.length);
      System.out.println("r1 width:"+ rect1.width);

      Rectangle rect2 = new Rectangle(rect1);
      
      System.out.println("r2 length:" + rect2.length);
      System.out.println("r2s width:"+ rect2.width);

    }
}

