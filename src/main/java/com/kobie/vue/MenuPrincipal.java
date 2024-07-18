/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kobie.vue;

/**
 *
 * @author kobie
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneauDeBase = new javax.swing.JPanel();
        panneauMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_magasin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panneauEntete = new javax.swing.JPanel();
        btn_moncompte = new javax.swing.JButton();
        btn_deconnexion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panneauBureau = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Easy Market - Tableau de bord principal");
        setBackground(new java.awt.Color(255, 255, 255));

        panneauDeBase.setBackground(new java.awt.Color(255, 255, 255));
        panneauDeBase.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        panneauMenu.setBackground(new java.awt.Color(51, 0, 204));
        panneauMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        panneauMenu.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("MathJax_Fraktur", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu ");

        btn_magasin.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btn_magasin.setText("Magasin");
        btn_magasin.setBorder(null);
        btn_magasin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_magasinActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton2.setText("Catégories de produits");

        jButton3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton3.setText("Gestion des produits");

        jButton4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton4.setText("Mise à jour de stock");

        jButton5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton5.setText("Gestion des fournisseurs");

        jButton6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton6.setText("Ventes");

        jButton7.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton7.setText("Stattistiques");

        jButton8.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton8.setText("Administration");
        jButton8.setBorder(null);

        jButton9.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton9.setText("Gestion des clients");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Date");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendrier.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Heure ");

        javax.swing.GroupLayout panneauMenuLayout = new javax.swing.GroupLayout(panneauMenu);
        panneauMenu.setLayout(panneauMenuLayout);
        panneauMenuLayout.setHorizontalGroup(
            panneauMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneauMenuLayout.createSequentialGroup()
                .addGroup(panneauMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panneauMenuLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panneauMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_magasin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(panneauMenuLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panneauMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(panneauMenuLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panneauMenuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_magasin, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        panneauMenuLayout.setVerticalGroup(
            panneauMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneauMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panneauMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panneauMenuLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addGap(57, 57, 57)
                .addComponent(btn_magasin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        panneauMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_magasin, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        panneauEntete.setBackground(new java.awt.Color(255, 255, 255));
        panneauEntete.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        btn_moncompte.setBackground(new java.awt.Color(0, 153, 102));
        btn_moncompte.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btn_moncompte.setForeground(new java.awt.Color(255, 255, 255));
        btn_moncompte.setText("Mon compte");
        btn_moncompte.setBorder(null);
        btn_moncompte.setMaximumSize(new java.awt.Dimension(68, 22));
        btn_moncompte.setMinimumSize(new java.awt.Dimension(68, 22));
        btn_moncompte.setPreferredSize(new java.awt.Dimension(68, 22));

        btn_deconnexion.setBackground(new java.awt.Color(204, 0, 0));
        btn_deconnexion.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btn_deconnexion.setForeground(new java.awt.Color(255, 255, 255));
        btn_deconnexion.setText("Déconnexion");
        btn_deconnexion.setBorder(null);
        btn_deconnexion.setMaximumSize(new java.awt.Dimension(68, 22));
        btn_deconnexion.setMinimumSize(new java.awt.Dimension(68, 22));
        btn_deconnexion.setPreferredSize(new java.awt.Dimension(68, 22));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        javax.swing.GroupLayout panneauEnteteLayout = new javax.swing.GroupLayout(panneauEntete);
        panneauEntete.setLayout(panneauEnteteLayout);
        panneauEnteteLayout.setHorizontalGroup(
            panneauEnteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panneauEnteteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1078, Short.MAX_VALUE)
                .addGroup(panneauEnteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_deconnexion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_moncompte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        panneauEnteteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_deconnexion, btn_moncompte});

        panneauEnteteLayout.setVerticalGroup(
            panneauEnteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneauEnteteLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panneauEnteteLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btn_moncompte, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_deconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panneauEnteteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_deconnexion, btn_moncompte});

        panneauBureau.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panneauBureauLayout = new javax.swing.GroupLayout(panneauBureau);
        panneauBureau.setLayout(panneauBureauLayout);
        panneauBureauLayout.setHorizontalGroup(
            panneauBureauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panneauBureauLayout.setVerticalGroup(
            panneauBureauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panneauDeBaseLayout = new javax.swing.GroupLayout(panneauDeBase);
        panneauDeBase.setLayout(panneauDeBaseLayout);
        panneauDeBaseLayout.setHorizontalGroup(
            panneauDeBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneauDeBaseLayout.createSequentialGroup()
                .addComponent(panneauMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panneauDeBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panneauEntete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panneauDeBaseLayout.createSequentialGroup()
                        .addComponent(panneauBureau)
                        .addGap(3, 3, 3)))
                .addContainerGap())
        );
        panneauDeBaseLayout.setVerticalGroup(
            panneauDeBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneauDeBaseLayout.createSequentialGroup()
                .addComponent(panneauEntete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panneauBureau)
                .addContainerGap())
            .addComponent(panneauMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(103, 35));

        jMenu1.setText("Fichier");
        jMenu1.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jMenuItem1.setText("Mon compte");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jMenuItem2.setText("Déconnexion");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Aide");
        jMenu2.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jMenuItem4.setText("Documentation");
        jMenu2.add(jMenuItem4);

        jMenuItem3.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jMenuItem3.setText("A propos ");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panneauDeBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panneauDeBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_magasinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_magasinActionPerformed
       panneauBureau.removeAll();
       Magasin mag = new Magasin();
       panneauBureau.add(mag).setVisible(true);
    }//GEN-LAST:event_btn_magasinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_deconnexion;
    private javax.swing.JButton btn_magasin;
    private javax.swing.JButton btn_moncompte;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JDesktopPane panneauBureau;
    private javax.swing.JPanel panneauDeBase;
    private javax.swing.JPanel panneauEntete;
    private javax.swing.JPanel panneauMenu;
    // End of variables declaration//GEN-END:variables
}
