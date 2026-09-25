import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan panjang dan lebar
        System.out.print("Masukkan panjang: ");
        int panjang = input.nextInt();

        System.out.print("Masukkan lebar: ");
        int lebar = input.nextInt();

        // Menghitung luas persegi panjang
        int luas = panjang * lebar;

        // Menghitung keliling persegi panjang
        int keliling = 2 * (panjang + lebar);

        // Menampilkan hasil
        System.out.println("Luas persegi : " + luas);
        System.out.println("Keliling persegi : " + keliling);

        input.close();
    }
}
