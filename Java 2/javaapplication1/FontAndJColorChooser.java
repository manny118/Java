
package javaapplication1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public final class FontAndJColorChooser extends javax.swing.JFrame {

    
    private String selectFont;
    
    public FontAndJColorChooser() {
        initComponents();
   
        buttons();
      
    }

   public void buttons(){
   
      ButtonGroup bg = new ButtonGroup();
        bg.add(BoldCheckBox);
       bg.add(ItalicCheckBox);  
  
   }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ChangeTextButton = new javax.swing.JButton();
        ChangeFontButton = new javax.swing.JButton();
        FontTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BoldCheckBox = new javax.swing.JCheckBox();
        ItalicCheckBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        MainLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChangeTextButton.setText("Change text colour");
        ChangeTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeTextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ChangeTextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        ChangeFontButton.setText("Change font size");
        ChangeFontButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeFontButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ChangeFontButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));
        getContentPane().add(FontTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 90, -1));

        jLabel1.setText("Font Size");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel2.setText("Font Style");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 70, 20));

        BoldCheckBox.setText("Bold");
        BoldCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoldCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(BoldCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        ItalicCheckBox.setText("Italic");
        ItalicCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItalicCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ItalicCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel3.setText("Font");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 30, 20));

        MainLabel.setText("The quick brown fox jumped over the lazy dog");
        getContentPane().add(MainLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 440, 40));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Arial", "Bookman Old Style", "Courier New", "Garamond", "Times New Roman", "Wide Latin" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoldCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoldCheckBoxActionPerformed
     
        if(BoldCheckBox.isSelected() == true){
         
       MainLabel.setFont(new Font(selectFont,Font.BOLD,14));
       
       }
  
    }//GEN-LAST:event_BoldCheckBoxActionPerformed

    private void ItalicCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItalicCheckBoxActionPerformed
       
        if(ItalicCheckBox.isSelected() == true){
    
            MainLabel.setFont(new Font(selectFont, Font.ITALIC, 14));
            
        }
        
    }//GEN-LAST:event_ItalicCheckBoxActionPerformed

    private void ChangeFontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeFontButtonActionPerformed
   
   try{     
       int size = Integer.parseInt(FontTextField.getText());
       
       if(size < 0 || size < 100){
       
       MainLabel.setFont(new Font(selectFont, 1, size));
        
       
       }
    
       
   }
   catch(Exception e){
   
       JOptionPane.showMessageDialog(null, "Font size must be a number!", "Error", JOptionPane.PLAIN_MESSAGE);
       
      
   }
   
   
       
       
    }//GEN-LAST:event_ChangeFontButtonActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
      
     selectFont =  jList1.getSelectedValue().toString();
       
     
    }//GEN-LAST:event_jList1MouseClicked

    private void ChangeTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeTextButtonActionPerformed
 
        
        Color color =  JColorChooser.showDialog(this, "Please choose a colour", MainLabel.getForeground());
        
        MainLabel.setForeground(color);
      
        
        
    }//GEN-LAST:event_ChangeTextButtonActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FontAndJColorChooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BoldCheckBox;
    private javax.swing.JButton ChangeFontButton;
    private javax.swing.JButton ChangeTextButton;
    private javax.swing.JTextField FontTextField;
    private javax.swing.JCheckBox ItalicCheckBox;
    private javax.swing.JLabel MainLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
