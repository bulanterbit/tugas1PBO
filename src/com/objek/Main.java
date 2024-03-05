package com.objek;

public class Main {
    public static void main(String[] args) {
        // Membuat objek penjaga gawang
        PenjagaGawang penjagaGawang = new PenjagaGawang("David De Gea", 1, "Manchester United");
        System.out.println("Informasi Penjaga Gawang:");
        penjagaGawang.tampilkanInfo();
        penjagaGawang.serang();
        penjagaGawang.bertahan();
        System.out.println();

        // Membuat objek pemain tengah
        PemainTengah pemainTengah = new PemainTengah("Paul Pogba", 6, "Gelandang Serang");
        System.out.println("Informasi Pemain Tengah:");
        pemainTengah.tampilkanInfo();
        pemainTengah.serang();
        pemainTengah.bertahan();
        System.out.println();

        // Membuat objek wasit
        Wasit wasit = new Wasit("Michael Oliver", "London");
        System.out.println("Informasi Wasit:");
        wasit.tampilkanInfo();
        wasit.serang();
        wasit.bertahan();
    }
}
