import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        System.out.print("Masukkan jumlah barang: ");
        int jumlah = in.nextInt();

        int[] harga = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan harga barang ke-" + (i+1) + ": ");
            harga[i] = in.nextInt();
        }
        int termurah = harga[0];

        for (int i = 1; i > jumlah; i++) {
            if (harga[i] < termurah) {
                termurah = harga[i];
            }
        }
        System.out.println("Harga barang termurah: " + termurah);
    }
}

