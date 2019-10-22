package kiteboarding.view;

import kiteboarding.controller.ProcessingKitecourse;
import kiteboarding.model.Kitecourse;
import kiteboarding.helper.KiteboardingException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import kiteboarding.model.Kitecourse;




public class Kitecourses extends javax.swing.JFrame {
    
    private static DefaultComboBoxModel<Kitecourse> modelKitecourse;
    private ProcessingKitecourse processingKitecourse;
    private Kitecourse kitecourse;
    

   
    public Kitecourses() {
        initComponents();
         processingKitecourse = new ProcessingKitecourse();
      
         
        DefaultComboBoxModel<Kitecourse> mkc = new DefaultComboBoxModel<>();
        Kitecourse course = new Kitecourse();
        course.setId(0);
        course.setKitecoursetype("Select kitecourse");
        mkc.addElement(course);
        new ProcessingKitecourse().getListed().forEach((c) -> {
            mkc.addElement(c);
        });
        cmbKitecourses.setModel(mkc);
         
        loadData();
    }
         
    private void loadData() {
        DefaultListModel<Kitecourse> m = new DefaultListModel<>();
        processingKitecourse.getListed().forEach((g) -> {
            m.addElement(g);
        });
        listKitecourse.setModel(m);
        
   
    }
  

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cmbKitecourse = new javax.swing.JComboBox<Kitecourse>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listKitecourse = new javax.swing.JList<Kitecourse>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kitecourse");

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

        cmbKitecourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKitecourseActionPerformed(evt);
            }
        });

        listKitecourse.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
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
                    .addComponent(cmbKitecourse, 0, 104, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(cmbKitecourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnChange)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listKitecourseValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listKitecourseValueChanged
        if(evt.getValueIsAdjusting()){
        return;    
        }    
       

        Kitecourse kc = listKitecourse.getSelectedValue();
        if(kc == null) {
            return;
        }
        
        
        modelKitecourse = (DefaultComboBoxModel<Kitecourse>) cmbKitecourse.getModel();
        for (int i = 0; i < modelKitecourse.getSize(); i++) {
            if (modelKitecourse.getElementAt(i).getId() == kitecourse.getKitecoursetype().getId()) {
                cmbKitecourse.setSelectedIndex(i);
                break;
            }
        }

        clearFields();
    }//GEN-LAST:event_listKitecourseValueChanged

    private void cmbKitecourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKitecourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKitecourseActionPerformed

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
        }

        loadKitecourses();

    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Kitecourse kc = listKitecourse.getSelectedValue();

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
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<Kitecourse> cmbKitecourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JList<Kitecourse> listKitecourse;
    // End of variables declaration//GEN-END:variables
}
