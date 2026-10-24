import java.util.Scanner;
public class day53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String menu;
        String pesanLagi;
        int counter = 0;

        do {
            System.out.print("Masukkan nama menu: ");
            menu = in.nextLine();

            System.out.println("[Pesanan dicatat...]");
            counter++;

            System.out.print("Pesan lagi (y/t)? ");
            pesanLagi = in.nextLine();

        } while (pesanLagi.equalsIgnoreCase("y"));

        System.out.println("\nPemesanan Selesai!");
        System.out.println("Total pesanan Anda: " + counter + " menu");


    }
}
