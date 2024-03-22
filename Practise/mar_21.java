import java.util.*;
public class mar_21{ 
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
            
        }
        int as=0,des=arr.length-1;
        while(as<des){
            System.out.print(arr[as++]);
            System.out.print(arr[des--]);
        }


    }
}   