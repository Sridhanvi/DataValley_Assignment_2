import java.util.Arrays;

public class SumOfLarge {
    public static void main(String[] args) {
        int[] arr = {10, 51, 53, 39, 47, 44, 21};
        Arrays.sort(arr);
	int n = arr.length;
        int l2 = arr[n - 2];
        int l3 = arr[n - 3];
        int ans = l2 + l3;
        System.out.println("The sum of second and third largest numbers is: " + ans);
    }
}
