import java.util.Scanner;
public class day30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan nilai
        System.out.print("Masukkan nilai pertama: ");
        int nilaiPertama = input.nextInt();

        System.out.print("Masukkan nilai kedua: ");
        int nilaiKedua = input.nextInt();

        // Membandingkan kedua nilai menggunakan operator <= dan >=
        boolean lebihKecilSama = nilaiPertama <= nilaiKedua;
        boolean lebihBesarSama = nilaiPertama >= nilaiKedua;

        // Menampilkan hasil
        System.out.println("Nilai pertama lebih kecil atau sama dengan nilai kedua: " + lebihKecilSama);
        System.out.println("Nilai pertama lebih besar atau sama dengan nilai kedua: " + lebihBesarSama);

        input.close();
    }   
}
