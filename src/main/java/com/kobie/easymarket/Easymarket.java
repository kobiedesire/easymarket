/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kobie.easymarket;

import com.kobie.vue.InterfaceConnexion;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author kobie
 */
public class Easymarket {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        InterfaceConnexion ic = new InterfaceConnexion();
        ic.setIconImage(new ImageIcon("/home/kobie/NetBeansProjects/easymarket/src/main/resources/images/iconapp.png").getImage());
        ic.setVisible(true);
        //ic.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
