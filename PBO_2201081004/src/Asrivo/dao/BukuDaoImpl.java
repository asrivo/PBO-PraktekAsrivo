/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asrivo.dao;

import java.util.ArrayList;
import java.util.List;
import Asrivo.model.Buku;

/**
 *
 * @author Asrivo MKP
 */
public class BukuDaoImpl implements BukuDao {
    private List<Buku> data = new ArrayList<>();
    
    public BukuDaoImpl(){
        data.add(new Buku("A001", "Java Programing", "Asrivo", "Gramedia", "2023"));
        data.add(new Buku("A002", "Web Dasar", "Aci", "Gramedia", "2024"));
        data.add(new Buku("A003", "Kotlin", "Asrivo MKP", "Erlangga", "2025"));
    }
    
    public void insert(Buku buku) {
        data.add(buku);
    }
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Buku getAnggota(int index){
        return data.get(index);
    }
    public List<Buku> getAll(){
        return data;
    }

    @Override
    public void update(Buku buku) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Buku buku) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Buku getBuku(String kode) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
