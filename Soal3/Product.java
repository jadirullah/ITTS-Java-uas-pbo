package Soal3;

public class Product extends BaseProduct {

    public Product(String nama, double harga, int stok) {
        super(nama, harga, stok);
    }

    // POLYMORPHISM
    @Override
    public double hitungHargaJual() {
        return harga + (harga * 0.10); // pajak default
    }
}