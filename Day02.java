public class App {
    public static void main(String[] args) throws Exception {
    
        // materi print, println, printf
        
        String nama = "kayla syahirah putri";
        String hobi = "menggambar";
        int umur = 18;
        double tinggi = 160.5;

        //1. menggunakan println untuk mencetak teks dan menambahkan baris output
        System.out.println("=== BIODATA DIRI ===");
        System.out.println("nama : kayla syahirah putri");
        System.out.println("hobi : menggambar");

        //2. print digunakan untuk tidak memunculkan baris baru
        System.out.print("umur : 18");

        //3. printf digunakan untuk mencetak format khusus
        System.out.printf("tinggi : 160.5", args);
}
}
