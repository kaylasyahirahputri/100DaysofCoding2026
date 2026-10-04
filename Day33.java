import java.util.Scanner;

public class day33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan nilai ujian
        System.out.print("Masukkan nilai ujian: ");
        int nilai = input.nextInt();

        // Memasukkan status pendaftaran
        System.out.print("Sudah terdaftar? (true/false): ");
        boolean terdaftar = input.nextBoolean();

        // Memeriksa kedua syarat dengan operator &&
        if (nilai >= 75 && terdaftar == true) {
            System.out.println("Status: Boleh Mengikuti Ujian");
        } else {
            System.out.println("Status: Belum Boleh Mengikuti Ujian");
        }

        input.close();
    }
}
