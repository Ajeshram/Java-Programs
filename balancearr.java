import java.util.*;

class balancearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = false;
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < n; i++) {
            if((arr[i - 1] + arr[i]) % 2 == 0) {
                a = true;
                break;
            }
        }

        if(!a)
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
