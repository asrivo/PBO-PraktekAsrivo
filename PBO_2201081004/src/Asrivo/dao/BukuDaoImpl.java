/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asrivo.dao;

import Asrivo.model.Buku;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asrivo MKP
 */
public class BukuDaoImpl implements BukuDao{
      private List<Buku> data = new ArrayList<>();
    
        public BukuDaoImpl(){
            data.add(new Buku ("001","Buku Java","Pak Ervan","Politeknik Negeri Padang"));
        }
        
        public   void insert(Buku buku) {
           data.add(buku);
       }
       
        public   void update(int index, Buku buku){
            data.set(index, buku);
        }
        
        public   void delete(int index){
            data.remove(index);
        }
        
        public   Buku getBuku(int index){
            return data.get(index);
        }
        
        public   List <Buku>getAll(){
            return data;
        }
}
