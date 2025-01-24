

public class Enum {
    public enum Days_of_week{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    public static void main(String []args){
        Days_of_week today=Days_of_week.FRIDAY;
        System.out.println("today is "+ today);
    }
    
}
