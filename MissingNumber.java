import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Expected total numbers from 1 to n
        int[] arr = new int[n - 1]; // One number is missing

        for(int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int total = n * (n + 1) / 2; // Sum of 1 to n
        int sum = 0;

        for(int num : arr) {
            sum += num;
        }

        int missing = total - sum;
        System.out.println("Missing number: " + missing);
    }
}
