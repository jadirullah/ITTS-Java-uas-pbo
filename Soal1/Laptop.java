public class Laptop extends Produk implements Garansi {

    public Laptop(String id, String nama, double hargaDasar, int stok) {
        super(id, nama, hargaDasar, stok);
    }

    @Override
    public double hitungHargaJual() {
        return hargaDasar + (hargaDasar * 0.10);
    }

    @Override
    public void klaimGaransi() {
        System.out.println("Garansi laptop berhasil diklaim.");
    }
}
