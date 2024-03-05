package com.objek;

public class PenjagaGawang extends Pemain {
    private String tim;

    public PenjagaGawang(String nama, int nomorPunggung, String tim) {
        super(nama, nomorPunggung);
        this.tim = tim;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Penjaga Gawang " + nama + " (" + tim + "), Nomor Punggung: " + nomorPunggung);
    }
}
