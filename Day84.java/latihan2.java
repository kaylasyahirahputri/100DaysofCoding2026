
import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang: ");
        int n = in.nextInt();

        int[] harga = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
            harga[i] = in.nextInt();
        }

        int termahal = harga[0];

        for (int i = 1; i < n; i++) {
            if (harga[i] > termahal) {
                termahal = harga[i];
            }
        }

        System.out.println("Harga barang termahal: " + termahal);
    }
}
