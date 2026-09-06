public class day05 {
    public static void main(String[] args) {
        /* Tipe Data Pecahan 
        double */

        // Menyimpan nilai tugas, UTS, dan UAS mahasiswa
        // Menggunakan tipe data double karena nilainya berupa angka desimal
        double nilaiTugas = 85.5;
        double nilaiUTS = 80.0;
        double nilaiUAS = 90.5;

        // Menghitung rata-rata dari ketiga nilai
        // Ketiga nilai dijumlahkan kemudian dibagi 3
        double rataRata = (nilaiTugas + nilaiUTS + nilaiUAS) / 3;

        //Menampilkan judul program
        System.out.println("================================");
        System.out.println("       NILAI MAHASISWA");
        System.out.println("================================");

        // Menampilkan nilai tugas, UTS, dan UAS 
        // Menampilkan hasil perhitungan nilai rata-rata mahasiswa
        System.out.println();
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai UAS   : " + nilaiUAS);
        System.out.println();
        System.out.println("Rata-rata   : " + rataRata);

        System.out.println("================================");

    }
}
        
