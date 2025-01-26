public class Dog1 {
    public String name;
    public String color;

    public Dog1(String name,String color){
        this.name=name;
        this.color=color;
    }
    public static void main(String []args){
        Dog1 myDog1=new Dog1("bailey","black");
        System.out.println("dog name:"+myDog1.name);
        System.out.println("dog name:"+myDog1.color);
    }
}
