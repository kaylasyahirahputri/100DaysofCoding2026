import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = in.nextInt();
        in.nextLine();

        String[] nama = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama ke-" + (i+1) + ": ");
            nama[i] =in.nextLine();
        }
        System.out.print("Masukkan nama yang dicari: ");
        String cari = in.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < jumlah; i++) {
            if (nama[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Nama " + cari + " ditemukan.");
        } else {
            System.out.println("Nama " + cari + " tidak ditemukan.");
        }
    }
}

