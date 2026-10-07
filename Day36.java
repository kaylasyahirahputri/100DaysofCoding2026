import java.util.Scanner;
public class day36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nomor peserta: ");
        int nomor = in.nextInt();

        if (nomor > 0) {
            if (nomor % 2 == 0) {
                System.out.println("Nomor peserta adalah bilangan Genap");
            } else {
                System.out.println("Nomor peserta adalah bilangan Ganjil");
            }
    
        }   
    }
}
