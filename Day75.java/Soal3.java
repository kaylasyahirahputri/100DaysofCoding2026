import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int awal = in.nextInt();

        System.out.print("Masukkan angka akhir: ");
        int akhir = in.nextInt();

        for (int i = awal; i <= akhir; i++) {
            System.out.print(i + " ");
        }
    }
}
