package Soal3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements CrudRepository<Product> {

    @Override
    public void insert(Product p) {
        String sql = "INSERT INTO product (nama, harga, stok, tanggal_masuk) VALUES (?, ?, ?, ?)";

        try (Connection c = DatabaseUtil.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, p.getNama());
            ps.setDouble(2, p.getHarga());
            ps.setInt(3, p.getStok());
            ps.setTimestamp(4, Timestamp.valueOf(p.getTanggalMasuk()));
            ps.executeUpdate();

            System.out.println("Produk berhasil ditambahkan");

        } catch (SQLException e) {
            System.out.println("Insert error: " + e.getMessage());
        }
    }

    @Override
    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM product";

        try (Connection c = DatabaseUtil.getConnection();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Product p = new Product(
                        rs.getString("nama"),
                        rs.getDouble("harga"),
                        rs.getInt("stok")
                );

                // set ID (karena dari DB)
                p.id = rs.getInt("id");

                list.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Read error: " + e.getMessage());
        }
        return list;
    }


    @Override
    public void update(int id, double harga, int stok) {
        String sql = "UPDATE product SET harga=?, stok=? WHERE id=?";

        try (Connection c = DatabaseUtil.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setDouble(1, harga);
            ps.setInt(2, stok);
            ps.setInt(3, id);
            ps.executeUpdate();

            System.out.println("Produk berhasil diupdate");

        } catch (SQLException e) {
            System.out.println("Update error: " + e.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM product WHERE id=?";

        try (Connection c = DatabaseUtil.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Produk berhasil dihapus");

        } catch (SQLException e) {
            System.out.println("Delete error: " + e.getMessage());
        }
    }
}
