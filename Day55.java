import java.util.Scanner;

public class day55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int batas = in.nextInt();

        if (batas < 0) {
            System.out.println("Batas tidak valid!");
            in.close();
            return;
        }

        for (int i = 1; i <= batas; i++) {

            if (i % 3 == 0) {
                continue;
            }

            if (i == 13) {
                System.out.println("Sistem dihentikan di angka 13.");
                break;
            }

            System.out.print(i + " ");
        }

        if (batas < 13) {
            System.out.println("\nPencetakan Selesai.");
        }

    }
}
