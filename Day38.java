import java.util.Scanner;
public class day38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nomorPesanan, jumlahPorsi;
        int hargaSatuan = 0;
        int totalHarga, diskonBelanja = 0;
        int diskonMember = 0;
        int totalBayar;

        String namaMenu = "";
        boolean punyaMember;

        System.out.println("=== MENU WARTEG CYBER 2077 ===");

        //Menampilkan daftar menu
        System.out.println("1. Nasi Hologram (Rp 15000)");
        System.out.println("2. Ayam Goreng Laser (Rp 20000)");
        System.out.println("3. Es Teh Matrix (Rp 5000)");
        System.out.println("==============================");

        // Input pesanan
        System.out.print("Masukkan nomor pesanan: ");
        nomorPesanan = in.nextInt();

        System.out.print("Masukkan jumlah porsi: ");
        jumlahPorsi = in.nextInt();

        System.out.print("Apakah punyabmember? (true/false) : ");
        punyaMember = in.nextBoolean();

        // Menentukan menu dan harga
        if (nomorPesanan == 1) {
            namaMenu = "Nasi Hologram";
            hargaSatuan = 15000;
        }
        if (nomorPesanan == 2) {
            namaMenu = "Ayam Goreng Laser";
            hargaSatuan = 20000;
        }
        if (nomorPesanan == 3) {
            namaMenu = "Es Teh Matrix";
            hargaSatuan = 5000;
        }
    
        // Hitung total harga awal
        totalHarga = hargaSatuan * jumlahPorsi;
        totalBayar = totalHarga;

        System.out.println("\nMenu           : " + namaMenu);
        System.out.println("Jumlah           : " + jumlahPorsi);
        System.out.println("Total Harga Awal : Rp " + totalHarga);

        // Promo 1
        if (totalHarga > 50000) {
            diskonBelanja = totalHarga * 10 / 100;
            totalBayar = totalBayar -diskonBelanja;

            System.out.println("\nSelamat! Anda dapat Diskon Belanja Besar 10%"
            + " (Potongan Rp " + diskonBelanja + ")");
        }

        // Promo 2
        if (punyaMember == true) {
            diskonMember = 5000;
            totalBayar = totalBayar - diskonMember;

            System.out.println("Diskon Member Diterapkan (Potongan Rp "
            + diskonMember + ")");
        }

        System.out.println("----------------------------------------");
        System.out.println("Total yang harus dibayar : Rp " + totalBayar);
    }
}
