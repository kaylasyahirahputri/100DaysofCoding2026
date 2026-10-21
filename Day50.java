import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = in.nextInt();

        String status = (bilangan % 2 == 0) ? "Genap" : "Ganjil";

        // Menampilkan
        System.out.println("Bilangan " + bilangan + " adalah " + status);
      
    }
}
