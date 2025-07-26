import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();             // Size of the array
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();        // Array elements
        }

        int k = sc.nextInt();             // Number of positions to rotate
        k = k % n;                        // Handle cases where k > n

        // Rotate the array k times
        for(int r = 0; r < k; r++) {
            int first = arr[0];
            for(int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
