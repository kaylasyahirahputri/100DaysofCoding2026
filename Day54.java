import java.util.Scanner;

public class day54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int j = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                j += i;
            }
        }

        if (j == n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
