import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num : arr) {
            if(!seen.add(num)) {
                duplicates.add(num);
            }
        }

        if(duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate elements:");
            for(int d : duplicates) {
                System.out.print(d + " ");
            }
        }
    }
}

