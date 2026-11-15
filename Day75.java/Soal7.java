import java.util.Scanner;
public class soal7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan ukuran sisi(n): ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
