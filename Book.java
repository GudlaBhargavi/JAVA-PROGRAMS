public class Book {
    public String title;
    public String author;
    int price;


    public Book(){
        this.title="unknown";
        this.author="unknown";
        this.price=0;
    }
    public Book(String name,String author){
        this.title=title;
        this.author=author;
    }
    public Book(String name,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public static void main(String[] args) {
      Book book1=new Book();
      System.out.println("Book1 Title: " + book1.title);
        System.out.println("Book1 Author: " + book1.author);
        System.out.println("Book1 Price: " + book1.price);

        // Create a new Book object using the parameterized constructor (title, author)
        Book book2 = new Book("Amatka", "Karin Tidbeck");
        // Print the values of the instance variables for book2
        System.out.println("Book2 Title: " + book2.title);
        System.out.println("Book2 Author: " + book2.author);
        System.out.println("Book2 Price: " + book2.price);

        // Create a new Book object using the parameterized constructor (title, author, price)
        Book book3 = new Book("Altered Carbon", "Richard K. Morgan", 18);
        // Print the values of the instance variables for book3
        System.out.println("Book3 Title: " + book3.title);
        System.out.println("Book3 Author: " + book3.author);
        System.out.println("Book3 Price: " + book3.price);  

    }
}

