package kiteboarding.view;

import kiteboarding.controller.ProcessingKitecourse;

public class SplashScreen extends javax.swing.JFrame {

   
    public SplashScreen() {
        initComponents();
    
    
           TestDBConnection tdc = new TestDBConnection();
           tdc.start();
           
    }       
      
    private class TestDBConnection extends Thread {
    
         

        @Override
        public void run() {

            lblMessage.setText("Starting...");
            for(int i=1;i<50;i++){
                jProgressBar1.setValue(i);
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                }
 
            }
            lblMessage.setText("Connecting to database....");
            if(new ProcessingKitecourse().getListed().size()>-1){
                lblMessage.setText("Program started succesfully");
                for(int i=75;i<=100;i++){
                jProgressBar1.setValue(i);
                try {
                     Thread.sleep(30);
                } catch (Exception e) {
                }
            }
               
                new LoginWindow().setVisible(true);
                dispose();
            }else
            {

            }    
        }

    }   
      
  

      
    

  
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        lblMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kiteboarding/view/kiteboarding.jpg"))); // NOI18N
        lblMessage.setText("jLabel1");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblMessage;
    // End of variables declaration//GEN-END:variables
}
