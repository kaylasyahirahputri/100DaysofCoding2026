import java.util.Scanner;

public class Facegram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan Username\t: ");
        String username = input.nextLine();

        System.out.print("Masukkan Umur\t\t: ");
        byte umur = input.nextByte();

        System.out.print("Masukkan Tinggi Badan\t: ");
        double tinggi = input.nextDouble();

        input.nextLine(); // Bersihkan sisa Enter

        System.out.print("Masukkan Golongan Darah\t: ");
        char golonganDarah = input.nextLine().charAt(0);

        System.out.print("Apakah Akun Privat?\t: ");
        boolean akunPrivat = input.nextBoolean();

        // Menampilkan output profil rapi pakai \t (tab)
        System.out.println("\n\t=== PROFILE FACEGRAM ===");
        System.out.println("\tUsername\t: " + username);
        System.out.println("\tUmur\t\t: " + umur + " Tahun");
        System.out.println("\tTinggi Badan\t: " + tinggi + " cm");
        System.out.println("\tGolongan Darah\t: " + golonganDarah);
        System.out.println("\tAkun Privat\t: " + akunPrivat);
        System.out.println("\t========================");

        input.close();
    }
}

import java.util.Scanner;

public class KasirKantin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variabel KONSTAN (final)
        final String NAMA_KANTIN = "KANTIN KEJUJURAN TI";

        // Meminta input dari pembeli
        System.out.print("Masukkan Nama Makanan\t: ");
        String namaMakanan = input.nextLine();
        System.out.print("Masukkan Harga Satuan\t: ");
        int hargaSatuan = input.nextInt();

        System.out.print("Masukkan Jumlah Beli\t: ");
        int jumlahPorsi = input.nextInt();

        // Menghitung Total Harga
        int totalHarga = hargaSatuan * jumlahPorsi;

        // Menampilkan Struk Pembayaran
        System.out.println("\n--- " + NAMA_KANTIN + " ---");
        System.out.println("Anda memesan " + jumlahPorsi + " porsi " + namaMakanan + ".");
        System.out.println("Total yang harus dibayar: Rp " + totalHarga);
        System.out.println("----------------------------------------");

        input.close();
    
    }
}


import java.util.Scanner;

public class SabotaseNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input
        System.out.print("Masukkan Nama Mahasiswa\t: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Nilai Ujian\t: ");
        double nilai = input.nextDouble();

        // Cetak konfirmasi bahwa nilai asli telah diterima
        System.out.println("Data diterima: " + nama + " mendapat nilai " + nilai);

        // UPDATE VARIABEL: Ubah nilai langsung jadi 0.0 — TANPA input ulang
        nilai = 0.0;

        // Cetak peringatan & nilai akhir
        System.out.println("AWAS! SISTEM DIRETAS!");
        System.out.println("Nilai akhir " + nama + " sekarang diubah menjadi: " + nilai);

        input.close();
    }
}
