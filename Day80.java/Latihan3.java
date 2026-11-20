import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] nilai = {80, 85, 90, 75, 95};

        System.out.print("Masukkan indeks: ");
        int indeks = in.nextInt();

        if (indeks >= 0 && indeks < nilai.length) {
            System.out.println("Nilai pada indeks " + indeks + " : " + nilai[indeks]);
        } else {
            System.out.println("Indeks tidak ada");
        }
    }
}
