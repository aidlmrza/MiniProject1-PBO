# MiniProject1-PBO
## Sistem Manajemen Koleksi Karya Seni Digital
# Profil
Nama: Muhammad Aidil Mirza

NIM: 2309116040
# Deskripsi
Program mengenai Koleksi Karya Seni Digital yang dimiliki user, user dapat melakukan CRUD pada koleksi yang dimiliki.
# Cara kerja program
## Class
![image](https://github.com/user-attachments/assets/ff20f6ba-c294-4dfc-8d8a-b8a0fc7b7077)

- Main.java adalah file utama untuk menjalankan program yang berisi tampilan untuk user.
- KaryaSeni.java sebagai parent class yang bersifat abstract agar tidak bisa dibuat sebagai objek.
- KaryaSeniGif.java dan KaryaSeniIlustrasi.java merupakan child class dari KaryaSeni.java.
- CRUDKaryaSeni.java adalah interface untuk method CRUD yang akan diterapkan oleh user.
- User.java adalah file yang berisi koleksi karya seni dan juga method CRUD.

## Property
- Main.java

  Pada Main.java hanya ada local property yang dibuat untuk menyimpan inputan.

  ![image](https://github.com/user-attachments/assets/b060a326-0509-4678-9b3a-9b4fedc6f045)

- User.java
  Terdapat property untuk akun user dan ada juga ArrayList koleksi untuk menyimpan koleksi karya seni yang dimiliki user
  
  ![image](https://github.com/user-attachments/assets/b5d9e093-d76e-44df-8883-c0b0d746a23c)

- KaryaSeni.java

  ![image](https://github.com/user-attachments/assets/647ed418-f94d-4838-be04-67eaf377aa0b)

- KaryaSeniIlustrasi.java

  ![image](https://github.com/user-attachments/assets/9eb9a30d-81c6-4228-861f-290f3182f49e)

- KaryaSeniGif.java

  ![image](https://github.com/user-attachments/assets/5978148c-c2ea-40fd-b3fa-b6c18c13873d)

## Method

# Output Program
## Menu Utama
![image](https://github.com/user-attachments/assets/db0c7cff-40bf-4d59-8aa4-1424dadaf5ec)

Pada menu ini user dapat memilih beberapa pilihan yaitu: Tambah Karya Seni, Tampilkan Koleksi, Hapus Karya Seni, Cari Karya Seni, dan keluar.
### Pilih Tambah Karya Seni
![image](https://github.com/user-attachments/assets/60337130-dfbc-4494-ae1c-996912f40031)

Ini adalah tampilan jika kita ingin menambahkan suatu karya seni ke dalam koleksi, kita akan diminta untuk memberikan judul karya, artis, dan tahun pembuatannya.

### Pilih Tampilkan Koleksi
![image](https://github.com/user-attachments/assets/2f5860b2-83af-46ce-85cf-42c7606ecc5a)

Ini adalah tampilan jika kita ingin menampilkan koleksi yang kita punya.

### Pilih Hapus Karya Seni
![image](https://github.com/user-attachments/assets/5646ceb6-ee69-48a6-bd0c-d28f40d0c4f6)

Ini adalah tampilan jika kita ingin menghapus Karya Seni pada koleksi kita, kita akan diminta untuk memasukkan Judul Karya Seni yang ingin dihapus.

### Pilih Edit Karya Seni
![image](https://github.com/user-attachments/assets/66e1b791-714d-4069-b7a7-acadf9235633)

Ini adalah tampilan jika kita ingin mengedit data dari Karya Seni yang ada pada koleksi kita, kita akan diminta untuk memasukkan judul Karya Seni yang ingin diubah, lalu Memasukkan judul, nama artis, tahun yang ingin kita ubah.

### Pilih Keluar
![image](https://github.com/user-attachments/assets/774eec1d-64ff-46e4-9aa7-325eb89a27f7)

Ini adalah tampilan jika kita memilih untuk keluar, maka kita akan keluar dari program dan program berhenti.



