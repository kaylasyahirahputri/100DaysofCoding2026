public class day20 {
    public static void main(String[] args) {

        // Membuat variabel dengan tipe data yang berbeda
        int angka = 100;
        double nilai = 85.5;
        char huruf = 'A';
        boolean lulus = true;

        // Mengubah setiap variabel menjadi String
        String angkaString = String.valueOf(angka);
        String angkaNilai = String.valueOf(nilai);
        String angkaHuruf = String.valueOf(huruf);
        String angkaLulus = String.valueOf(lulus);

        // Menampilkan hasil konversi
        System.out.println("Hasil Konversi ke String:");
        System.out.println("int     : " + angkaString);
        System.out.println("double  : " + angkaNilai);
        System.out.println("char    : " + angkaHuruf);
        System.out.println("boolean : " + angkaLulus);
        
    }
}
