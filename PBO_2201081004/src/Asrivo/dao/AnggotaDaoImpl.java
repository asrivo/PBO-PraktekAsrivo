/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asrivo.dao;
import java.util.List;
import Asrivo.model.Anggota;
import java.util.ArrayList;

/**
 *
 * @author Asrivo MKP
 */
public class AnggotaDaoImpl implements AnggotaDao{
    private final List<Anggota> data = new ArrayList<>();
    
        public AnggotaDaoImpl(){
            data.add(new Anggota ("A001","Asrivo","Sijunjung","P"));
        }
        
        public   void insert(Anggota anggota) {
           data.add(anggota);
       }
       
        public   void update(int index, Anggota anggota){
            data.set(index, anggota);
        }
        
        public   void delete(int index){
            data.remove(index);
        }
        
        public   Anggota getAnggota(int index){
            return data.get(index);
        }
        
        public   List <Anggota>getAll(){
            return data;
        }
}
