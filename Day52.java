import java.util.Scanner;
public class day52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pin = 0;
         while (pin != 123456) {
            System.out.print("Masukkan PIN: ");
            pin = in.nextInt();

            if (pin != 123456) {
                System.out.println("PIN Salah. Silahkan coba lagi.");

            }
         }

         System.out.println("PIN Benar. Akses Diberikan.");
    }
}
