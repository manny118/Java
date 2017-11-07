package ex26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static java.sql.ResultSet.CONCUR_UPDATABLE;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class NewUser extends javax.swing.JFrame {

 Connection conn  = null;
  Statement statement;
    ResultSet resultSet;
    
    public NewUser() {
    
        initComponents();
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsernameTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        InsertButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 70, -1));
        getContentPane().add(PasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 70, -1));

        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 110, 60, -1));

        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 150, 70, -1));

        InsertButton.setText("Insert");
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });
        getContentPane().add(InsertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 80, 40));

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 90, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("New User");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 140, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
       
         System.exit(0);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
      
        try{
          
        String newUser = UsernameTextField.getText();
        
        String pword = PasswordTextField.getText();
  
           conn = DriverManager.getConnection("jdbc:sqlserver://localhost\\SD-12:1433;databaseName=USER","emmanuel" ,"manny" );
      
           //this is used for the updating
           //  String sql1 = "update myusers set Password = ? where Username = ?";
          //  pp.setString(1, pword);        
         //pp.setString(2, newUser);
             
          
        String sql1 = "insert into myusers values(?, ?)";
        
         PreparedStatement pp = conn.prepareStatement(sql1);
                 
         pp.setString(1, newUser);
         pp.setString(2, pword);
         
         
         pp.executeUpdate();
         
                JOptionPane.showMessageDialog(null, "User added!");
      
        }
       
        catch(SQLException e){
        
            JOptionPane.showMessageDialog(null, "User not added!");    
            e.printStackTrace();
            
        }
          
    }//GEN-LAST:event_InsertButtonActionPerformed

    
    public static void main(String args[]) {
     
        new NewUser().setVisible(true);
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton InsertButton;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
