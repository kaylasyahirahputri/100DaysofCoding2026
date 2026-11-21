
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah nama: ");
        int jumlah = in.nextInt();

        String[] nama = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama ke-" + (i + 1) + ": ");
            nama[i] = in.next();
        }

        System.out.println("\nDaftar nama:");

        for (int i = 0; i < jumlah; i++) {
            System.out.println(nama[i]);
        }
    }
}
