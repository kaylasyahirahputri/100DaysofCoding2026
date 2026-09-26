import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menghitung Luas dan Keliling Lingkaran

        // Memasukkan jari-jari lingkaran
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        // Nilai phi sesuai soal
        double phi = 3.14;

        // Menghitung luas lingkaran
        double luas = phi * r * r;

        // Menghitung keliling lingkaran
        double keliling = 2 * phi * r;

        // Menampilkan hasil 
        System.out.println("Luas lingkaran : " + luas);
        System.out.println("Keliling lingkaran : " + keliling);

        input.close();
        
    }
}
