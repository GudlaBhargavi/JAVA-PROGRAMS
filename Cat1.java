
public class Cat1 {
    // Instance variables can be public, no need for getter/setter
    public String name;
    public int age;

    // Default constructor
    public Cat1() {
        this.name = "Unknown";
        this.age = 0;
    }

    public static void main(String[] args) {
        Cat1 myCat = new Cat1();
        // Direct access to public variables
        System.out.println("Cat's Name: " + myCat.name);
        System.out.println("Cat's Age: " + myCat.age);
    }
}
