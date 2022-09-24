package TechQuizApp.gui;

import TechQuizApp.DAO.PerformanceDAO;
import TechQuizApp.pojo.UserProfile;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class StudentOptionsFrame extends javax.swing.JFrame {
     
    public StudentOptionsFrame() {
        initComponents();
        setTitle("THE TECH QUIZZ APP");
        lblusername3.setText("Hello "+UserProfile.getUsername());  
         setLocationRelativeTo(null);
    }
    
    
    private boolean validateInputs(){
    if(jrbtaketest.isSelected()==false && jrbviewscores.isSelected()==false && jrbchangepassward.isSelected()==false){
        return false;
    }
    return true;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblusername3 = new javax.swing.JLabel();
        lbllogout = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jrbtaketest = new javax.swing.JRadioButton();
        jrbchangepassward = new javax.swing.JRadioButton();
        jrbviewscores = new javax.swing.JRadioButton();
        btndotask = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Make A Choice");

        lblusername3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblusername3.setForeground(new java.awt.Color(255, 153, 51));

        lbllogout.setBackground(new java.awt.Color(0, 0, 0));
        lbllogout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbllogout.setForeground(new java.awt.Color(255, 153, 0));
        lbllogout.setText("Logout");
        lbllogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbllogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbllogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbllogoutMouseExited(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("STZhongsong", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("ONLINE QUIZ STUDENT PANEL");

        jrbtaketest.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrbtaketest);
        jrbtaketest.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbtaketest.setForeground(new java.awt.Color(255, 204, 51));
        jrbtaketest.setText("Take Test");

        jrbchangepassward.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrbchangepassward);
        jrbchangepassward.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbchangepassward.setForeground(new java.awt.Color(255, 204, 51));
        jrbchangepassward.setText("Change Passward");

        jrbviewscores.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrbviewscores);
        jrbviewscores.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jrbviewscores.setForeground(new java.awt.Color(255, 204, 51));
        jrbviewscores.setText("View Scores");

        btndotask.setBackground(new java.awt.Color(0, 0, 0));
        btndotask.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndotask.setForeground(new java.awt.Color(255, 255, 255));
        btndotask.setText("Do Task");
        btndotask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotaskActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Pictures\\setpaper.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblusername3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbllogout, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(btndotask, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(389, 389, 389))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbviewscores, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbtaketest, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbchangepassward, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(314, 314, 314))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(207, 207, 207))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbllogout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusername3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jrbtaketest)
                        .addGap(71, 71, 71)
                        .addComponent(jrbviewscores))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jrbchangepassward)
                .addGap(215, 215, 215)
                .addComponent(btndotask, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbllogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseClicked
        LoginFrame loginframe=new LoginFrame();
        loginframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbllogoutMouseClicked

    private void lbllogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseEntered
        lbllogout.setForeground(Color.white);
    }//GEN-LAST:event_lbllogoutMouseEntered

    private void lbllogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseExited
        lbllogout.setForeground( new Color(255,153,0));
    }//GEN-LAST:event_lbllogoutMouseExited

    private void btndotaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotaskActionPerformed
          if(validateInputs()==false){
            JOptionPane.showMessageDialog(null, "Please Choose An Option","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(jrbtaketest.isSelected())
         {
            Choosepaperframe paperFrame=new Choosepaperframe();
            paperFrame.setVisible(true);
            
         }
        else if(jrbviewscores.isSelected())
        {

            try     
            {
                String s=UserProfile.getUsername();
                ArrayList <String> examidList=PerformanceDAO.getallExamid(s);
            
            if(examidList.isEmpty()){
            JOptionPane.showMessageDialog(null, "You haven't appeared for any exam yet!","No Records!!",JOptionPane.INFORMATION_MESSAGE);
            return;
            }
            else
            {
              StudentscoreFrame scoreFrame=new  StudentscoreFrame();
              scoreFrame.setVisible(true);
              this.dispose();
            }
            }   
          catch(SQLException ex)
          {
           JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE); 
           ex.printStackTrace();
         }    
      }      
if(jrbchangepassward.isSelected())
        {
            ChangePasswordFrame passwordFrame=new ChangePasswordFrame();
            passwordFrame.setVisible(true);	
            
        }
            this.dispose();
            


    }//GEN-LAST:event_btndotaskActionPerformed

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
            java.util.logging.Logger.getLogger(StudentOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndotask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbchangepassward;
    private javax.swing.JRadioButton jrbtaketest;
    private javax.swing.JRadioButton jrbviewscores;
    private javax.swing.JLabel lbllogout;
    private javax.swing.JLabel lblusername3;
    // End of variables declaration//GEN-END:variables
}