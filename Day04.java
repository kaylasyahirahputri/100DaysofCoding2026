public class day04 {
    public static void main(String[] args) {
        /* Type data Numerik Bilangan Bulat
           byte, short, int, long*/
        
        /*Byte: Tipe data yang digunakan untuk menyimpan bilangan bulat dalam skala kecil.
                Jangkauan nilainya umumnya dari -128 hingga 127. */

                byte a = 127;

        /*Short: Tipe data yang digunakan untuk menyimpan bilangan bulat dengan jangkauan yang lebih besar dari Byte.
                 Jangkauannya sekitar -32.768 hingga 32.767. */

                 short b = 32767;

        /*Int: Tipe data yang paling umum dugunakan.
                Jangkauan nilainya biasanya -2.147.483.648 
                hingga 2.147.483.647. */

                int c = 2147483647;

        /*Long: Tipe data yang digunakan untuk menyimpan bilangan bulat yang sangat besar,
                lebih besar dari kapasitas data Int.
                Jangkauannya hingga -9.223.372.036.854.775.808 sampai 9.223.372.036.854.775.807. */

                long d = 9223372036854775807L;

            System.out.println("Byte : " + a);
            System.out.println("Short : " + b);
            System.out.println("Int : " + c);
            System.out.println("Long : " + d);

    }
}
