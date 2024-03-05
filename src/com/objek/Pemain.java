package com.objek;

public abstract class Pemain implements Peran {
    protected String nama;
    protected int nomorPunggung;

    public Pemain(String nama, int nomorPunggung) {
        this.nama = nama;
        this.nomorPunggung = nomorPunggung;
    }

    @Override
    public abstract void tampilkanInfo();

    @Override
    public void serang() {
        System.out.println(nama + " menyerang lawan!");
    }

    @Override
    public void bertahan() {
        System.out.println(nama + " melakukan tindakan bertahan.");
    }
}
