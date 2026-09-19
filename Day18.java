public class day18 {
    public static void main(String[] args) {

        // Konversi Otomatis (Dari Tipe Data Kecil ke Besar)

        // Membuat variabel bertipe byte 
        byte angka =  25;

        // Konversi otomatis dari byte ke short
        short nilaiShort = angka;

        // Konversi otomatis dari short ke int
        int nilaiInt = nilaiShort;

        // Konversi otomatis dari int ke long
        long nilaiLong = nilaiInt;

        //Konversi otomatis dari long ke float
        float nilaiFloat = nilaiLong;

        // Konversi otomatis dari float ke double
        double nilaiDouble = nilaiFloat;

        // Menampilkan semua hasil konversi
        System.out.println("Byte    : " + angka);
        System.out.println("Short   : " + nilaiShort);
        System.out.println("Int     : " + nilaiInt);
        System.out.println("Long    : " + nilaiLong);
        System.out.println("Float   : " + nilaiFloat);
        System.out.println("Double  : " + nilaiDouble);


    }
}
