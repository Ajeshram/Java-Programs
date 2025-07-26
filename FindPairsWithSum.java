import java.util.Scanner;

public class FindPairsWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();               // Size of the array
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();          // Array elements
        }

        int target = sc.nextInt();          // Target sum

        boolean found = false;

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                }
            }
        }

        if(!found) {
            System.out.println("No pairs found with sum " + target);
        }
    }
}

