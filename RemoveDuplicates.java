import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Set<Integer> unique = new LinkedHashSet<>();
        for(int num : arr) {
            unique.add(num);
        }

        for(int num : unique) {
            System.out.print(num + " ");
        }
    }
}
