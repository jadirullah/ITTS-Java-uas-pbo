public class Smartphone extends Produk {

    public Smartphone(String id, String nama, double hargaDasar, int stok) {
        super(id, nama, hargaDasar, stok);
    }

    @Override
    public double hitungHargaJual() {
        return hargaDasar + (hargaDasar * 0.05);
    }
}