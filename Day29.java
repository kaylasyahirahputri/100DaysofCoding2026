import java.util.Scanner;
public class day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Memasukkan nilai pertama 
        System.out.print("Masukkan nilai pertama : ");
        int nilai1 = sc.nextInt();

        // Memasukkan nilai kedua
        System.out.print("Masukkan nilai kedua : ");
        int nilai2 = sc.nextInt();
        
        // Membandingkan nilai pertama dengan nilai kedua
        System.out.println("Nilai pertama lebih kecil dari nilai kedua : " + (nilai1 < nilai2));
        System.out.println("Nilai pertama lebih besar dari nilai kedua : " + (nilai1 > nilai2));

        sc.close();
    
    }  
}
