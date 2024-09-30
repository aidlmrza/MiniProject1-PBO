/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import java.util.ArrayList;
import java.util.Scanner;
import karyaSeni.KaryaSeni;

/**
 *
 * @author maidi
 */
public class User {
    public String nama;
    public String email;
    public static ArrayList<KaryaSeni> koleksi = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    
    
    public User(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public static void tambahKaryaSeni() {
        System.out.println("===============================");
        System.out.print(" Masukkan judul karya seni: ");
        String judul = scanner.nextLine();
        System.out.print(" Masukkan nama artis: ");
        String artis = scanner.nextLine();
        System.out.print(" Masukkan tahun: ");
        String tahun  = scanner.nextLine();

        KaryaSeni karyaBaru = new KaryaSeni(judul, artis, tahun);
        koleksi.add(karyaBaru);
        System.out.println("==================================");
        System.out.println(" Karya seni berhasil ditambahkan!");
        System.out.println("==================================");
    }

    
    public static void tampilkanKaryaSeni() {
        if (koleksi.isEmpty()) {
            System.out.println("=====================================");
            System.out.println(" Tidak ada karya seni dalam koleksi.");
            System.out.println("=====================================");
        } else {
            for (KaryaSeni karya : koleksi) {
                System.out.println("========================================");
                karya.tampilkanDetail();
            }
        }
    }

    
    public static void hapusKaryaSeni() {
        System.out.println("===============================================");
        System.out.print(" Masukkan judul karya seni yang ingin dihapus: ");
        String judul = scanner.nextLine();
        boolean ditemukan = false;

        for (KaryaSeni karya : koleksi) {
            if (karya.getJudul().equalsIgnoreCase(judul)) {
                koleksi.remove(karya);
                System.out.println("==============================");
                System.out.println(" Karya seni berhasil dihapus.");
                System.out.println("==============================");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("=============================");
            System.out.println(" Karya seni tidak ditemukan.");
            System.out.println("=============================");
        }
    }

    
    public static void editKaryaSeni() {
        System.out.println("==============================================");
        System.out.print(" Masukkan judul karya seni yang ingin diedit: ");
        String judul = scanner.nextLine();
        boolean ditemukan = false;

        for (KaryaSeni karya : koleksi) {
            if (karya.getJudul().equalsIgnoreCase(judul)) {
                System.out.print("Masukkan judul baru: ");
                String judulBaru = scanner.nextLine();
                System.out.print("Masukkan nama artis baru: ");
                String artisBaru = scanner.nextLine();
                System.out.print("Masukkan tahun baru: ");
                String tahunBaru = scanner.nextLine();

                karya.editKaryaSeni(judulBaru, artisBaru, tahunBaru);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("=============================");
            System.out.println(" Karya seni tidak ditemukan.");
            System.out.println("=============================");
        }
    }


    public static void cariKaryaSeni() {
        System.out.println("==============================================");
        System.out.print(" Masukkan judul karya seni yang ingin dicari: ");
        String judul = scanner.nextLine();
        boolean ditemukan = false;

        for (KaryaSeni karya : koleksi) {
            if (karya.getJudul().equalsIgnoreCase(judul)) {
                System.out.println("=======================");
                System.out.println(" Karya seni ditemukan: ");
                karya.tampilkanDetail();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Karya seni tidak ditemukan.");
        }
    }
    
    
    public static void main(String[] args) {
        int pilihan;
        User user = new User("Amir","amir@gmail.com");
        
        do {
            System.out.println("================================================================");
            System.out.println(" Halo, " + user.nama + " Selamat Datang di Koleksi Karya Seni Digital");
            System.out.println("================================================================");
            System.out.println(" 1. Tambah Karya Seni");
            System.out.println(" 2. Tampilkan Koleksi");
            System.out.println(" 3. Hapus Karya Seni");
            System.out.println(" 4. Edit Karya Seni");
            System.out.println(" 5. Cari Karya Seni");
            System.out.println(" 0. Keluar");
            System.out.print(" Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahKaryaSeni();
                    break;
                case 2:
                    tampilkanKaryaSeni();
                    break;
                case 3:
                    hapusKaryaSeni();
                    break;
                case 4:
                    editKaryaSeni();
                    break;
                case 5:
                    cariKaryaSeni();
                    break;
                case 0:
                    System.out.println("=================================");
                    System.out.println(" Terima kasih, program berhenti.");
                    System.out.println("=================================");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
                    break;
            }
        } while (pilihan != 0);
    }
}
