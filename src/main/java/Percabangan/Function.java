package Percabangan;

//karena beda package harus import, jika di package yg sama tidak perlu import
import FirstProgram.namaKu;

public class Function {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int z = 9;

        namaKu.Gopal("Andi");
        tambah(x,y);
        tambah(x,z);
        tambah(y,z);
    }

    public static int tambah(int a, int b) {
        int hasilTambah = a+b;
        System.out.println("Hasil Tambah " +a+ "dan" +b+ "adalah :" +hasilTambah);
        return hasilTambah;
    }
}
