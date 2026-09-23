import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menukarkan Nilai Dua Variabel

        // Meminta pengguna memasukkan nilai a dan b
        System.out.print("Masukkan nilai a : ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai b : ");
        int b = input.nextInt();

        // Menampilkan nilai sebelum ditukar
        System.out.println("\nSebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 1. Menukar dengan variabel tambahan
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nDengan variabel tambahan:");
        System.out.println("a = " + a);
        System.out.println("b = "  + b);

        // Mengembalikan nilai seperti semula
        temp = a;
        a = b;
        b = temp;

        // 2. Menukar tanpa variabel tambahan
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nTanpa variabel tambahan:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        input.close();
        
    }
}
