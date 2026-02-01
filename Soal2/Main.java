package Soal2;

public class Main {
    public static void main(String[] args) {

        BarangService service = new BarangService();

        // input valid
        service.tambahBarang("Laptop", "10000000", "5");

        // input harga salah
        service.tambahBarang("Mouse", "sepuluh ribu", "10");

        // input stok negatif
        service.tambahBarang("Keyboard", "250000", "-3");

        System.out.println("\nDaftar Barang:");
        service.tampilkanBarang();

        System.out.println("\nTotal barang dibuat: " + Barang.getTotalBarang());
    }
}
