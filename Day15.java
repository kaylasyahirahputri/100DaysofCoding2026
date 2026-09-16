import java.util.Scanner;

public class day15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Operator Aritmatika Perkalian (*) dan Pembagian(/)

        // Input harga satu barang
        System.out.print("Masukkan harga barang: ");
        int harga = input.nextInt();

        // Input jumlah barang
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = input.nextInt();

        // Input jumlah orang
        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang = input.nextInt();

        // Menghitung total harga dengan operator perkalian (*)
        int totalHarga = harga * jumlahBarang;

        // Menghitung harga per orang dengan operator pembagian (/)
        int hargaPerOrang = totalHarga / jumlahOrang;

        // Menampilkan hasil
        System.out.println("Total harga : " + totalHarga);
        System.out.println("Harga Per Orang : " + hargaPerOrang);

    }
}
