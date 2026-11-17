
import java.util.Scanner;

public class day77 {
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

        String namaTrim = nama.trim();
        int jumlahKarakter = namaTrim.length();
        String namaKapital = namaTrim.toUpperCase();
        String namaKecil = namaTrim.toLowerCase();
        String tigaKarakter = namaTrim.substring(0, 3);
        String namaReplace = namaTrim.replace(" ", "_");

        boolean namaKosong = namaTrim.isEmpty();
        boolean konfirmasiSesuai = namaTrim.equals(konfirmasi.trim());
        boolean prodiSesuai = prodi.equalsIgnoreCase("Informatika");
        boolean emailKampus = email.contains("@kampus.ac.id");

        System.out.println("\n===== HASIL PENGOLAHAN DATA =====");
        System.out.println("Nama Setelah Trim       : " + namaTrim);
        System.out.println("Jumlah Karakter         : " + jumlahKarakter);
        System.out.println("Nama Huruf Kapital      : " + namaKapital);
        System.out.println("Nama Huruf Kecil        : " + namaKecil);
        System.out.println("Tiga Karakter Pertama   : " + tigaKarakter);
        System.out.println("Nama Setelah Replace    : " + namaReplace);

        System.out.println("\n===== HASIL PEMERIKSAAN =====");
        System.out.println("Nama Kosong             : " + namaKosong);
        System.out.println("Konfirmasi Nama Sesuai  : " + konfirmasiSesuai);
        System.out.println("Program Studi Sesuai    : " + prodiSesuai);
        System.out.println("Email Kampus            : " + emailKampus);

    }
}
