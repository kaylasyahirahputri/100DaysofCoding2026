import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Operator Aritmatika Modulus/Sisa Bagi (%)

        // Input jumlah permen dan jumlah siswa
        System.out.print("Masukkan jumlah permen: ");
        int jumlahPermen = input.nextInt();

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        // Menggunakan operator / untuk menghitung permen setiap siswa
        int permenSetiapSiswa = jumlahPermen / jumlahSiswa;

        // Menggunakan operator persen untuk menghitung permen yang tersiswa
        int permenTersisa = jumlahPermen % jumlahSiswa;

        // Menampilkan hasil
        System.out.println();
        System.out.println("Jumlah permen : " + jumlahPermen);
        System.out.println("Jumlah siswa " + jumlahSiswa);
        System.out.println("Setiap siswa mendapatkan : " + permenSetiapSiswa + " permen");
        System.out.println("Permen yang tersisa : " + permenTersisa + " permen");

    }

}
