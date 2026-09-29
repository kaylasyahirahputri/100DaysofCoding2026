public class day28 {
    public static void main(String[] args) {

        int a = 5; //Nilai awal a

        int b = a++; //b=5, lalu a bertambah jadi 6

        int c = ++a; //a bertambah jadi 7, lalu masuk ke c

        int d = --c; //c berkurang jadi 6, lalu masuk ke d

        int e = d++; //e = 6, lalu d bertambah jadi 7

        // Menampilkan hasil
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    
    }
}
