import java.util.Scanner;

public class day13 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT BIODATA MAHASISWA ===");
        
        // Meminta input
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        double tinggi = input.nextDouble();

        // Bersihkan enter
        input.nextLine();

        System.out.print("Masukkan nim: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Kelas: ");
        String kelas = input.nextLine();

        System.out.print("Masukkan Jurusan: ");
        String jurusan = input.nextLine();

        System.out.print("Masukkan Grade: ");
        char grade = input.next().charAt(0);

        // Menampilkan output
        System.out.println("\n========== BIODATA MAHASISWA ==========");
        System.out.printf("%-18s   : %s%n", "Nama Lengkap", nama);
        System.out.printf("%-18s   : %d tahun%n", "Umur", umur);
        System.out.printf("%-18s   : %.2f cm%n", "Tinggi Badan", tinggi);
        System.out.printf("%-18s   : %s%n", "NIM", nim);
        System.out.printf("%-18s   : %s%n", "Kelas", kelas);
        System.out.printf("%-18s   : %s%n", "Jurusan", jurusan);
        System.out.printf("%-18s   : %c%n", "Grade", grade);
        System.out.println("=========================================");
        input.close();
    }
    
}
