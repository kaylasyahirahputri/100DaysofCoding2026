import java.util.Scanner;
public class Soal01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan umur anda: ");
        int umur = in.nextInt();

        System.out.print("Apakah membawa KTP (true/false): ");
        boolean ktp = in.nextBoolean();

        if (umur >= 17 && ktp == true) {
            System.out.println("Pendaftaran Diterima! Silahkan Lanjut ke foto");
        } else {
            System.out.println("Pendaftaran Ditolak! Usia Belum mencukupi atau KTP tidak ada");
        }
        
    }
}

import java.util.Scanner;
public class Soal02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            System.out.print("Masukkan sebuah angka: ");
            int angka = in.nextInt();

            if (angka > 0) {
                System.out.println("Ini adalah angka Positif.");

                if (angka % 2 == 0) {
                    System.out.println("Angka ini bernilai Genap.");
                } else {
                    System.out.println("Angka ini bernilai Ganjil.");
                }
            } else if (angka < 0) {
                System.out.println("Ini adalah angka Negatif.");
            } else {
                System.out.println("Ini adalah angka Nol.");
            }
        }
    }

import java.util.Scanner;
public class Soal03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== MESIN KOPI OTOMATIS ===");
        System.out.println("1. Kopi Hitam (Rp 5000)");
        System.out.println("2. Cappucino (Rp 10000");
        System.out.println("3. Teh Manis (Rp 4000)");

        System.out.print("Pilih nomor minuman (1/2/3): ");
        int pilihan = in.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Kopi Hitam");
            System.out.println("Silahkan masukkan uang sebesar Rp 5000");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih Cappucino");
            System.out.println("Silahkan masukkan uang sebesar Rp 10000");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih Teh Manis");
            System.out.println("Silahkan masukkan uang sebesar Rp 4000");
        } else {
            System.out.println("Pilihan tidak valid!");
            System.out.println("Minuman tidak ditemukan");
        }

    }
    
}

import java.util.Scanner;
public class Soal04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan berat emas: ");
        double berat = in.nextDouble();

        if (berat % 1 != 0) {
            System.out.println("Bilangan Desimal (Emas Digital)");
        } else {
            System.out.print("Bilangan Bulat (Emas Fisik)");
        }
    }
}

import java.util.Scanner;
public class Soal05 {
    public static void main(String[] args ) {
        java.util.Scanner in = new Scanner(System.in);

        System.out.print("Masukkan batas bawah: ");
        int batasBawah = in.nextInt();

        System.out.print("Masukkan batas atas: ");
        int batasAtas = in.nextInt();

        System.out.print("Masukkan angka target: ");
        int target = in.nextInt();

        if (target >= batasBawah && target <= batasAtas) {
            System.out.println("Status: Di dalam range!");
        } else {
            System.out.println("Status: Di luar range!");
        }
    }
    
}

import java.util.Scanner;
public class Soal06 {
    public static void main(String[] args ) {
        java.util.Scanner in = new Scanner(System.in);

        System.out.print("Masukkan HP: ");
        int hp = in.nextInt();

        System.out.print("Masukkan damage: ");
        int damage = in.nextInt();

        System.out.print("Menang? (true/false): ");
        boolean menang = in.nextBoolean();

        int level = 1;

        if (menang) {
            level++;
        } else {
            hp -= damage;
            level--;
        }

            if(level < 0) {
                level = 0;
            }
        
        System.out.println("Sisa HP :"+ hp);
        System.out.println("Level :" + level);
    }
    
}

import java.util.Scanner;
public class Soal07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int saldo = 100000;

        System.out.println("=== MENU ATM ===");
        System.out.println("1. Setor Uang");
        System.out.println("2. Tarik Uang");
        System.out.print("Pilih menu (1/2): ");
        int menu = in.nextInt();

        if ( menu == 1) {
            System.out.println("Masukkan nominal: ");
            int nominal = in.nextInt(); 
            
            saldo += nominal;
            System.out.println("Setor berhasil. Saldo Anda: Rp " + 15000);
        
        } else if ( menu == 2) {
            System.out.println("Masukkan nominal: ");
            int nominal = in.nextInt();

            if (saldo >= nominal) {
                saldo -= nominal;
                System.out.println("Tarik tunai berhasil. Saldo Anda: Rp" + saldo);
            } else {
                System.out.println("Maaf, dsaldo tidak cukup! Saldo Anda: Rp" + saldo);
            }
        } else {
            System.out.println("Error: Menu tidak valid.");
            System.out.println("Transasksi dibatalkan.");
        }
    }
}

