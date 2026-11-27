
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang: ");
        int jumlah = in.nextInt();

        int[] harga = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
            harga[i] = in.nextInt();
        }

        for (int i = 0; i < jumlah; i++) {
            harga[i] = harga[i] + 5000;
        }

        System.out.println("\nHarga setelah diperbarui:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Barang ke-" + (i + 1) + ": Rp" + harga[i]);
        }

    }
}
