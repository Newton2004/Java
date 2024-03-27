 
// import java.util.Scanner;

// public class code {
//     public static void main(String[] args) {
//         // Create a Scanner object to read input from the user
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter a number: ");
//         String userInput = scanner.nextLine(); // Read the input as a string
        
//         try {
//             // Attempt to parse the input string to an integer
//             int number = Integer.parseInt(userInput);
//             System.out.println("Parsed number: " + number);
//         } catch (NumberFormatException e) {
//             // Handle the case where the input cannot be parsed to an integer
//             System.out.println("Invalid input. Please enter a valid integer.");
//         }
        
//         // Close the Scanner
//         scanner.close();
//     }
// }

public class code{
    public static void main(String a){
        int p=6;
        int q=7;
        int r=7;
        q=5&r;
        q=(p&r)&r;
        if((9&r)<p && (r^p)<q){
            r=(q&10)+r;
            q=(r+q)+q;
        }
        
        r=(q&10)+r;
        r=2+q;
        System.out.println(p+q+r);
        

    }

}
