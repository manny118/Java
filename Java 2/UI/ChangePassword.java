package ex26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ChangePassword extends javax.swing.JFrame {

    Connection conn  ;
     PreparedStatement pp;
      ResultSet resultSet;
      
      
    
      public ChangePassword() {
  
          initComponents();
               
        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost\\SD-12:1433;databaseName=USER","emmanuel" ,"manny" );
            
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
              
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        OldPasswordTextField = new javax.swing.JTextField();
        NewPasswordTextField = new javax.swing.JTextField();
        NewPasswordTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ChangePasswordButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Change Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 180, -1));
        getContentPane().add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 90, -1));
        getContentPane().add(OldPasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 90, -1));
        getContentPane().add(NewPasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 90, -1));
        getContentPane().add(NewPasswordTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 90, -1));

        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 60, -1));

        jLabel3.setText("Old Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel4.setText("New Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel5.setText("New Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        ChangePasswordButton.setText("Change Password");
        ChangePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ChangePasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 233, -1, 30));

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 233, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
      
        System.exit(0);
        
    }//GEN-LAST:event_CancelButtonActionPerformed

    public void changePassword() throws SQLException{

          String user = UsernameTextField.getText();
        
          String oldP = OldPasswordTextField.getText();
          
          String pass = NewPasswordTextField.getText();
        
          String pass1 = NewPasswordTextField1.getText();
         
          String sql = "update myusers set Password  = ? where Username = ? and Password = ?";
        
           pp = conn.prepareStatement(sql);
          
           if(!pass.equals(pass1)){JOptionPane.showMessageDialog(null, "Your new password doesn't match");   }
       
          else{   
               pp.setString(1, pass);  
               pp.setString(2, user);
               pp.setString(3, oldP); 
              /// pp.executeUpdate(); 
            
               int result = pp.executeUpdate();
              
              /// System.out.println("result = " + result );
             
               if(result == 0){
               
                JOptionPane.showMessageDialog(null, "Sorry, user does not exist");
               
               }
               else{
                JOptionPane.showMessageDialog(null, "Password was changed successfully");
               }
               
           }
            
    }  
    
    private void ChangePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePasswordButtonActionPerformed
      
        try{
        changePassword();
        }
        catch(SQLException e){
            System.out.println("Password cannot be changed");
            e.printStackTrace();
        }
    }//GEN-LAST:event_ChangePasswordButtonActionPerformed

    
    public static void main(String args[]) {
      
         new ChangePassword().setVisible(true);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ChangePasswordButton;
    private javax.swing.JTextField NewPasswordTextField;
    private javax.swing.JTextField NewPasswordTextField1;
    private javax.swing.JTextField OldPasswordTextField;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
//   int result = pp.executeUpdate();
//               
//               
//           if(result == 1){
//              
//              pp.setString(1, pass);  
//              pp.setString(2, user);
//              pp.setString(3, oldP);
//              
//             // pp.executeUpdate();
//                
//            }
//              
//           else if(result == 0){
//                JOptionPane.showMessageDialog(null, "Sorry, user does not exist");
//            }