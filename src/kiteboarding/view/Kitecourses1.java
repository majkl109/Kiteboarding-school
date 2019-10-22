package kiteboarding.view;

import kiteboarding.controller.ProcessingKitecourse;
import kiteboarding.model.Kitecourse;
import kiteboarding.helper.KiteboardingException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import kiteboarding.model.Kitecourse;




public class Kitecourses1 extends javax.swing.JFrame {
    
    
    private static DefaultComboBoxModel<Kitecourse> modelKitecourse;
    private ProcessingKitecourse processingEntity;
    private Kitecourse kitecourse;
    
    
    
 
    public Kitecourses1(){
         initComponents();
         processingEntity = new ProcessingKitecourse();
      
         
        DefaultComboBoxModel<Kitecourse> mkc = new DefaultComboBoxModel<>();
        Kitecourse kc = new Kitecourse();
        kc.setId(0);
        kc.setKitecoursetype("Select kitecourse");
        mkc.addElement(kc);
        new ProcessingKitecourse().getListed().forEach((c) -> {
            mkc.addElement(c);
        });
        cmbKitecourses.setModel(mkc);
         
        loadData();
    }
    
        
    private void loadData() {
        DefaultListModel<Kitecourse> m = new DefaultListModel<>();
        processingEntity.getListed().forEach((g) -> {
            m.addElement(g);
        });
        listEntities.setModel(m);
        
   
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kitecourse = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        cmbKitecourse = new javax.swing.JComboBox();
        btnAdd = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listEntites = new javax.swing.JList<Kitecourse>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Kitecourse.setText("Kitecourse");

        jLabel3.setText("Duration");

        jLabel4.setText("Price");

        jLabel5.setText("KITECOURSE");

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnChange.setText("CHANGE");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        listEntites.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listEntitesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listEntites);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Kitecourse)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDuration, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(txtPrice))
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbKitecourse, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChange)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Kitecourse)
                            .addComponent(cmbKitecourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnChange)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listEntitesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listEntitesValueChanged
        if(evt.getValueIsAdjusting()){
        return;
        }

        Kitecourse entity = listEntites.getSelectedValue();
        if(entity == null) {
            return;
        }

        modelKitecourse = (DefaultComboBoxModel<Kitecourse>) cmbKitecourse.getModel();
        for (int i = 0; i < modelKitecourse.getSize(); i++) {
            if (modelKitecourse.getElementAt(i).getId() == kitecourse.getKitecourse().getId()) {
                cmbKitecourse.setSelectedIndex(i);
                break;
            }
        }

        clearFields();

    }//GEN-LAST:event_listEntitesValueChanged

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Kitecourse c = listEntites.getSelectedValue();

        if (c == null) {
            JOptionPane.showConfirmDialog(null, "Choose Kitecourse first");
        }

        try {
            processingKitecourse.delete(c);
            loadKitecourses();
            cleanFields();
        } catch (KiteboardingException e) {
            JOptionPane.showConfirmDialog(null, "Can not be deleted");
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        Kitecourse c = listEntites.getSelectedValue();

        if (c == null) {
            JOptionPane.showConfirmDialog(null, "Choose kitecourse first");
        }

        takeoverValues(c);

        try {
            processingKitecourse.save(c);
        } catch (KiteboardingException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }
        }

        loadKitecourses();

    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Kitecourse c = new Kitecourse();

        takeoverValues(c);

        try {
            processingKitecourse.save(c);
        } catch (KiteboardingException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        loadKitecourses();

        clearFields();
    }//GEN-LAST:event_btnAddActionPerformed
    
        
    private void loadKitecourses() {
        DefaultListModel<Kitecourse> m = new DefaultListModel<>();
        for (Kitecourse c : processingKitecourse.getListed()){
            m.addElement(c);   
        }
        listKitecourses.setModel(m);

        if(m.getSize ()>0){
           listKitecourses.setSelectedIndex(m.getSize()-1);

        }
    }
    private void clearFields() {
        txtDuration.setText("");
        txtPrice.setText("");
   
    }
    
    private void takeoverValues(Kitecourse c) {

        try{     
           c.setDuration(Integer.parseInt(txtTrajanje.getText()));
        } catch (Exception e) {
           c.setDuration(0);
           txtDuration.setText("0");
        }
        
        try {
            c.Price(new BigDecimal(format.parse(txtPrice.getText()).floatValue()
                )
            );
        } catch (Exception e) {
           c.setPrice(BigDecimal.ZERO);
           txtPrice.setText("0");
        }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Kitecourse;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox cmbKitecourse;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Kitecourse> listEntites;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
