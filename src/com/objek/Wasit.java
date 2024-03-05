package com.objek;

public class Wasit implements Peran {
    private String nama;
    private String kota;

    public Wasit(String nama, String kota) {
        this.nama = nama;
        this.kota = kota;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Wasit " + nama + " dari kota " + kota);
    }

    @Override
    public void serang() {
        System.out.println("Wasit tidak melakukan serangan.");
    }

    @Override
    public void bertahan() {
        System.out.println("Wasit tidak melakukan bertahan.");
    }
}
