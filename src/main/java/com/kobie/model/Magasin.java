/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kobie.model;

/**
 *
 * @author kobie
 */
public class Magasin {
    private int idM;
    private String nomM;
    private String descriptionM;
    
       // Constructeurs, getters et setters

    public int getIdM() {
        return idM;
    }

    public String getNomM() {
        return nomM;
    }

    public String getDescriptionM() {
        return descriptionM;
    }

    public void setIdM(int idM) {
        this.idM = idM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public void setDescriptionM(String descriptionM) {
        this.descriptionM = descriptionM;
    }

    public Magasin(String nomM, String descriptionM) {
        this.nomM = nomM;
        this.descriptionM = descriptionM;
    }

   
}
