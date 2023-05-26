/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B;

/**
 *
 * @author Asrivo MKP
 */
import java.io.*;
public class pegunaPdam {
     public static void main (String[] args){
        BufferedReader data = new BufferedReader (new InputStreamReader(System.in));
    ClassPdam pengguna = new ClassPdam();
    pengguna.setNama("Asrivo Maha Kurnia Pitama");
    pengguna.setKodeNasabah("001");
    pengguna.setMeterBulanIni(20);
    pengguna.setMeterBulanLalu(15);
 
    String pilihan ="";
     System.out.println("**********PDAM**********");
        
        System.out.println("1. Golongan UMUM");
        System.out.println("2. GOlongan SILVER");
        System.out.println("3. Golongan GOLD");
        System.out.println("-----------------------------------------");
        System.out.print("Masukan Pilihan Anda : ");
         try{
                pilihan=data.readLine();
            }catch (IOException e){
                System.out.println("Error");
            }
         
         switch(Integer.parseInt(pilihan)){
         
             case 1: 
                 pengguna.setJenisPelanggan(1);
                 System.out.println("Golongan Anda            : UMUM" );
                 System.out.println("Harga /Meter :");
                 System.out.println("* 1 - 10   meter : Rp 5.000");
                 System.out.println("* 11 - 20  meter : Rp 10.000");
                 System.out.println("* >10      meter : Rp 10.000");
                 System.out.println("Nama                     : " + pengguna.getNama());
                 System.out.println("Kode Nasabah             : " + pengguna.getKodeNasabah());
                 System.out.println("Meter Bulan ini          : " + pengguna.getMeterBulanIni());
                 System.out.println("Meter Bulan Lalu         : " + pengguna.getMeterBulanLalu());
                 System.out.println("Total Tarif              : " + pengguna.getJenisPelanggan());
                 break;
                 
              case 2: 
                 pengguna.setJenisPelanggan(2);
                 
                 System.out.println("Golongan Anda            : SILVER" );
                 System.out.println("* 1 - 10   meter : Rp 4.000");
                 System.out.println("* 11 - 20  meter : Rp 8.000");
                 System.out.println("* >20      meter : Rp 10.000");
                 System.out.println("Nama                     : " + pengguna.getNama());
                 System.out.println("Kode Nasabah             : " + pengguna.getKodeNasabah());
                 System.out.println("Meter Bulan ini          : " + pengguna.getMeterBulanIni());
                 System.out.println("Meter Bulan Lalu         : " + pengguna.getMeterBulanLalu());
                 System.out.println("Total Tarif              : " + pengguna.getJenisPelanggan());
                 break;
                 
              case 3: 
                 pengguna.setJenisPelanggan(3);
                 
                 System.out.println("Golongan Anda            : GOLD" );
                 System.out.println("* 1 - 10   meter : Rp 2.000");
                 System.out.println("* 11 - 20  meter : Rp 3.000");
                 System.out.println("* >30      meter : Rp 30.000");
                 System.out.println("Nama                     : " + pengguna.getNama());
                 System.out.println("Kode Nasabah             : " + pengguna.getKodeNasabah());
                 System.out.println("Meter Bulan ini          : " + pengguna.getMeterBulanIni());
                 System.out.println("Meter Bulan Lalu         : " + pengguna.getMeterBulanLalu());
                 System.out.println("Total Tarif              : " + pengguna.getJenisPelanggan());
                 break;
                 
                 default:
                     System.out.println("Maaf, Pilihan tidak tersedia");
         }
  
    }
}
