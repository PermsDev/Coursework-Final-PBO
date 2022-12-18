import java.util.Scanner;
import java.io.FileWriter;   
import java.io.IOException; 
//import java.io.PrintWriter;

public class awalan {

    //rumus Rumus = new rumus();

    public static boolean CekValue(String value){
        try {
                Integer.parseInt(value);
                return true;
            } catch (NumberFormatException ex)
            {
                return false;
            }
    }

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        menu:
        while(true){

        System.out.println("\n==========================================");
        System.out.println("      Aplikasi Menghitung Luas Bangun     ");
        System.out.println("==========================================");

        System.out.println("Pilih Bangun Datar :\nA. Persegi\nB. Persegi Panjang\nC. Segitiga\nD. Lingkaran\nE. Exit");
        System.out.print("Pilihan : ");
        String pilih = input.nextLine();
        System.out.println("==========================================");

        switch(pilih.toLowerCase()){
            case "a":
                System.out.println("Menghitung Luas Persegi");

                System.out.print("Masukan Nilai Sisi : ");
                String sisi = input.nextLine();
 
                if(CekValue(sisi)){
                    int s = Integer.parseInt(sisi);
                    int luas = rumus.Persegi(s);
                    System.out.println("Luas Persegi anda : "+luas);
                    System.out.println("------------------------------------------");
                    try {
             
                        FileWriter myWriter = new FileWriter("persegi.txt", true);
                        myWriter.write("Diketahui :\nsisi = "+sisi);
                        myWriter.write("\nRumus : sisi * sisi");
                        myWriter.write("\nLuas Persegi anda: "+luas);
                        myWriter.write("\n-------------------------------\n");
                        myWriter.close();
                        System.out.println("BERHASIL TERKIRIM");
                    } 
                    catch (IOException e) {
                        System.out.println("TERJADI EROR");
                        e.printStackTrace();
                    }

                }else{
                    System.out.println("Nilai yang anda masukan harus integer");
                }
                break;

            case "b":
                System.out.println("Menghitung Luas Persegi Panjang");

                System.out.print("Masukan Nilai Panjang : ");
                String panjang = input.nextLine();

                System.out.print("Masukan Nilai Lebar : ");
                String lebar = input.nextLine();

                if(CekValue(panjang) && CekValue(lebar)){
                    int p = Integer.parseInt(panjang);
                    int l = Integer.parseInt(lebar);
                    int luas = rumus.PersegiPanjang(p,l);
                    System.out.println("Luas Persegi Panjang anda : "+luas);
                    System.out.println("------------------------------------------");
                    try {
            
                        FileWriter myWriter = new FileWriter("PersegiPanjang.txt", true);
                        myWriter.write("Diketahui : ");
                        myWriter.write("\np : "+panjang);
                        myWriter.write("\nl : "+lebar);
                        myWriter.write("\nRumus : p . l ");
                        myWriter.write("\nLuas Persegi Panjang anda : "+luas);
                        myWriter.write("\n-------------------------------\n");
                        myWriter.close();
                        System.out.println("BERHASIL TERKIRIM");
                    } 
                    catch (IOException e) {
                        System.out.println("TERJADI EROR");
                        e.printStackTrace();
                    }

                }else{
                    System.out.println("Nilai yang anda masukan harus integer");
                }
                break;

                case "c":
                System.out.println("Menghitung Luas Segitiga");
 
                System.out.print("Masukan Nilai Alas : ");
                String alas = input.nextLine();
 
                System.out.print("Masukan Nilai Tinggi : ");
                String tinggi = input.nextLine();
 
                if(CekValue(alas) && CekValue(tinggi)){
                    int a = Integer.parseInt(alas);
                    int t = Integer.parseInt(tinggi);
                    double luas = rumus.Segitiga(a,t);
                    System.out.println("Luas Segitiga anda : "+luas);
                    System.out.println("------------------------------------------");
                    try {
            
                        FileWriter myWriter = new FileWriter("segitiga.txt", true);
                        myWriter.write(" :\na = "+alas);
                        myWriter.write("\nt = "+tinggi);
                        myWriter.write("\nRumus : 0,5 * (alas * tinggi) ");
                        myWriter.write("\nLuas segitiga anda: "+luas);
                        myWriter.write("\n---------------------------------\n");
                        myWriter.close();
                        System.out.println("BERHASIL TERKIRIM");
                    } 
                    catch (IOException e) {
                        System.out.println("TERJADI EROR");
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("Nilai yang anda masukan harus integer");
                }

                break;

            case "d":
                System.out.println("Menghitung Lingkaran");
 
                System.out.print("Masukan Nilai Diamter : ");
                String diameter = input.nextLine();
 
                if(CekValue(diameter)){
                    int d = Integer.parseInt(diameter);
                    double luas = rumus.Lingkaran(d);
                    String luas1 = String.format("\nLuas lingkaran anda: %.2f\n", luas);
                    System.out.printf(luas1);

                    System.out.println("------------------------------------------");
                    try {
            
                        FileWriter myWriter = new FileWriter("lingkaran.txt", true);
                        myWriter.write("Diketahui :\nd = "+diameter);
                        myWriter.write("\nr = "+(0.5 * d));
                        myWriter.write("\nRumus 1 : luas = 22 * (r*r/7) ");
                        myWriter.write("\nRumus 2 : luas = 22 * r  *r ");
                        myWriter.write(luas1);
                        myWriter.write("\n--------------------------\n");


                        myWriter.close();
                        System.out.println("BERHASIL TERKIRIM");
                    } 
                    catch (IOException e) {
                        System.out.println("TERJADI EROR");
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("Nilai yang anda masukan harus integer");
                }
                break;
            case "e":
                System.out.println("Terima Kasih Telah Menggunakan Aplikasi Saya");
                break menu;
            default:
            
                System.out.println("Tolong Masukkan Huruf A-E");
                System.out.println("------------------------------------------");
        }
        }
        input.close();
}
    
    // public static void baca(String[] args) {
    //     try {
    //         main tulis = main(luas);

    //         FileWriter myWriter = new FileWriter("uji.txt");
    //         myWriter.write("Luas : "+tulis);
    //         myWriter.close();
    //         System.out.println("BERHASIL Terkirim");
    //     } 
    //     catch (IOException e) {
    //         System.out.println("TERJADI EROR");
    //         e.printStackTrace();
    //     }
    //   }

}
