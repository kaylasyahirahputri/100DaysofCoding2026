import java.util.Scanner;

public class BiodataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Kelas : ");
        char kelas = input.next().charAt(0);

        System.out.print("Masukkan Umur : ");
        int umur = input.nextInt();

        input.nextLine();

        System.out.print("Masukkan Prodi : ");
        String prodi = input.nextLine();

        System.out.print("Masukkan IPK : ");
        double ipk = input.nextDouble();

        System.out.print("Status Keaktifan : ");
        boolean statusAktif = input.nextBoolean();

        // Menampilkan
        System.out.println("===== BIODATA MAHASISWA =====");
        System.out.println("Masukkan Nama          : " + nama);
        System.out.println("Masukkan NIM           : " + nim);
        System.out.println("Masukkan Kelas         : " + kelas);
        System.out.println("Masukkan Umur          : " + umur + " Tahun");
        System.out.println("Masukkan Prodi         : " + prodi);
        System.out.println("Masukkan ipk           : " + ipk);
        System.out.println("Masukkan Status Aktif  : " + statusAktif);
        System.out.println("=============================");

        input.close();
    }
}

import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Konstanta PI
        final double phi = 3.14;

        // Input jari-jari
        int jariJari = input.nextInt();

        // Menghitung luas lingkaran
        double luas = phi * jariJari * jariJari;

        // Tampilkan luas lingkaran
        System.out.println(luas);
    
    }
}

import java.util.Scanner;

public class TukarVariabel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dua bilangan
        int a = input.nextInt();
        int b = input.nextInt();

        // Menukar nilai tanpa variabel tambahan
        a = a + b;
        b = a - b;
        a = a - b;

        // Menampilkan hasil setelah ditukar
        System.out.println(a);
        System.out.println(b);

        input.close();
    }
}
