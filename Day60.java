import java.util.Scanner;
public class day60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int j = 0;

        for(int i = 1; i <= n; i++) {
            j = j + i;
        }

        System.out.println(j);
    }
    
}
