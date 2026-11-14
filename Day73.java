import java.util.Scanner;
public class day73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = in.nextLine();

        int jumlahKarakter = nama.length();
        String kapital = nama.toUpperCase();
        String kecil = nama.toLowerCase();

        System.out.println("\nNama Asli : " + nama);
        System.out.println("Jumlah Karakter : " + jumlahKarakter);
        System.out.println("Huruf Kapital : " + kapital);
        System.out.println("Huruf kecil : " + kecil);
    }
}
