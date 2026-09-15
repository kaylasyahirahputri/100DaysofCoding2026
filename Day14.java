import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Operator Aritmatika Penjumlahan (+) dan Pengurangan (-)

        // Meminta input
        System.out.print("Masukkan tabungan awal: ");
        int tabunganAwal = input.nextInt();

        System.out.print("Masukkan uang masuk : ");
        int uangMasuk = input.nextInt();

        System.out.print("Masukkan uang diambil : ");
        int uangDiambil = input.nextInt();

        // Menghitung jumlah tabungan akhir
        int jumlahTabungan = tabunganAwal + uangMasuk - uangDiambil;

        // Menampilkan hasil
        System.out.println("=============================");
        System.out.println("        DATA TABUNGAN    ");
        System.out.println("=============================");
        System.out.println("Tabungan Awal\t : " + tabunganAwal);
        System.out.println("Uang Masuk\t: " + uangMasuk);
        System.out.println("Uang Diambil\t: " + uangDiambil);
        System.out.println("Jumlah Tabungan\t: " + jumlahTabungan);
        System.out.println("=============================");

    }
}
