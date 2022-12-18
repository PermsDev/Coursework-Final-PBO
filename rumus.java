public abstract class rumus {
    public static int Persegi(int sisi){
        //Rumus Luas Persegi = sisi * sisi
        int luas = sisi * sisi;
        return luas;
    }

    public static int PersegiPanjang(int panjang, int lebar){
        //Rumus Luas Persegi Panjang = panjang * lebar
        int luas = panjang * lebar;
        return luas;
    }
 
    public static double Segitiga(int alas,int tinggi){
        //Rumus Luas Segitiga = 1/2 * (alas * tinggi)
        double luas = 0.5 * (alas * tinggi);
        return luas;
    }
 
    public static double Lingkaran(int diameter){
        //Rumus Luas Lingkaran = phi * r * r
        //r = 1/2 * diamter (jari-jari)
        //phi bisa 22/7 dan 3.14
        double r = 0.5 * diameter;
        double luas = 0;
        if(r % 7 == 0){
            luas = 22 * (r*r/7);
        }else{
            luas = 3.14 * r * r;
        }
        return luas;
    }
 
    // public static boolean CekValue(String value){
    //     try {
    //             Integer.parseInt(value);
    //             return true;
    //         } catch (NumberFormatException ex)
    //         {
    //             return false;
    //         }
    // }
 
}
