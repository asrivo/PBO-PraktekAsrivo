/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B;

/**
 *
 * @author Asrivo MKP
 */
public class ClassPdam {
    private String kodePembayaran;
    private String kodeNasabah;
    private String nama;
    private double jenisPelanggan;
    private double meterBulanIni;
    private double meterBulanLalu;
    private double tariftotal;
    
    public String getKodePembayaran (){
        return kodePembayaran;
    }
    public String getKodeNasabah (){
        return kodeNasabah;
    }
    public String getNama (){
        return nama;
    }
    public double getJenisPelanggan (){
        double meterpakai = meterBulanIni - meterBulanLalu;
        if (jenisPelanggan == 1){
            if (meterpakai <= 10){
                jenisPelanggan = meterpakai * 10000;
            }else if (meterpakai <= 20){
                jenisPelanggan = ((meterpakai-10) * 10000) + 50000;
            }else{
                jenisPelanggan = ((meterpakai-20) * 20000)+((meterpakai-10) * 10000) + 50000;
            }
        }else if (jenisPelanggan == 2){
            if (meterpakai <= 10){
                jenisPelanggan = meterpakai * 20000;
            }else if (meterpakai <= 20){
                jenisPelanggan = ((meterpakai-10) * 8000) + 40000;
            }else{
                jenisPelanggan = ((meterpakai-20) * 10000)+((meterpakai-10) * 8000) + 40000;
            }
        }
        else
        {
           if (meterpakai <= 10){
                jenisPelanggan = meterpakai * 30000;
            }else if (meterpakai <= 20){
                jenisPelanggan = ((meterpakai-10) * 3000) + 10000;
            }else{
                jenisPelanggan = ((meterpakai-20) * 5000)+((meterpakai-10) * 3000) + 10000;
            }
        
        }
        return jenisPelanggan;
    }
    public double getMeterBulanIni (){
        return meterBulanIni;
    }
    public double getMeterBulanLalu (){
        return meterBulanLalu;
    }
    public double getTotalPembayaran (){
        
        return tariftotal;
    }
    
    public void setKodePembayaran(String kodePembayaran){
        this.kodePembayaran = kodePembayaran;
    }
    
    public void setKodeNasabah (String kodePelanggan){
        this.kodeNasabah = kodePelanggan;
    }
    public void setNama(String namaPelanggan){
        this.nama = namaPelanggan;
    }
    public void setJenisPelanggan (double jenisPelanggan){
        this.jenisPelanggan = jenisPelanggan;
    }
    public void setMeterBulanIni(double meterBulanIni){
        this.meterBulanIni = meterBulanIni;
    }
    public void setMeterBulanLalu(double meterBulanLalu){
        this.meterBulanLalu = meterBulanLalu;
    }
}
