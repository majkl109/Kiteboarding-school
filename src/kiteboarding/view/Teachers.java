package kiteboarding.view;

import javax.swing.DefaultComboBoxModel;
import kiteboarding.controller.ProcessingTeacher;
import kiteboarding.model.Teacher;
import kiteboarding.helper.KiteboardingException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import kiteboarding.controller.ProcessingKitecourse;
import kiteboarding.model.Kitecourse;

        
public class Teachers extends javax.swing.JFrame {

    
    private ProcessingTeacher processingEntity;
    private static DefaultComboBoxModel<Kitecourse>modelKitecourse;
    private Teacher teacher;
    
    public Teachers() {
        initComponents();
        processingEntity = new ProcessingTeacher();
        
        DefaultComboBoxModel<Kitecourse> mkc = new DefaultComboBoxModel<>();
        Kitecourse kc = new Kitecourse();
        kc.setId(0);
        kc.setKitecoursetype("Select kitecourse");
        mkc.addElement(kc);
        new ProcessingKitecourse().getListed().forEach((c) -> {
            mkc.addElement(c);
        });
        cmbKitecourse.setModel(mkc);
     
        loadData();
    }
    private void loadData() {
        DefaultListModel<Teacher> m = new DefaultListModel<>();
        processingEntity.getListed().forEach((t) -> {
            m.addElement(t);
        });
        listEntites.setModel(m);
    }    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listEntites = new javax.swing.JList<Teacher>();
        jLabel1 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIBAN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cmbKitecourse = new javax.swing.JComboBox<Kitecourse>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listEntites.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listEntitesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listEntites);

        jLabel1.setText("First name");

        jLabel2.setText("Last name");

        jLabel3.setText("E mail");

        jLabel5.setText("Kitecourse");

        jLabel6.setText("IBAN");

        jLabel7.setText("TEACHER");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(27, 27, 27))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail)
                                    .addComponent(txtFirstName)
                                    .addComponent(txtIBAN)
                                    .addComponent(cmbKitecourse, javax.swing.GroupLayout.Alignment.LEADING, 0, 175, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAdd)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChange)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(btnDelete)
                .addGap(234, 234, 234))
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbKitecourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAdd)
                                    .addComponent(btnChange)
                                    .addComponent(btnDelete)))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listEntitesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listEntitesValueChanged
        if(evt.getValueIsAdjusting()) {
            return;
        }
        
        Teacher entity = listEntites.getSelectedValue();
        if (entity == null) {
            return;
        }
    
        modelKitecourse = (DefaultComboBoxModel<Kitecourse>) cmbKitecourse.getModel();
        for (int i = 0; i < modelKitecourse.getSize(); i++) {
            if (modelKitecourse.getElementAt(i).getId() == teacher.getKitecourse().getId()) {
                cmbKitecourse.setSelectedIndex(i);
                break;
            }
        }
        
        cleanFields();
        
        txtFirstName.setText(entity.getFirstname());
        txtLastName.setText(entity.getLastname());
        txtEmail.setText(entity.getEmail());
        txtIBAN.setText(entity.getIban());
        
    
        
        
    }//GEN-LAST:event_listEntitesValueChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Teacher entity = new Teacher();
        
        takeoverValues(entity);
        
        try {
            processingEntity.save(entity);
        } catch (KiteboardingException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }
        
      
          cleanFields();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        Teacher entity = listEntites.getSelectedValue();
          
        if (entity == null) {
            JOptionPane.showConfirmDialog(null, "Choose teacher first");
        }  
        
        takeoverValues(entity);
        
        try {
            processingEntity.save(entity);
        } catch (KiteboardingException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }
        
      
          cleanFields();
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Teacher entity = listEntites.getSelectedValue();
          
        if (entity == null) {
            JOptionPane.showConfirmDialog(null, "Choose teacher first");
        }  
        
        try {
            processingEntity.delete(entity);
            cleanFields();
        } catch (KiteboardingException e) {
            JOptionPane.showConfirmDialog(null, "Can not be deleted");
        }
        
      
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbKitecourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKitecourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKitecourseActionPerformed
   
    private void cleanFields() {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
        txtIBAN.setText("");
    }
    
    private void takeoverValues(Teacher entity) {
        entity.setFirstname(txtFirstName.getText());
        entity.setLastname(txtLastName.getText());
        entity.setEmail(txtEmail.getText());
        entity.setIban(txtIBAN.getText());
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Teacher> listEntites;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtIBAN;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
