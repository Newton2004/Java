import java.util.Arrays;

public class cat{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        arr1 = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2, 0, arr1, arr1.length - arr2.length, arr2.length);
        System.out.println("Concatenated Array: " + Arrays.toString(arr1));
    }
}
