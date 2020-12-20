/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import harvestManagement.BerryManager;
import harvestManagement.HelperManager;
import javax.swing.JOptionPane;

/**
 *
 * @author maxpo
 */
public class HarvestManagerGUI extends javax.swing.JFrame {

    private HelperManager helperManager;
    private BerryManager berryManager;

    /**
     * Initializes helperManager and berryManager
     */
    public HarvestManagerGUI() {
        initComponents();
        helperManager = new HelperManager();
        berryManager = new BerryManager();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonStartHelperManager = new javax.swing.JButton();
        buttonStartBerryManager = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        menuBasiData = new javax.swing.JMenu();
        menuHelper = new javax.swing.JMenuItem();
        menuBerries = new javax.swing.JMenuItem();
        menuManage = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        menuHelp = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonStartHelperManager.setText("Start Helper Manager");
        buttonStartHelperManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartHelperManagerActionPerformed(evt);
            }
        });

        buttonStartBerryManager.setText("Start Berry Manager");
        buttonStartBerryManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartBerryManagerActionPerformed(evt);
            }
        });

        jLabel1.setText("Welcome to the Harvest Manager");

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit Programm");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        menuBasiData.setMnemonic('e');
        menuBasiData.setText("Basic Data");

        menuHelper.setMnemonic('y');
        menuHelper.setText("Manage Helpers");
        menuHelper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHelperActionPerformed(evt);
            }
        });
        menuBasiData.add(menuHelper);

        menuBerries.setMnemonic('p');
        menuBerries.setText("Manage Berries");
        menuBerries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBerriesActionPerformed(evt);
            }
        });
        menuBasiData.add(menuBerries);

        menuManage.setMnemonic('d');
        menuManage.setText("Manage...");
        menuManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageActionPerformed(evt);
            }
        });
        menuBasiData.add(menuManage);

        menuBar.add(menuBasiData);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        menuHelp.setMnemonic('c');
        menuHelp.setText("Help");
        menuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHelpActionPerformed(evt);
            }
        });
        helpMenu.add(menuHelp);

        menuAbout.setMnemonic('a');
        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        helpMenu.add(menuAbout);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(buttonStartHelperManager)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(buttonStartBerryManager)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonStartHelperManager, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonStartBerryManager, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Exits the programm through button in menu bar.
     *
     * @param evt
     */
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed
    /**
     * When selected in menu bar, opens JOptionPane with text given in Testat
     *
     * @param evt
     */
    private void menuManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageActionPerformed
        JOptionPane.showMessageDialog(this, "Not yet implemented", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_menuManageActionPerformed
    /**
     * Opens Helper Manager window through corresponding button
     *
     * @param evt
     */
    private void buttonStartHelperManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartHelperManagerActionPerformed
        TableDialogHelper1 tdh = new TableDialogHelper1(helperManager, berryManager);
        tdh.setVisible(true);
    }//GEN-LAST:event_buttonStartHelperManagerActionPerformed
    /**
     * Opens Berry Manager window through corresponding button
     *
     * @param evt
     */
    private void buttonStartBerryManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartBerryManagerActionPerformed
        TableDialogBerries1 tdb = new TableDialogBerries1(berryManager, helperManager);
        tdb.setVisible(true);
    }//GEN-LAST:event_buttonStartBerryManagerActionPerformed
    /**
     * Opens Helper Manager window through menu bar
     *
     * @param evt
     */
    private void menuHelperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelperActionPerformed
        TableDialogHelper1 tdh = new TableDialogHelper1(helperManager, berryManager);
        tdh.setVisible(true);
    }//GEN-LAST:event_menuHelperActionPerformed
    /**
     * Opens Berry Manager window through menu bar
     *
     * @param evt
     */
    private void menuBerriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBerriesActionPerformed
        TableDialogBerries1 tdb = new TableDialogBerries1(berryManager, helperManager);
        tdb.setVisible(true);
    }//GEN-LAST:event_menuBerriesActionPerformed
    /**
     * When selected in menu bar, opens help page (in this case JOptionPane
     * warning. Could be replaced)
     *
     * @param evt
     */
    private void menuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelpActionPerformed
        JOptionPane.showMessageDialog(this, "Say Hello to my little Help", "Panic", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_menuHelpActionPerformed
    /**
     * When selected in menu bar, opens about page (in this case JOptionPane
     * warning. Could be replaced)
     *
     * @param evt
     */
    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        JOptionPane.showMessageDialog(this, "Let's talk ABOUT", "About", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_menuAboutActionPerformed

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
            java.util.logging.Logger.getLogger(HarvestManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HarvestManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HarvestManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HarvestManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HarvestManagerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonStartBerryManager;
    private javax.swing.JButton buttonStartHelperManager;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBasiData;
    private javax.swing.JMenuItem menuBerries;
    private javax.swing.JMenuItem menuHelp;
    private javax.swing.JMenuItem menuHelper;
    private javax.swing.JMenuItem menuManage;
    // End of variables declaration//GEN-END:variables

}
