import java.util.Scanner;
public class day31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Masukkan data mahasiswa
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan nilai tugas: ");
        double nilai = input.nextDouble();

        System.out.print("Apakah sudah terdaftar? (true/false): ");
        boolean status = input.nextBoolean();

        // Memeriksa semua syarat menggunakan operator &&, ||, !
        boolean semuaSyarat = (umur >= 17) && (nilai >= 75) && status ;
        boolean salahSatuSyarat = (umur >= 17) || (nilai >= 75) || status ;
        boolean belumTerdaftar = !status;

        // Menampilkan hasil
        System.out.println("Memenuhi semua syarat: " + semuaSyarat);
        System.out.println("Memenuhi salah satu syarat: " + salahSatuSyarat);
        System.out.println("Belum terdaftar: " + belumTerdaftar);
        
        input.close();
    
    }
}
