import java.util.Scanner;
public class day71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pemasukan;
        int total = 0;

        while (true) {
            System.out.print("Masukkan pemasukan (angka negatif untuk berhenti): ");
            pemasukan = in.nextInt();

            if (pemasukan < 0) {
                break;
            }

            total += pemasukan;
        }

        System.out.println("Total seluruh pemasukan: Rp " + total);
    }
}
