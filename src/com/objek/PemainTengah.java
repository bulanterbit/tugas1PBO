package com.objek;

public class PemainTengah extends Pemain {
    private String posisi;

    public PemainTengah(String nama, int nomorPunggung, String posisi) {
        super(nama, nomorPunggung);
        this.posisi = posisi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Pemain Tengah " + nama + ", Posisi: " + posisi + ", Nomor Punggung: " + nomorPunggung);
    }
}
