import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("        INPUT BIODATA MAHASISWA");
        System.out.println("========================================");

        // Meminta pengguna agar memasukkan Nama, NIM, Umur, Tinggi Badan, Grade
        System.out.print("Masukkan Nama   : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM    : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Umur   : ");
        int umur = input.nextInt();

        System.out.print("Tinggi Badan    : ");
        double tinggi = input.nextDouble();
    
        System.out.print("Masukkan Grade  : ");
        char grade = input.next().charAt(0);

        // Tampilkan hasil
        System.out.println("\n=========== BIODATA MAHASISWA ===========");
        System.out.printf("%-15s : %s%n", "Nama", nama);
        System.out.printf("%-15s : %s%n", "NIM", nim);
        System.out.printf("%-15s : %d tahun%n", "Umur", umur);
        System.out.printf("%-15s : %.2f cm%n", "Tinggi Badan", tinggi);
        System.out.printf("%-15s : %c%n", "Grade", grade);
        System.out.println("===========================================");
    }

}
