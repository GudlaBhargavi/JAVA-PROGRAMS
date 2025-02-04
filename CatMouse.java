
public class CatMouse {
    public static String Cat_Mouse(int x,int y,int z){
        int distA = (x > z) ? (x - z) : (z - x); // Distance of Cat A from Mouse C
        int distB = (y > z) ? (y - z) : (z - y);
        if (distA < distB) {
            return "Cat A";
        } else if (distB < distA) {
            return "Cat B";
        } else {
            return "Mouse C"; 
        }
     }

    }
