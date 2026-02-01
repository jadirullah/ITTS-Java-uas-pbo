public abstract class Produk {
    protected String id;
    protected String nama;
    protected double hargaDasar;
    protected int stok;

    public Produk(String id, String nama, double hargaDasar, int stok) {
        this.id = id;
        this.nama = nama;
        this.hargaDasar = hargaDasar;
        this.stok = stok;
    }

    // Abstract method
    public abstract double hitungHargaJual();
}
