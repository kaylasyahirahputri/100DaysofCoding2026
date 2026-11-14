import java.util.Scanner;
public class day74 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap : ");
        String nama = in.nextLine();

        System.out.print("Konfirmasi nama lengkap : ");
        String konfirmasi = in.nextLine();

        System.out.print("Masukkan program studi : ");
        String prodi = in.nextLine();

        System.out.print("Masukkan alamat email : ");
        String email = in.nextLine();

        boolean namaKosong = nama.isEmpty();
        boolean konfirmasiNama = nama.equals(konfirmasi);
        boolean prodiSesuai = prodi.equalsIgnoreCase("Informatika");
        boolean emailValid = email.contains("@kampus.ac.id");

        System.out.println("\n===== HASIL PEMERIKSAAN =====");
        System.out.println("Nama lengkap kosong  : " + namaKosong);
        System.out.println("Konfirmasi nama      : " + konfirmasiNama);
        System.out.println("Program studi sesuai : " + prodiSesuai);
        System.out.println("Email kampus valid   : " + emailValid);

    }
}
