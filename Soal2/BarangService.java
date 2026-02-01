package Soal2;
import java.util.ArrayList;
import java.util.List;

public class BarangService {

    private List<Barang> daftarBarang = new ArrayList<>();

    public void tambahBarang(String nama, String hargaInput, String stokInput) {
        try {
            double harga = Double.parseDouble(hargaInput);
            int stok = Integer.parseInt(stokInput);

            if (stok < 0) {
                throw new IllegalArgumentException("Stok tidak boleh negatif");
            }

            Barang barang = new Barang(nama, harga, stok);
            daftarBarang.add(barang);

            System.out.println("Barang berhasil ditambahkan.");

        } catch (NumberFormatException e) {
            System.out.println("ERROR: Harga atau stok harus berupa angka!");
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void tampilkanBarang() {
        for (Barang b : daftarBarang) {
            System.out.println(
                b.getNama() + " | Harga: " + b.getHarga() +
                " | Stok: " + b.getStok() +
                " | Tanggal Masuk: " + b.getTanggalMasuk()
            );
        }
    }
}
