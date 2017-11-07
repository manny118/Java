
package cafe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MyCafe extends javax.swing.JFrame {

    public boolean appendTofile;
    
    public MyCafe() {
        
        
        initComponents();
        cmbMealType.setSelectedIndex(0);
        
        rbAppend.doClick();
        
        rbCoffee.setActionCommand("coffee");
        rbCoke.setActionCommand("coke");
        rbTea.setActionCommand("tea");
        rbWater.setActionCommand("water");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbTea = new javax.swing.JRadioButton();
        rbCoffee = new javax.swing.JRadioButton();
        rbCoke = new javax.swing.JRadioButton();
        rbWater = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnPlaceOrder = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnLoadfromfile = new javax.swing.JButton();
        cbButter = new javax.swing.JCheckBox();
        cbMayo = new javax.swing.JCheckBox();
        cbKetchup = new javax.swing.JCheckBox();
        cbVinegar = new javax.swing.JCheckBox();
        cmbMealType = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstOptions = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        rbAppend = new javax.swing.JRadioButton();
        rbOverride = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));

        jLabel2.setText("Meal Type");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Manny's Cafe");

        jLabel4.setText("Drink");

        jLabel5.setText("Extras");

        buttonGroup1.add(rbTea);
        rbTea.setText("Tea");

        buttonGroup1.add(rbCoffee);
        rbCoffee.setText("Coffee");

        buttonGroup1.add(rbCoke);
        rbCoke.setText("Coke");

        buttonGroup1.add(rbWater);
        rbWater.setText("Water");
        rbWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbWaterActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setLineWrap(true);
        txtArea.setRows(5);
        txtArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtArea);

        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        btnSave.setText("Save to file");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnLoadfromfile.setText("Load from file");

        cbButter.setText("Butter");

        cbMayo.setText("Mayo");

        cbKetchup.setText("Ketchup");

        cbVinegar.setText("Vinegar");

        cmbMealType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Breakfast", "Lunch", "Dinner" }));
        cmbMealType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMealTypeActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstOptions);

        buttonGroup2.add(rbAppend);
        rbAppend.setText("Append");
        rbAppend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileWriteModeRadioButtonClicked(evt);
            }
        });
        jPanel1.add(rbAppend);

        buttonGroup2.add(rbOverride);
        rbOverride.setText("Override");
        rbOverride.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileWriteModeRadioButtonClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2))
                    .addComponent(cmbMealType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(rbCoke)
                    .addComponent(rbCoffee)
                    .addComponent(rbWater)
                    .addComponent(rbTea))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cbButter)
                    .addComponent(cbMayo)
                    .addComponent(cbKetchup)
                    .addComponent(cbVinegar)))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPlaceOrder)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbOverride)))
                    .addComponent(btnLoadfromfile)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(cmbMealType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(rbCoke))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(rbCoffee))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(rbWater))
                            .addComponent(rbTea)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbButter)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(cbMayo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(cbKetchup, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(cbVinegar)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPlaceOrder)
                                .addGap(17, 17, 17)
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbOverride)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addComponent(btnLoadfromfile))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbWaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbWaterActionPerformed
    
    }//GEN-LAST:event_rbWaterActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
      
        
        String order="You ordered";
        
    //  lstOptions.getSelected
        String options = lstOptions.getSelectedValuesList().toString();
        
        order += options.substring(1, options.length() - 1);
        
        
        ButtonModel model = buttonGroup1.getSelection();
        order += model.getActionCommand();
        
        
//        rbCoffee.setActionCommand("coffee");
//        rbCoke.setActionCommand("coke");
//        rbTea.setActionCommand("tea");
//        rbWater.setActionCommand("water");
        
        order += "with";
        if(cbButter.isSelected())
            order += " butter";
        if(cbKetchup.isSelected())
            order += " and ketchup";
        if(cbMayo.isSelected( ))
            order += " and mayo";
        if(cbVinegar.isSelected())
            order += " and vinegar";
        
        txtArea.setText(order);
       
        
        
        
        
        
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void cmbMealTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMealTypeActionPerformed
      
        String mealSelected = cmbMealType.getSelectedItem().toString();
      //
        DefaultListModel<String> model = new DefaultListModel<>();
        
        switch(mealSelected){
            case "Breakfast":
                model.addElement(" Breakfast roll ");
                model.addElement(" Onions ");
                model.addElement(" Beans ");
                break;
             case "Lunch":
                 model.addElement(" Wrap ");
                 model.addElement(" Sandwich ");
                 model.addElement(" Soup ");
                 break;
            case "Dinner":
                model.addElement(" Chips ");
                model.addElement(" Gravy ");
                model.addElement(" Vegetable ");
                break;
            default:
                model.addElement(" Choose meal type");
               
        }      
        lstOptions.setModel(model);
        
    }//GEN-LAST:event_cmbMealTypeActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
   
        
        
        
        
        
        if(txtArea.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Please place an order");
        
        }
        else{
            JFileChooser chooser = new JFileChooser();
            if(chooser.showDialog(this, "OK") == JFileChooser.APPROVE_OPTION){
            
                File filereader = chooser.getSelectedFile();
                
            try( FileWriter fw = new FileWriter(filereader);   PrintWriter pw = new PrintWriter(fw);  ){
                pw.println(txtArea.getText());
                
                JOptionPane.showMessageDialog(this, "Order written to file");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Unable to create file");
            } catch (IOException ex) {
             
            }
           }
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void fileWriteModeRadioButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileWriteModeRadioButtonClicked
        
        
        
        ///if(rbAppend.isSelected())
            if(rbAppend.isSelected()){appendTofile = true;}
            else{appendTofile = false;}
        
    }//GEN-LAST:event_fileWriteModeRadioButtonClicked

  
    public static void main(String args[]) {
       
                new MyCafe().setVisible(true);
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadfromfile;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cbButter;
    private javax.swing.JCheckBox cbKetchup;
    private javax.swing.JCheckBox cbMayo;
    private javax.swing.JCheckBox cbVinegar;
    private javax.swing.JComboBox cmbMealType;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstOptions;
    private javax.swing.JRadioButton rbAppend;
    private javax.swing.JRadioButton rbCoffee;
    private javax.swing.JRadioButton rbCoke;
    private javax.swing.JRadioButton rbOverride;
    private javax.swing.JRadioButton rbTea;
    private javax.swing.JRadioButton rbWater;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
