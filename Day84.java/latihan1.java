
import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = in.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = in.nextInt();
        }
      
        int tertinggi = nilai[0];

        for (int i = 1; i < n; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);

    }
}
