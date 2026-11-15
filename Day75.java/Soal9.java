import java.util.Scanner;
public class soal9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan batas angka(n): ");
        int n = in.nextInt();

        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        System.out.println("Hasil perkalian (" + n + "): " + hasil);
    }
}
