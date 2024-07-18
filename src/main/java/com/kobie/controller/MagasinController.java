/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kobie.controller;

import com.kobie.bd.connexionBD;
import com.kobie.model.Magasin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import com.kobie.vue.InterfaceMagasin;
import javax.swing.JOptionPane;

/**
 *
 * @author kobie
 */
public class MagasinController {

    private static boolean res, yn;
    private static String tab[][];
    /*ENREGISTRER UN MAGASIN*/
    private static final String queryInsert = "INSERT INTO magasin (nomMagasin, descriptionMagasin) VALUES (?, ?)";

    public static void saveMagasin(Magasin magasin) {
        try (Connection connection = connexionBD.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(queryInsert)) {
            preparedStatement.setString(1, magasin.getNomM());
            preparedStatement.setString(2, magasin.getDescriptionM());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*MODIFIER UN MAGASIN*/
    private static int idM;

    public static void updateMagasin(Magasin magasin) {
        idM = Integer.parseInt(InterfaceMagasin.tableau_magasin.getValueAt(numligne, 0).toString());   //recuperer l'id du magasin 
        
        String queryUpdate = "UPDATE magasin SET  nomMagasin = ?, descriptionMagasin = ? WHERE idMagasin = ?";
        try (Connection connection = connexionBD.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(queryUpdate)) {
            preparedStatement.setString(1, magasin.getNomM());
            preparedStatement.setString(2, magasin.getDescriptionM());
            preparedStatement.setInt(3, idM);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*SUPPRIMER UN MAGASIN*/
    public static void deleteMagasin(Magasin magasin) {
        idM = Integer.parseInt(InterfaceMagasin.tableau_magasin.getValueAt(numligne, 0).toString());   //recuperer l'id du magasin    
        String queryDelete = "DELETE FROM magasin WHERE idMagasin = ?";
        try (Connection connection = connexionBD.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(queryDelete)) {
            preparedStatement.setInt(1, idM);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*LISTER TOUS LES MAGASINS*/
    private static final String querySelect = "SELECT * FROM magasin";

    public static void listAll() {
        try (Connection connection = connexionBD.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(querySelect)) {
            ResultSet res = preparedStatement.executeQuery();
            res.last();
            tab = new String[res.getRow()][3];
            res.beforeFirst();
            yn = false;
            DefaultTableModel tablemodel = (DefaultTableModel) InterfaceMagasin.tableau_magasin.getModel();
            while (InterfaceMagasin.tableau_magasin.getRowCount() > 0) {
                tablemodel.removeRow(0);
            }
            for (int k = 0; k < tab.length; k++) {
                res.next();
                Object[] objects = new Object[3];
                objects[0] = res.getString("idMagasin");
                objects[1] = res.getString("nomMagasin");
                objects[2] = res.getString("descriptionMagasin");
                tablemodel.addRow(objects);
                tab[k][0] = res.getString("idMagasin");
                tab[k][1] = res.getString("nomMagasin");
                tab[k][2] = res.getString("descriptionMagasin");
                yn = true;
            }
            res.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*AFFICHER UN MAGASIN POUR MODIFICATION*/
    public static int nbreligne, numligne, idMag;
    private static final String querySelectOneMagasin = "SELECT * FROM magasin where idMagasin = ? ";

    public static void displayMagasin() {

        nbreligne = InterfaceMagasin.tableau_magasin.getSelectedRowCount();//nombre de ligne selectionnÃ©es
        numligne = InterfaceMagasin.tableau_magasin.getSelectedRow();//recuperer le le numero de la ligne
        if (nbreligne != 1) {
            InterfaceMagasin.nomMag.setText("");
            InterfaceMagasin.descriptionMag.setText("");
            JOptionPane.showMessageDialog(null, " Sélectionnez un magasin");

            System.out.println(nbreligne);
        } else {
            idMag = Integer.parseInt(InterfaceMagasin.tableau_magasin.getValueAt(numligne, 0).toString());   //recuperer l'id du magasin        
        }
        try (Connection connection = connexionBD.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(querySelectOneMagasin)) {
            preparedStatement.setInt(1, idMag);
            ResultSet res = preparedStatement.executeQuery();
            if (res.next()) {
                InterfaceMagasin.nomMag.setText(res.getString("nomMagasin"));
                InterfaceMagasin.descriptionMag.setText(res.getString("descriptionMagasin"));
            }
            res.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
