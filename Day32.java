import java.util.Scanner;
public class day32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Minta input data mahasiswa
        System.out.print("Nilai rata-rata: ");
        int nilai = input.nextInt();

        System.out.print("Pendapatan orang tua: ");
        int pendapatan = input.nextInt();

        System.out.print("Aktif organisasi (true/false): ");
        boolean organisasi = input.nextBoolean();

        System.out.print("Pernah menerima beasiswa (true/false): ");
        boolean beasiswaLain = input.nextBoolean();

        // Cek setiap syarat
        boolean syaratNilai = nilai >= 80;
        boolean syaratPendapatan = (pendapatan <= 4000000) || organisasi;
        boolean lolos = syaratNilai && syaratPendapatan && !beasiswaLain;

        // Menampilkan hasil
        System.out.println("Syarat nilai terpenuhi: " + syaratNilai);
        System.out.println("Syarat pendapatan/organisasi: " + syaratPendapatan);
        System.out.println("Lolos seluruh seleksi: " + lolos);

        input.close();

    }
}
