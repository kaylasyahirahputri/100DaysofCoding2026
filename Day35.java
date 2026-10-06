import java.util.Scanner;
public class day35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Minta input status pendaftaran
        System.out.print("Apakah sudah terdaftar? : ");
        boolean sudahTerdaftar = in.nextBoolean();

        if (sudahTerdaftar) {

            // Input nilai
            System.out.print("Masukkan nilai DDP : ");
            double DDP = in.nextDouble();

            System.out.print("Masukkan nilai PBO : ");
            double PBO = in.nextDouble();

            System.out.print("Masukkan nilai FWB :");
            double FWB = in.nextDouble();

            // Hitung rata-rata
            double rataRata = (DDP + PBO + FWB) / 3;

            System.out.printf("Rata-rata nilai : %.1f%n", rataRata);

            //Cek syarat nilai
            if (rataRata >= 75) {
                System.out.println("Status : Boleh Mengikuti Lomba");
            } else {
                System.out.println("Status : Nilai Belum Memenuhi Syarat");
            }
        } else {
            System.out.println("Status : Belum Terdaftar");
        }
    }
}
