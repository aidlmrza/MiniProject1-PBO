/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyaSeni;

/**
 *
 * @author maidi
 */
public class KaryaSeni {
    
    public String judul;
    public String artis;
    public String tahun;
    
    public KaryaSeni(String judul, String artis, String tahun) {
        this.judul = judul;
        this.artis = artis;
        this.tahun = tahun;
    }

    
    public void tampilkanDetail() {
        System.out.println("Judul: " + judul);
        System.out.println("Artis: " + artis);
        System.out.println("Tahun: RP." + tahun);
    }

    
    public void editKaryaSeni(String judul, String artis, String tahun) {
        this.judul = judul;
        this.artis = artis;
        this.tahun = tahun;
        System.out.println("======================================");
        System.out.println(" Data karya seni berhasil diperbarui!");
        System.out.println("======================================");
    }


    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getArtis() {
        return artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
}

