 //Days in a week
import java.util.*; 
class Mar_5{
   public static void main(String[] args){
      
      String result;
      
      
      Scanner day = new Scanner(System.in);
      System.out.println("Enter a number:");
      int b = day.nextInt();

 
result =switch(b){
            case 1 ->  "Sunday";
            case 2 ->  "Monday";
            case 3 ->  "Tuesday";
            case 4 ->  "Wednesday";
            case 5 ->  "Thursday";
            case 6 ->  "Friday";
            case 7 -> "Saturday";
            default ->  "no";
            };
      System.out.println(result);
    day.close();  
   }


 }