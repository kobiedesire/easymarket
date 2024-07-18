/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kobie.controller;
import com.kobie.bd.connexionBD;
import com.kobie.model.Magasin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kobie
 */
public class MagasinController {

    private static final String query = "INSERT INTO magasin (nomMagasin, descriptionMagasin) VALUES (?, ?)";

    public static void saveMagasin(Magasin magasin) {
        try (Connection connection = connexionBD.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, magasin.getNomM());
            preparedStatement.setString(2, magasin.getDescriptionM());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
        }
    }

}
