/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asrivo.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Asrivo.dao.BukuDaoImpl;
import Asrivo.dao.BukuDao;
import Asrivo.model.Buku;
import Asrivo.view.FormBuku;

/**
 *
 * @author Asrivo MKP
 */
public class BukuController {
    FormBuku view;
    Buku buku;
    BukuDao dao;
    

    public BukuController(FormBuku view) {
        this.view = view ;
        dao = new BukuDaoImpl();
    }
    
    public void clear(){
        view.getTxtKodeBuku().setText("");
        view.getTxtJudulBuku().setText("");
        view.getTxtPengarang().setText("");
        view.getTxtPenerbit().setText("");
        view.getTxtTahunTerbit().setText("");
    }
    
    public void insert(){
        try {
            buku = new Buku();
            buku.setKodebuku(view.getTxtKodeBuku().getText());
            buku.setJudulbuku(view.getTxtJudulBuku().getText());
            buku.setPengarang(view.getTxtPengarang().getText());
            buku.setPenerbit(view.getTxtPenerbit().getText());
            buku.setTahunterbit(view.getTxtTahunTerbit().getText());
            dao.insert(buku);
            JOptionPane.showMessageDialog(view, "Successful Insert");
        } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void search(){
        try {
            String kodebuku = view.getTxtKodeBuku().getText();
            buku = dao.getBuku(kodebuku);
            if(buku != null){
                view.getTxtJudulBuku().setText(buku.getJudulbuku());
                view.getTxtPenerbit().setText(buku.getPenerbit());
                view.getTxtPengarang().setText(buku.getPengarang());
                view.getTxtTahunTerbit().setText(buku.getTahunterbit());
                
            }else{
                JOptionPane.showMessageDialog(view, "Data Not Found");
            }
        } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            buku = new Buku();
            buku.setKodebuku(view.getTxtKodeBuku().getText());
            buku.setJudulbuku(view.getTxtJudulBuku().getText());
            buku.setPenerbit(view.getTxtPenerbit().getText());
            buku.setPengarang(view.getTxtPengarang().getText());
            buku.setTahunterbit(view.getTxtTahunTerbit().getText());
            dao.update(buku);
            JOptionPane.showMessageDialog(view, "Successful Update");
        } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
    try {
        int pil = JOptionPane.showConfirmDialog(view, "Apakah Yakin Dihapus?");
            if(pil == 0){
                dao.delete(buku);
                JOptionPane.showMessageDialog(view, "Successful Delete");
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void viewTable(){
        try {
            DefaultTableModel tabelModel = (DefaultTableModel) view.getTabelBuku().getModel();
            tabelModel.setRowCount(0);
            List<Buku> bukuList = dao.getAll();
            for(Buku buku : bukuList){
                Object[] data = {
                buku.getKodebuku(),
                buku.getJudulbuku(),
                buku.getPenerbit(),
                buku.getPengarang(),
                buku.getTahunterbit()
                };
                    tabelModel.addRow(data);
                }
            } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
}
