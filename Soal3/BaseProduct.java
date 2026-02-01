package Soal3;

import java.time.LocalDateTime;

public abstract class BaseProduct {
    protected int id;
    protected String nama;
    protected double harga;
    protected int stok;
    protected LocalDateTime tanggalMasuk;

    public BaseProduct(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.tanggalMasuk = LocalDateTime.now();
    }

    // ABSTRACT METHOD
    public abstract double hitungHargaJual();

    public String getNama() { return nama; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }
    public LocalDateTime getTanggalMasuk() { return tanggalMasuk; }
}
