public class day09 {
    public static void main(String[] args) {
        // Konstanta (Final Variabel)

        // Menentukan harga awal sebagai konstanta
        // Nilai HARGA tidak dapat diubah karena menggunakan final
        final double HARGA = 15000;

        // Menentukan besar diskon sebesar 10%
        // 0.10 berarti 10 persen
        final double DISKON = 0.10;

        // Menghitung jumlah uang yang didapat dari diskon
        double jumlahDiskon = HARGA * DISKON;

        // Mengurangi harga awal dengan jumlah diskon untuk mendapatkan harga setelah diskon
        double hargaSetelahDiskon = HARGA - jumlahDiskon;

        // Menampilkan harga awal
        System.out.println("Harga Awal       : Rp " + HARGA);

        // Menampilkan besar diskon dalam bentuk persen
        System.out.println("Diskon           : " + (DISKON * 100) + "%");

        // Menampilkan jumlah uang yang dipotong
        System.out.println("Jumlah Diskon    : Rp " + jumlahDiskon);

        // Menampilkan harga yang harus dibayar setelah diskon
        System.out.println("Harga Setelah Diskon : Rp " + hargaSetelahDiskon);
    }
}
