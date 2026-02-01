package Soal3;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CrudRepository<Product> repo = new ProductRepository();

        while (true) {
            System.out.println("\n1. Tambah");
            System.out.println("2. Lihat");
            System.out.println("3. Update");
            System.out.println("4. Hapus");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");

            try {
                int pilih = sc.nextInt();

                if (pilih == 1) {
                    sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc.nextDouble();
                    System.out.print("Stok: ");
                    int stok = sc.nextInt();

                    repo.insert(new Product(nama, harga, stok));

                } else if (pilih == 2) {
                    List<Product> list = repo.findAll();
                    tampilkanTabelProduk(list);

                } else if (pilih == 3) {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Harga baru: ");
                    double h = sc.nextDouble();
                    System.out.print("Stok baru: ");
                    int s = sc.nextInt();

                    repo.update(id, h, s);

                } else if (pilih == 4) {
                    System.out.print("ID: ");
                    repo.delete(sc.nextInt());

                } else {
                    break;
                }

            } catch (Exception e) {
                System.out.println("Input tidak valid");
                sc.nextLine();
            }
        }
    }

    private static void tampilkanTabelProduk(List<Product> products) {

        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-15s | %-13s | %-13s | %-5s | %-20s |\n",
                "ID", "Nama Produk", "Harga Produk", "Harga Jual", "Stok", "Tanggal Masuk");
        System.out.println(
                "---------------------------------------------------------------------------------------------");

        for (Product p : products) {
            System.out.printf("| %-3d | %-15s | %-13.0f | %-13.0f | %-5d | %-20s |\n",
                    p.id,
                    p.getNama(),
                    p.getHarga(),
                    p.hitungHargaJual(), // POLYMORPHISM 🔥
                    p.getStok(),
                    p.getTanggalMasuk());
        }

        System.out.println(
                "---------------------------------------------------------------------------------------------");
    }

}