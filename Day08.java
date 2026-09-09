public class day08 {
    public static void main (String[] args) {
        /* Deklarasi, Inisialisasi dan Update Variabel */

        // Deklarasi Variabel : Membuat variabel yang akan digunakan.
        String nama;
        int umur;
        int tinggi;

        // Inisialisasi Variabel : Memberikan nilai awal ke variabel.
        nama = "Kayla";
        umur = 18;
        tinggi = 160;

        System.out.println("Nama: " + nama);
        System.out.println("Umur awal: " + umur);
        System.out.println("Tinggi: " + tinggi + " cm");

        // Update Variabel : Mengubah nilai variabel yang sudah ada.
        // Ubah nilai umur
        umur = 19;
        
        // Menampilkan nilai umur setelah di update
        System.out.println("Umur setelah diupdate: " + umur);

    }
}
