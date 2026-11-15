import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan batas angka:");
        int n = in.nextInt();

        //for
        int i = 1;

        for (i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //while
        i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // do while
        i = 1;
        do { 
            System.out.print(i + " ");
            i++;
        } while (i <= n);

    }
}
