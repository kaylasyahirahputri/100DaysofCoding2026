import java.util.Scanner;

public class PerbandinganNilai {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input dua nilai
        System.out.print("Masukkan nilai pertama : ");
        int nilai1 = input.nextInt();

        System.out.print("Masukkan nilai kedua   : ");
        int nilai2 = input.nextInt();

        // Menampilkan hasil perbandingan
        boolean sama = nilai1 == nilai2;
        boolean berbeda = nilai1 != nilai2;

        System.out.println("Nilai pertama sama dengan nilai kedua   : " + sama);
        System.out.println("Nilai pertama berbeda dengan nilai kedua : " + berbeda);

        input.close();
    }
}
