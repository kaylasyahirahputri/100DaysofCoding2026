import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input dua angka
        System.out.print("Masukkan angka pertama: ");
        double angka1 = in.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = in.nextDouble();

        // Pilih simbol operasi
        System.out.print("Masukkan simbol operasi (+, -, *, /, %): ");
        char operasi = in.next().charAt(0);

        double hasil = 0;
        boolean valid = true;

        // Menghitung berdasarkan simbol yang dipilih
        if (operasi == '+') {
            hasil = angka1 + angka2;
        } else if (operasi == '-') {
            hasil = angka1 - angka2;
        } else if (operasi == '*') {
            hasil = angka1 * angka2;
        } else if (operasi == '/') {
            if (angka2 == 0) {
                System.out.println("Error, tidak terdefinisi");
                valid = false;
            } else {
                hasil = angka1 / angka2;
            }
        } else if (operasi == '%') {
            if (angka2 == 0) {
                System.out.println("Error, tidak terdefinisi");
                valid = false;
            } else {
                hasil = angka1 % angka2;
            }
        } else {
            System.out.println("Waduhhh, operasi yang anda masukkan tidak ada!!!");
            valid = false;
        }

        // Menampilkan hasil perhitungan
        if (valid) {
            System.out.println("Hasil dari " + angka1 + " "
                    + operasi + " " + angka2 + " adalah " + hasil);
        }

    }
}
