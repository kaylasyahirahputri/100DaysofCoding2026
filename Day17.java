import java.util.Scanner;

public class day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        // Input data poin dari pelanggan 
        System.out.print("Masukkan poin awal pelanggan : ");
        int poin = input.nextInt();

        System.out.print("Masukkan poin transasksi baru : ");
        int tambahan = input.nextInt();

        System.out.print("Masukkan poin yang ditukar : ");
        int ditukar = input.nextInt();

        System.out.println("\n--- RIWAYAT PERUBAHAN POIN ---");

        //Menampilkan poin awal pelanggan 
        System.out.println("Poin awal                : " + poin);
        
        // Menambahkan poin transaksi menggunakan operator +=
        poin += tambahan;
        System.out.println("Setelah tambah transasksi (+" + tambahan + ") : " + poin);

        // Mengurangi poin yang ditukarkan  menggunakan operator -=
        poin -= ditukar;
        System.out.println("Setelah tukar poin (-" + ditukar + ")         : " + poin);

        // Mengalikan poin dengan 2 menggunakan operator *=
        poin *= 2;
        System.out.println("Setelah promo Double Points (*=2): " + poin);

        // Menampilkan poin akhir pelanggan 
        System.out.println("PoinAkhirPelanggan    : " + poin);

    }
}

