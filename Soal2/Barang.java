package Soal2;
import java.time.LocalDateTime;

public class Barang {
    private String nama;
    private double harga;
    private int stok;
    private LocalDateTime tanggalMasuk;

    // static variable
    private static int totalBarang = 0;

    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.tanggalMasuk = LocalDateTime.now(); // otomatis

        totalBarang++;
    }

    public static int getTotalBarang() {
        return totalBarang;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public LocalDateTime getTanggalMasuk() {
        return tanggalMasuk;
    }
}
