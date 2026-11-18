
import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== REGISTRASI AKUN ===");
        System.out.print("Buat username: ");
        String username = in.nextLine();
        System.out.print("Buat password: ");
        String password = in.nextLine();
        System.out.println("Akun berhasil dibuat!");

        System.out.println("\n=== LOGIN AKUN ===");
        String usernameLogin, passwordLogin;
        boolean berhasil = false;

        do {
            System.out.print("Masukkan username: ");
            usernameLogin = input.nextLine();
            System.out.print("Masukkan password: ");
            passwordLogin = input.nextLine();

            if (username.equals(usernameLogin) &&
                password.equals(passwordLogin)) {
                System.out.println("Selamat, Login Berhasil!");
                berhasil = true;

            } else {
                System.out.println("Username atau password salah.");
                System.out.println("Silakan coba kembali.\n");
            }

        } while (!berhasil);

    }
}
