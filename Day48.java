import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2= input.nextDouble();

        System.out.print("Masukkan simbol operasi (+, -, *, /, %): ");
        char operasi = input.next().charAt(0);

        double hasil = 0;
        boolean valid = true;

        switch (operasi) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;

            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;

            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;

            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Tidak bisa membagi dengan 0");
                }
                break;

            case '%':
                if (angka2 != 0) {
                    hasil = angka1 % angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Modulus dengan 0 tidak bisa");
                }
                break;

            default:
                System.out.println("Operasi tidak tersedia");
        }

        input.close();
    }
}
