/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.RafiKh.latihanmvcjdbc.main;

import edu.RafiKh.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.RafiKh.latihanmvcjdbc.entity.Pelanggan;
import edu.RafiKh.latihanmvcjdbc.error.PelangganException;
import edu.RafiKh.latihanmvcjdbc.service.PelangganDao;
import edu.RafiKh.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class LatihanMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable(){ 
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
