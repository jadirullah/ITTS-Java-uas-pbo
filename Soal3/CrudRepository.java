package Soal3;

import java.util.List;

public interface CrudRepository<T> {
    void insert(T data);
    List<T> findAll();
    void update(int id, double harga, int stok);
    void delete(int id);
}
