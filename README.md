# Project UAS Pemrograman Berorientasi Objek (PBO)

Aplikasi ini merupakan project Ujian Akhir Semester (UAS) mata kuliah
Pemrograman Berorientasi Objek (PBO) menggunakan bahasa Java.
Aplikasi berbasis console ini mengimplementasikan konsep OOP
(Abstract Class, Inheritance, Interface, Polymorphism),
serta operasi CRUD (Create, Read, Update, Delete) menggunakan database MySQL
melalui JDBC.

---

## 📌 Fitur Aplikasi
- Manajemen data produk (CRUD)
- Penyimpanan data menggunakan database MySQL
- Tampilan data berbentuk tabel di console
- Penerapan Exception Handling agar aplikasi tidak crash
- Pencatatan tanggal masuk produk secara otomatis
- Struktur kode berbasis Object-Oriented Programming

---

## 🛠️ Panduan Instalasi & Konfigurasi

### 1️⃣ Versi Java (JDK)

Aplikasi ini dikembangkan dan diuji menggunakan:

- **Java Development Kit (JDK) 25**
- Minimum versi yang disarankan: **JDK 17 atau lebih baru**

Untuk memastikan Java telah terpasang, jalankan perintah berikut di terminal:

```bash
java -version

```


### 2️⃣ Konfigurasi Database MySQL
📂 Membuat Database

Jalankan perintah berikut pada MySQL:

```bash
CREATE DATABASE UTS_pbo_db_toko;
USE UTS_pbo_db_toko;
```

📂 Membuat Tabel product

```bash
CREATE TABLE product (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nama VARCHAR(100),
    harga DOUBLE,
    stok INT,
    tanggal_masuk DATETIME
);
```

🔐 Konfigurasi User Database
Aplikasi menggunakan konfigurasi default berikut:

- Host : localhost
- Port : 3306
- Database : UTS_pbo_db_toko
- Username : root
- Password : (kosong)


Konfigurasi koneksi database dapat dilihat dan diubah pada file:

DatabaseUtil.java

```bash
DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/db_toko?useSSL=false&serverTimezone=UTC",
    "root",
    ""
);
```


### 3️⃣ Menambahkan Library JDBC Driver (MySQL Connector)
Aplikasi ini membutuhkan MySQL JDBC Driver agar Java dapat terhubung
ke database MySQL.

📦 Driver yang Digunakan

- mysql-connector-j-8.x.x.jar atau
- mysql-connector-j-9.x.x.jar

🔧 Cara Menambahkan JDBC Driver di VS Code

1. Download MySQL Connector/J dari situs resmi MySQL
2. Simpan file .jar ke dalam folder project (misal: Soal3.Lib)
3. Buka VS Code
4. Masuk ke panel JAVA PROJECTS
5. Klik kanan Referenced Libraries
6. Pilih Add Jar Libraries
7. Pilih file mysql-connector-j-xx.jar
8. Restart VS Code atau Java Language Server

Jika driver sudah ditambahkan dengan benar, error
No suitable driver found for jdbc:mysql://... tidak akan muncul lagi.

▶️ Cara Menjalankan Aplikasi
1. Pastikan database MySQL sudah berjalan
2. Pastikan JDBC Driver sudah ditambahkan ke classpath
3. Jalankan file Main.java
4. Gunakan menu console untuk melakukan operasi CRUD


📐 Arsitektur Aplikasi (Ringkas)
- BaseProduct → Abstract Class
- Product → Inheritance dari BaseProduct
- CrudRepository → Interface
- ProductRepository → Implementasi CRUD + JDBC
- DatabaseUtil → Utility koneksi database
- Main → Entry point aplikasi

👨‍💻 Author

- Nama : Jadirullah
- Mata Kuliah : Pemrograman Berorientasi Objek - ITTS
- Project : UAS PBO Java CRUD + JDBC

