import java.util.Scanner;
public class day49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan total belanja: ");
        int totalBelanja = in.nextInt();

        String kategori = (totalBelanja >= 500000)
                ? "Pelaggan VIP"
                : "Pelanggan Reguler";

        String bonus = (totalBelanja % 2 == 0)
                ? "Voucher Chasback"
                : "Poin Reward";

        System.out.println("===== DATA PELANGGAN =====");
        System.out.println("Total Belanja : " + totalBelanja);
        System.out.println("Kategori : " + kategori);
        System.out.println("Bonus : " + bonus);
    }
}
