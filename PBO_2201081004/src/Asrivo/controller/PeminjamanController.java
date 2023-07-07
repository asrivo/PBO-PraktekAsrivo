/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asrivo.controller;
import Asrivo.dao.*;
import Asrivo.model.*;
import Asrivo.view.*;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Asrivo MKP
 */
public class PeminjamanController {
    FormPeminjaman view;
    Peminjaman peminjaman;
    PeminjamanDao dao;
    AnggotaDao anggotaDao;
    BukuDao bukuDao;
    
    public PeminjamanController(FormPeminjaman view) {
        this.view = view;
        dao = new PeminjamanDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
    }
    
    public void clearForm(){
        view.getTxtTanggalPinjam().setText("");
        view.getTxtTanggalKembali().setText("");
        
    }
    
    public void isicombo(){
    view.getCboAnggota().removeAllItems();
    List<Anggota>ListAnggota = anggotaDao.getAll();
    for (Anggota anggota : ListAnggota) {
        view.getCboAnggota().addItem(anggota.getKodeAnggota());
    }
         
    view.getCboBuku().removeAllItems();
    List<Buku> ListBuku = bukuDao.getAll();
    for (Buku buku : ListBuku) {
        view.getCboBuku().addItem(buku.getKodeBuku());
    }
    }
    
    public void tampil() throws ParseException {
        DefaultTableModel tabelModel = (DefaultTableModel) view.getTabelPeminjaman().getModel();
        tabelModel.setRowCount(0);
        List<Peminjaman> list = dao.getAll();
        for (Peminjaman a : list) {
            Object[] row = {
                a.getKodeanggota(),
                a.getKodebuku(),
                a.getTglpinjam(),
                a.getTglkembali(),
                a.getSelisih()     
            };
            tabelModel.addRow(row);
        }
    }
    
    public void insert(){
        peminjaman = new Peminjaman();
        peminjaman.setKodeanggota(view.getCboAnggota().getSelectedItem().toString());
        peminjaman.setKodebuku(view.getCboBuku().getSelectedItem().toString());
        peminjaman.setTglpinjam(view.getTxtTanggalPinjam().getText());
        peminjaman.setTglkembali(view.getTxtTanggalKembali().getText());
        dao.insert(peminjaman);
        JOptionPane.showMessageDialog(view,"Entri Data OK");
    }
    
    public void getPeminjaman(){
        int index = view.getTabelPeminjaman().getSelectedRow();
        peminjaman = dao.getPeminjaman(index);
        view.getCboAnggota().setSelectedItem(peminjaman.getKodeanggota());
        view.getCboBuku().setSelectedItem(peminjaman.getKodebuku());
        view.getTxtTanggalPinjam().setText(peminjaman.getTglpinjam());
        view.getTxtTanggalKembali().setText(peminjaman.getTglkembali());
    }
    
     public void update(){
        int index = view.getTabelPeminjaman().getSelectedRow();
        peminjaman = new Peminjaman();
        peminjaman.setKodeanggota(view.getCboAnggota().getSelectedItem().toString());
        peminjaman.setKodebuku(view.getCboBuku().getSelectedItem().toString());
        peminjaman.setTglpinjam(view.getTxtTanggalPinjam().getText());
        peminjaman.setTglkembali(view.getTxtTanggalKembali().getText());
        dao.update(index,peminjaman);
        JOptionPane.showMessageDialog(view,"Update Data OK");
    }
     
     public void delete(){
        int index = view.getTabelPeminjaman().getSelectedRow();
        dao.delete(index);
        JOptionPane.showMessageDialog(view,"Delete Data OK");
       
     }
}
