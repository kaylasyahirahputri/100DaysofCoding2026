import java.util.Scanner;
public class day59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = m; i <= n; i = i + m) {
            if (i % m == 0) {
                System.out.print(i + " ");
            }
            
        }


    }
    
}
