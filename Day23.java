import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang sisi persegi
        System.out.print("Masukkan sisi persegi : ");
        int sisi = input.nextInt();

        // Menghitung luas persegi
        int luas = sisi * sisi;

        // Menghitung keliling persegi
        int keliling = 4 * sisi;

        // Menampilkan hasil
        System.out.println("Luas persegi : " + luas);
        System.out.println("Keliling persegi : " + keliling);

        input.close();

    }
}
