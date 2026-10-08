import java.util.Scanner;
public class day37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Minta input 
        System.out.print("Masukkan kode energi : ");
        int kode = input.nextInt();

        // Cek apakah kode positif, negatif, atau nol
        if (kode > 0) {
            
           // Cek genap atau ganjil
            if (kode % 2 == 0) {
                System.out.println("Kode Diterima (Energi positif).");
                System.out.println("Berhasil! Pintu Brankas Utama Terbuka, dokumen rahasia diamankan!");
            } else {
                System.out.println("Kode Diterima (Energi Positif).");
                System.out.println("JEBAKAN! Pintu terbuka tapi menyemprotkan Gas Beracun!");
            }
        
        } else if (kode < 0) {

            System.out.println("HACKER TERDETEKSI (Energi Negatif).");

            if (kode % 2 == 0) {
                System.out.println("Peringatan! Alarm  Level 1 Berbunyi!");
            } else {
                System.out.println("Peringatan Kritis! Pintu ruangan terkunci, Robot Penjaga dikerahkan!");
            }
        } else {
            // Jika kode = 0
            System.out.println("Sistem brankas dimatikan. Harap mulai ulang.");
        }
    
    }
}
