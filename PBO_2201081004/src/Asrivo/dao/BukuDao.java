/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Asrivo.dao;

import Asrivo.model.Buku;
import java.util.List;

/**
 *
 * @author Asrivo MKP
 */
public interface BukuDao {
        void insert (Buku buku);
        void update(int index, Buku buku);
        void delete(int index);
        Buku getBuku(int index);
        List <Buku>getAll();
}
