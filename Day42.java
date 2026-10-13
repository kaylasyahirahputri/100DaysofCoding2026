import java.util.Scanner;
public class day42 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        System.out.print("Masukan Gaji Pokok: ");
        double gaji = in.nextDouble();
        System.out.print("Masukan Potongan bulanan: ");
        double potongan = in.nextDouble();
        double gajiBersih = gaji-potongan;

        if (gajiBersih == 0 && gaji > 0) {
            System.out.println("Gaji Bersih Nol: Harap Hubungi HRD!");
        } else if (gaji>=5000000 && gaji<=10000000 || potongan>=500000 && potongan<=1000000) {
            System.out.println("Gaji Bersih Standar");
        } else if (gaji<5000000 || potongan > 1000000) {
            System.out.println("Gaji Bersih Terlalu Rendah atau Potongan Terlalu Besar");
        } else if (gaji>10000000 || potongan<500000) {
            System.out.println("Gaji Bersih Tinggi atau Potongan Sangat Kecil");
        } 

    }

}
