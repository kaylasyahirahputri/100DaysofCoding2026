import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlah = in.nextInt();

        int[] angka = new int[jumlah];

        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ":");
            angka[i] = in.nextInt();
            total += angka[i];
        }
        System.out.println("\nTotal seluruh angka: " + total);
    } 
}
