import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        System.out.print("Masukkan jumlah barang: ");
        int jumlah = in.nextInt();

        int[] barang = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nomor barang ke-" + (i+1) + ": ");
            barang[i] = in.nextInt();
        }
        System.out.print("Masukkan nomor barang yang dicari: ");
        int cari = in.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < jumlah; i++) {
            if (barang[i] == cari) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Nomor barang " + cari + " ditemukan.");
        } else {
            System.out.println("Nomor barang " + cari + " tidak ditemukan.");
        }
    }
}

