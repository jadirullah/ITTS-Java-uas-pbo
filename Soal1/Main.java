public class Main {
    public static void main(String[] args) {

        // Polymorphism
        Produk produk1 = new Laptop("L01", "Laptop Asus", 10000000, 5);
        Produk produk2 = new Smartphone("S01", "Samsung", 5000000, 10);

        System.out.printf("Harga jual laptop    : %.0f%n", produk1.hitungHargaJual());
        System.out.printf("Harga jual smartphone: %.0f%n", produk2.hitungHargaJual());

        // Interface
        Garansi laptopGaransi = new Laptop("L02", "Lenovo", 9000000, 3);
        laptopGaransi.klaimGaransi();
    }
}
