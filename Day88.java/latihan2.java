
public class Latihan2 {

    static void hitungBelanja(int harga, int jumlah) {
        int total = harga * jumlah;

        System.out.println("Total belanja: " + total);
    }

    public static void main(String[] args) {
        hitungBelanja(10000, 3);
        hitungBelanja(15000, 2);
    }
}
