/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import harvestManagement.Berry;
import harvestManagement.BerryManager;
import harvestManagement.HelperManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author maxpo
 */
public class TableDialogBerries1 extends javax.swing.JFrame implements TableModelListener {

    private BerryManager berryManager;
    private HelperManager helperManager;

    /**
     * Creates new form TableDialogBerries1 and executes addRowToJTable method.
     * Gets the table model and adds listener.
     */
    public TableDialogBerries1(BerryManager berryManager, HelperManager helperManager) {
        initComponents();
        this.berryManager = berryManager;
        this.helperManager = helperManager;
        addRowToJTable();
        tableBerries.getModel().addTableModelListener(this);
    }

    /**
     * Fills and adds rows with values from berry class via getter. Executes
     * method addBerry in Class BerryManager. Returns print out of all Berries.
     *
     * @param berry
     */
    public void addBerry(Berry berry) {
        DefaultTableModel modelBerry = (DefaultTableModel) tableBerries.getModel();

        Object rowData[] = new Object[5];

        rowData[0] = berry.getBerryId();
        rowData[1] = berry.getSpecies();
        rowData[2] = berry.getWeight();
        rowData[3] = berry.getColor();
        rowData[4] = berry.getTaste();
        modelBerry.addRow(rowData);

        berryManager.addBerry(berry);
        System.out.println(berryManager.getAllBerries().toString());
    }

    /**
     * Detects changes in table. If values are changed/beeing updated, new
     * values are set, transfered to class Berry Manager and printed out for
     * manual control.
     *
     * @param e
     */
    public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int column = e.getColumn();
        TableModel model = (TableModel) e.getSource();
        if (column < 0) {
            return;
        }
        Berry berry = null;

        for (int i = 0; i < berryManager.getAllBerries().size(); i++) {
            if (berryManager.getAllBerries().get(i).getBerryId() == Integer.parseInt(model.getValueAt(row, 0).toString())) { //Control if BerryId equals value of column 0 (id column)
                berry = berryManager.getAllBerries().get(i);
            }
        }

        if (berry != null) { //Detect if values have beed changed
            berry.setSpecies(model.getValueAt(row, 1).toString());
            berry.setWeight(Double.valueOf(model.getValueAt(row, 2).toString()));
            berry.setColor(model.getValueAt(row, 3).toString());
            berry.setTaste(model.getValueAt(row, 4).toString());
            berryManager.updateBerry(Integer.parseInt(model.getValueAt(row, 0).toString()), berry); //new values to class BerryManager
            System.out.println(berryManager.getAllBerries().toString());
        }

    }

    /**
     * Imports data from class BerryManager through getAllBerries method. Adds
     * data in row in modelBerry.
     */
    public void addRowToJTable() {
        DefaultTableModel modelBerry = (DefaultTableModel) tableBerries.getModel();

        for (Berry berry : berryManager.getAllBerries()) {

            Object rowData[] = new Object[5];
            rowData[0] = berry.getBerryId();
            rowData[1] = berry.getSpecies();
            rowData[2] = berry.getWeight();
            rowData[3] = berry.getColor();
            rowData[4] = berry.getTaste();

            modelBerry.addRow(rowData);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBerries = new javax.swing.JTable();
        buttonDelete = new javax.swing.JButton();
        buttonNew = new javax.swing.JButton();
        buttonMainMenu = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        menuBasicData = new javax.swing.JMenu();
        menuHelper = new javax.swing.JMenuItem();
        menuBerries = new javax.swing.JMenuItem();
        menuManage = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        menuHelp = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Welcome to the Berry Manager");

        tableBerries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BerryID", "Species", "Weight", "Color", "Taste"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBerries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBerriesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableBerries);

        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonNew.setText("New");
        buttonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewActionPerformed(evt);
            }
        });

        buttonMainMenu.setText("Back to main menu");
        buttonMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMainMenuActionPerformed(evt);
            }
        });

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

        menuBasicData.setMnemonic('e');
        menuBasicData.setText("Basic Data");

        menuHelper.setMnemonic('y');
        menuHelper.setText("Manage Helpers");
        menuHelper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHelperActionPerformed(evt);
            }
        });
        menuBasicData.add(menuHelper);

        menuBerries.setMnemonic('p');
        menuBerries.setText("Manage Berries");
        menuBerries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBerriesActionPerformed(evt);
            }
        });
        menuBasicData.add(menuBerries);

        menuManage.setMnemonic('d');
        menuManage.setText("Manage...");
        menuManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageActionPerformed(evt);
            }
        });
        menuBasicData.add(menuManage);

        menuBar.add(menuBasicData);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonMainMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(218, Short.MAX_VALUE))))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDelete)
                    .addComponent(buttonNew)
                    .addComponent(buttonMainMenu))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit programm if menu bar/exit programm is beeing selected
     *
     * @param evt
     */
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    /**
     * When table is selected by mouse click,...
     *
     * @param evt
     */
    private void tableBerriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBerriesMouseClicked
    }//GEN-LAST:event_tableBerriesMouseClicked

    /**
     * Selected row of table will be deleted, after confirmation of JOptionPane
     *
     * @param evt
     */
    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        int a = JOptionPane.showOptionDialog(this, "Are you sure you want to delete this Berry?", "Please confirm!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (a == 0) {
            DefaultTableModel modelBerries = (DefaultTableModel) tableBerries.getModel();
            int i = tableBerries.getSelectedRow();
            berryManager.deleteBerry(Integer.parseInt(modelBerries.getValueAt(i, 0).toString()));
            modelBerries.removeRow(i);
            System.out.println(berryManager.getAllBerries().toString());
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    /**
     * When BerryManager in menu bar is beeing selected JOptionPane opens warnig
     *
     * @param evt
     */
    private void menuBerriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBerriesActionPerformed
        JOptionPane.showMessageDialog(this, "You are already in 'Berry Manager'", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_menuBerriesActionPerformed

    /**
     * Changes to HelperManager when selected in menu bar
     *
     * @param evt
     */
    private void menuHelperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelperActionPerformed
        setVisible(false);
        TableDialogHelper1 tdh = new TableDialogHelper1(helperManager, berryManager);
        tdh.setVisible(true);
    }//GEN-LAST:event_menuHelperActionPerformed

    /**
     * Closes window, back to main menu
     *
     * @param evt
     */
    private void buttonMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMainMenuActionPerformed
        setVisible(false);
    }//GEN-LAST:event_buttonMainMenuActionPerformed

    /**
     * When selected in menu bar, opens JOptionPane with text given in Testat
     *
     * @param evt
     */
    private void menuManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageActionPerformed
        JOptionPane.showMessageDialog(this, "Not yet implemented", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_menuManageActionPerformed

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
     * When selected in menu bar, opens new window to enter new data
     *
     * @param evt
     */
    private void buttonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewActionPerformed
        FormNewBerry fnb = new FormNewBerry(this);
        fnb.setVisible(true);
    }//GEN-LAST:event_buttonNewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonMainMenu;
    private javax.swing.JButton buttonNew;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBasicData;
    private javax.swing.JMenuItem menuBerries;
    private javax.swing.JMenuItem menuHelp;
    private javax.swing.JMenuItem menuHelper;
    private javax.swing.JMenuItem menuManage;
    private javax.swing.JTable tableBerries;
    // End of variables declaration//GEN-END:variables

}
