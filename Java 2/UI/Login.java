
package ex26;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class Login extends javax.swing.JFrame {
 Connection conn;
 Statement statement;
  ResultSet rs;    
 String getUserInput;
 String getPass;
 boolean isLoggedIn = false;
 
 
    public Login() {
        initComponents();
        connect();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Please login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 130, -1));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 70, -1));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 80, -1));

        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 80, -1));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    checkDetails();
   
    }//GEN-LAST:event_jButton1ActionPerformed

    public void checkDetails(){
    
    
    
         String s = "";
        
        try{       
        
             rs  = statement.executeQuery("select Username,Password from myusers");
             
            getUserInput = jTextField1.getText();
         
            //I used a char[] to get the password and String s to save it as a string
            char[] gg = jPasswordField1.getPassword();
  
            for(int i=0; i<gg.length; i++){ s += gg[i]; }
                
            
            while(rs.next()){
            
            if(getUserInput.equalsIgnoreCase(rs.getString("Username"))   && s.equals(rs.getString("Password")) ){ 
                
                
                JOptionPane.showMessageDialog(null, "Logged in!");    
        
                isLoggedIn = true;
            }
               // if(s.equals(rs.getString("Password"))){ isLoggedIn = true; System.out.println("I got " + s); }
           
            }
            
            while(isLoggedIn != true){
            
           
                JOptionPane.showMessageDialog(null, "Incorrect details!");    
              
                break;
            }
            
        }
         catch(SQLException | HeadlessException e){
         }   
           
    
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        System.exit(0);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public void connect(){
    
        try {
            
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost\\SD-12:1433;databaseName=USER","emmanuel" ,"manny" );
      
         
             statement = conn.createStatement();
            
         
             rs  = statement.executeQuery("select Username, Password from myusers");
                    
           
            
          //  while(rs.next()){ 
            
           //     System.out.println(rs.getString("Username"));
           //     System.out.println(rs.getString("Password"));
             
           //     getUserInput = jTextField1.getText();
            
             //   if(getUserInput.equals(rs.getString("Username"))){ JOptionPane.showConfirmDialog(null, "Logged in!");     }
       
          ///  }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
                
         
    
    }
    
    
    public static void main(String args[]) {
       
                new Login().setVisible(true);
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
