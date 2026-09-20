public class day19 {
    public static void main(String[] args) {
        // Konversi Manual dari Tipe Data Besar Ke Kecil
        // Nilai awal menggunakan tioe data double
        double angkaDouble = 150.75;

        // Konversi double ke float
        float angkaFloat = (float) angkaDouble;

        // Konversi float ke long
        long angkaLong = (long) angkaFloat;

        // Konversi long ke int
        int angkaInt = (int) angkaLong;

        // Konversi int ke short
        short angkaShort = (short) angkaInt;

        // Konversi short ke byte
        byte angkaByte = (byte) angkaShort;

        // Menampilkan hasil
        System.out.println("Nilai double : " + angkaDouble);
        System.out.println("Nilai float : " + angkaFloat);
        System.out.println("Nilai long : " + angkaLong);
        System.out.println("Nilai int : " + angkaInt);
        System.out.println("Nilai short : " + angkaShort);
        System.out.println("Nilai byte : " + angkaByte);

    }
}
