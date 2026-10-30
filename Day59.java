import java.util.Scanner;
public class day59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = m; i <= n; i = i + m) {
            System.out.print(i + " ");
        }

        System.out.println();


    }
    
}
