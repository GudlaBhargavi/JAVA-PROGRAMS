import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GIET {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read parent name
        System.out.println("Enter the parent name:");
        String parentName = br.readLine().trim();
        
        // Read yes/no input
        System.out.println("Enter yes/no:");
        String yes_No = br.readLine().trim().toLowerCase();

        // If no children
        if (yes_No.equals("n")) {
            int totalMembers = 1;
            System.out.println("TOTAL MEMBERS: " + totalMembers);
            System.out.println("COMMISSION DETAILS");
            System.out.println(parentName.toUpperCase() + ":500 INR");
        } 
        
        // If children exist
        else if (yes_No.equals("y")) {
            System.out.println("Enter children names (comma-separated):");
            String childrenInput = br.readLine().trim();
            String[] children = childrenInput.split(",");
            
            int totalMembers = children.length + 1;
            System.out.println("TOTAL MEMBERS: " + totalMembers);
            System.out.println("COMMISSION DETAILS");
            System.out.println(parentName.toUpperCase() + ":500 INR");

            // Print each child's commission
            for (String child : children) {
                System.out.println(child.trim().toUpperCase() + ":250 INR");
            }
        } 
        
        // Invalid input handling
        else {
            System.out.println("Invalid input! Please enter 'y' or 'n'.");
        }
    }
}
