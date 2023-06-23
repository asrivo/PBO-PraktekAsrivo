/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asrivo.model;

/**
 *
 * @author Asrivo MKP
 */
public class Buku {
    private String kodebuku;
    private String judulbuku;
    private String pengarang;
    private String penerbit;
    private String tahunterbit;

    public Buku(String kodebuku, String judulbuku, String pengarang, String penerbit, String tahunterbit) {
        this.kodebuku = kodebuku;
        this.judulbuku = judulbuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunterbit = tahunterbit;
    }

    public Buku() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public String getJudulbuku() {
        return judulbuku;
    }

    public void setJudulbuku(String judulbuku) {
        this.judulbuku = judulbuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahunterbit() {
        return tahunterbit;
    }

    public void setTahunterbit(String tahunterbit) {
        this.tahunterbit = tahunterbit;
    }

    public Object getKodeBuku() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Object getJudulBuku() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Object getTahunTerbit() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setKodeBuku(String text) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setJudulBuku(String text) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    
}
