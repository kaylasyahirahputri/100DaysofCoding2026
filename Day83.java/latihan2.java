import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang: ");
        int jumlah = in.nextInt();

        int[] harga = new int[jumlah];

        int total = 0;

        for (int i = 0; i < harga.length; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
            harga[i] = in.nextInt();
        }
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Harga barang ke-" + (i + 1) + ": " + harga[i]);
            total += harga[i];
        }
        System.out.println("\nTotal belanja: " + total);

    } 
}
