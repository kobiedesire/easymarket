/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kobie.props;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

/**
 *
 * @author kobie
 */
public class PropsTableau implements TableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel headerLabel = new JLabel(value.toString());
        headerLabel.setOpaque(true);
        headerLabel.setBackground(Color.BLACK); 
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Liberation sans", Font.BOLD, 16)); 
        headerLabel.setHorizontalAlignment(SwingConstants.LEFT);
        return headerLabel;
    }
    
}
