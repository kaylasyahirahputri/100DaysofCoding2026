import java.util.Scanner;
public class day21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Semua data awal disimpan dalam bentuk string
        System.out.print("Nama : ");
        String namaStr = input.nextLine();
        
        System.out.print("Umur : ");
        String umurStr = input.nextLine();

        System.out.print("Tinggi Badan : ");
        String tinggiStr = input.nextLine();
        
        System.out.print("Huruf Awal Nama : ");
        String hurufStr = input.nextLine();

        System.out.print("Status Mhasiswa : ");
        String statusStr = input.nextLine();
        
        System.out.print("Saldo Awal : ");
        String saldoStr = input.nextLine();

        // Konversi String ke tipe data yang sesuai dengan masing-masing variabel
        int umur = Integer.parseInt(umurStr);
        double tinggiBadan = Double.parseDouble(tinggiStr);
        char hurufAwalNama = hurufStr.charAt(0);
        boolean statusMahasiswa = Boolean.parseBoolean(statusStr);
        double saldo = Double.parseDouble(saldoStr);

        // Menampilkan biodata mahasiswa
        System.out.println("\n===== BIODATA MAHASISWA =====");
        System.out.println("Nama               : " + namaStr);
        System.out.println("Umur               : " + umur);
        System.out.println("Tinggi Badan       : " + tinggiBadan);
        System.out.println("Huruf Awal Nama    : " + hurufAwalNama);
        System.out.println("Status Mahasiswa   : " + statusMahasiswa);
        System.out.println("Saldo Awal         : " + saldo);

        // Menambahkan umur 1 tahun menggunakan operator +=
        umur += 1;

        // Menambahkan saldo Rp50.000 menggunakan operator +=
        saldo += 50000;

        //Mengurangi saldo Rp25.000 menggunakan operator -=
        saldo -= 25000;

        // Mengalikan saldo dengan 2 menggunakan operator *=
        saldo *= 2;

        // Membagi saldo dengan 5 menggunakan operator /=
        saldo /= 5;

        // Mengecek apakah umur genap atau ganjil
        String jenisUmur;

        if (umur % 2 == 0) {
            jenisUmur = "Genap";
        } else {
            jenisUmur = "Ganjil";
        }

        // Konversi umur dari int menjadi double
        double umurDouble = (double) umur;

        // Konversi tinggi badan dari double menjadi int
        int tinggiInt = (int) tinggiBadan;

        // Mengubah hasil umur dan saldo menjadi String
        String umurString = String.valueOf(umur);
        String saldoString = String.valueOf(saldo);

        // Menampilkan seluruh hasil pengolahan menggunakan println dan printf
        System.out.println("\n===== HASIL PENGOLAHAN =====");
        System.out.println("Nama               : " + namaStr);
        System.out.println("Umur setelah +1    : " + umur);
        System.out.println("Tinggi Badan       : " + tinggiBadan);
        System.out.println("Huruf Awal Nama    : " + hurufAwalNama);
        System.out.println("Status Mahasiswa   : " + statusMahasiswa);

        System.out.printf("Saldo Awal        : %.0f%n", Double.parseDouble(saldoStr));
        System.out.printf("Setelah ditambah  : %.0f%n", Double.parseDouble(saldoStr) + 50000);
        System.out.printf("Setelah dikurangi : %.0f%n", (Double.parseDouble(saldoStr) +50000) - 25000);
        System.out.printf("Setelah dikali 2  : %.0f%n", ((Double.parseDouble(saldoStr) + 50000) - 25000) *2);
        System.out.printf("Setelah dibagi 5  : %.0f%n", saldo);
        
        System.out.println("Umur genap/ganjil    : " + jenisUmur);
        System.out.println("Umur ke double       : " + umurDouble);
        System.out.println("Tinggi ke int        : " + tinggiInt);
        System.out.println("Umur sebagai String  : " + umurString);
        System.out.println("Saldo sebagai String : " + saldoString);

        input.close();
    }
}
