import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil = hasil * m;
        }

        System.out.println(hasil);

    }
}
