import java.util.Scanner;
public class day34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Masukkan nilai ujian & status pendaftaran
        System.out.print("Masukkan nilai ujian : ");
        int nilai = in.nextInt();

        System.out.print("Apakah sudah terdaftar : ");
        boolean terdaftar = in.nextBoolean();

        //Menentukan kategori nilai
        if (nilai >= 80 && nilai <= 100) {
            System.out.println("Kategori Nilai : + Sangat Baik");
        } else if (nilai >= 70) {
            System.out.println("Kategori Nilai : + Baik");
        } else if (nilai >= 60) {
            System.out.println("Kategori Nilai : Cukup");
        } else {
            System.out.println("Kategori Nilai : Kurang");
        }
    
        if (nilai >= 60 && terdaftar) {
            System.out.println("Status     : Lulus");
        } else {
            System.out.println("Status     : Tidak Lulus");
        }
    
    }
}
