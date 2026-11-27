
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = in.nextInt();

        int[] nilai = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = in.nextInt();
        }

        System.out.println("\nData sebelum diubah:");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.print("\nMasukkan indeks yang ingin diubah: ");
        int indeks = in.nextInt();

        System.out.print("Masukkan nilai baru: ");
        int baru = in.nextInt();

        nilai[indeks - 1] = baru;

        System.out.println("\nData setelah diubah:");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(nilai[i] + " ");
        }

    }
}
