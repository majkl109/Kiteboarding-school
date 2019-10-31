package kiteboarding.view;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import kiteboarding.controller.ProcessingKitecourse;
import kiteboarding.helper.KiteboardingException;
import kiteboarding.model.Kitecourse;




public class Kitecourses extends javax.swing.JFrame {
    
    private ProcessingKitecourse processingKitecourse;
    private DecimalFormat format;
    

   
    public Kitecourses() {
        initComponents();
        processingKitecourse = new ProcessingKitecourse();
        
         NumberFormat nf = NumberFormat.getInstance(
                new Locale("hr")
        );
        format = (DecimalFormat) nf;
        format.applyPattern("#,###.00");
      
    loadKitecourses();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listKitecourse = new javax.swing.JList<Kitecourse>();
        jLabel4 = new javax.swing.JLabel();
        txtKitecoursetype = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Kitecoursetype");

        jLabel2.setText("Duration");

        jLabel3.setText("Price");

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

        listKitecourse.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listKitecourseValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listKitecourse);

        jLabel4.setText("KITECOURSES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDuration)
                    .addComponent(txtPrice)
                    .addComponent(txtKitecoursetype))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtKitecoursetype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnChange)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listKitecourseValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listKitecourseValueChanged
        if(evt.getValueIsAdjusting()){
        return;    
        }    
       

        Kitecourse kc = listKitecourse.getSelectedValue();
        if(kc == null) {
            return;
        }
        
        
        clearFields();
        
        txtKitecoursetype.setText(kc.getKitecoursetype());
        txtDuration.setText(format.format(kc.getDuration()));
        txtPrice.setText(format.format(kc.getPrice()));
    }//GEN-LAST:event_listKitecourseValueChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
      Kitecourse kc = new Kitecourse();

        takeoverValues(kc);

        try {
            processingKitecourse.save(kc);
        } catch (KiteboardingException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        loadKitecourses();

        clearFields();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        Kitecourse c = listKitecourse.getSelectedValue();

        if (c == null) {
            JOptionPane.showConfirmDialog(null, "Choose kitecourse first");
        }


        try {
            processingKitecourse.save(c);
        } catch (KiteboardingException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }
        loadKitecourses();
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Kitecourse c = listKitecourse.getSelectedValue();

        if (c == null) {
            JOptionPane.showConfirmDialog(null, "Choose kitecourse first");
        }

        try {
            processingKitecourse.delete(c);
            loadKitecourses();
            clearFields();
        } catch (KiteboardingException e) {
            JOptionPane.showConfirmDialog(null, "Can not be deleted");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
      
       
    private void loadKitecourses() {
        DefaultListModel<Kitecourse> m = new DefaultListModel<>();
        for (Kitecourse c : processingKitecourse.getListed()){
            m.addElement(c);   
        }
        listKitecourse.setModel(m);

        if(m.getSize ()>0){
           listKitecourse.setSelectedIndex(m.getSize()-1);

        }
    }
    private void clearFields() {
        txtKitecoursetype.setText("");
        txtDuration.setText("");
        txtPrice.setText("");
   
    }
    
    private void takeoverValues(Kitecourse c) {

        try{     
           c.setKitecoursetype(txtKitecoursetype.getText());
        } catch (Exception e) {
           
        }
        
        try{     
           c.setDuration(Integer.parseInt(txtDuration.getText()));
        } catch (Exception e) {
           c.setDuration(0);
        }
        
        try {
            c.setPrice(Integer.valueOf(txtPrice.getText()));
        } catch (Exception e) {
           c.setPrice(0);
           txtPrice.setText("0");
        }
       
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Kitecourse> listKitecourse;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtKitecoursetype;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

   
}
