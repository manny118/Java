package javaapplication1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

enum FuelType{
ANY, PETROL, DIESEL, HYBRID, BIOETHANOL
}
enum Transmission{
ANY, MANUAL, AUTOMATIC
}



public class CarHire extends javax.swing.JFrame {

    private FuelType fuelType;
    private Transmission transmission;
    private int numberOfSeats;
    private String selectMake;
    private String selectColour;
    
    private final static int TWO_NUMBER_OF_SEATS = 2;
    private final static int FOUR_NUMBER_OF_SEATS = 4;
    private final static int FIVE_NUMBER_OF_SEATS = 5;
    private final static int SEVEN_NUMBER_OF_SEATS = 7;
    private final static int EIGHT_NUMBER_OF_SEATS = 8;
    
 
    
    
    public FuelType getFuelType(){
        return fuelType;
    }
    
    public void setFuelType(FuelType fuelType){
    this.fuelType = fuelType;
        
    }

 
    public Transmission getTransmission(){
    return transmission;
    }
    public void setTransmission(Transmission transmission){
       
        
        this.transmission = transmission;//  
   
    }
    
    
    
    
    public CarHire() {
        initComponents();
   
    }

   
    public void setNumberOfSeats(){

   switch(numberOfSeats){
        case TWO_NUMBER_OF_SEATS:
             this.numberOfSeats = TWO_NUMBER_OF_SEATS;
      case FOUR_NUMBER_OF_SEATS:
      this.numberOfSeats = FOUR_NUMBER_OF_SEATS;
          case FIVE_NUMBER_OF_SEATS:
            this.numberOfSeats = FIVE_NUMBER_OF_SEATS;
        case SEVEN_NUMBER_OF_SEATS:
             this.numberOfSeats = SEVEN_NUMBER_OF_SEATS;
        case EIGHT_NUMBER_OF_SEATS:
              this.numberOfSeats = EIGHT_NUMBER_OF_SEATS;
          default:
              
     }

}  

public int getNumberOfSeats(){
    return numberOfSeats;
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        TwoSeatsButton = new javax.swing.JRadioButton();
        FourSeatsButton = new javax.swing.JRadioButton();
        FiveSeatsButton = new javax.swing.JRadioButton();
        SevenSeatsButton = new javax.swing.JRadioButton();
        EightSeatsButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioAnyButton = new javax.swing.JRadioButton();
        jRadioPetrol = new javax.swing.JRadioButton();
        jRadioButtonDiesel = new javax.swing.JRadioButton();
        jRadioButtonHybrid = new javax.swing.JRadioButton();
        jRadioButtonBioEthanol = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonTransmissionAny = new javax.swing.JRadioButton();
        jRadioButtonManual = new javax.swing.JRadioButton();
        jRadioButtonAutomatic = new javax.swing.JRadioButton();
        textArea1 = new java.awt.TextArea();
        jButtonPlaceOrder = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonLoadFromFile = new javax.swing.JButton();
        jButtonClearAll = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.yellow);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup3.add(TwoSeatsButton);
        TwoSeatsButton.setText("2");
        TwoSeatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoSeatsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TwoSeatsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 40, 20));

        buttonGroup3.add(FourSeatsButton);
        FourSeatsButton.setText("4");
        FourSeatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourSeatsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FourSeatsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 40, -1));

        buttonGroup3.add(FiveSeatsButton);
        FiveSeatsButton.setText("5");
        FiveSeatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveSeatsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FiveSeatsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 40, -1));

        buttonGroup3.add(SevenSeatsButton);
        SevenSeatsButton.setText("7");
        SevenSeatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenSeatsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SevenSeatsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 40, -1));

        buttonGroup3.add(EightSeatsButton);
        EightSeatsButton.setText("8");
        EightSeatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EightSeatsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EightSeatsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 50, 20));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Number Of Seats");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 130, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Fuel Type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 104, 60, 30));

        buttonGroup2.add(jRadioAnyButton);
        jRadioAnyButton.setText("Any");
        jRadioAnyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAnyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioAnyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        buttonGroup2.add(jRadioPetrol);
        jRadioPetrol.setText("Petrol");
        jRadioPetrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPetrolActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioPetrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        buttonGroup2.add(jRadioButtonDiesel);
        jRadioButtonDiesel.setText("Diesel");
        jRadioButtonDiesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDieselActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonDiesel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        buttonGroup2.add(jRadioButtonHybrid);
        jRadioButtonHybrid.setText("Hybrid");
        jRadioButtonHybrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHybridActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHybrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        buttonGroup2.add(jRadioButtonBioEthanol);
        jRadioButtonBioEthanol.setText("BioEthanol");
        jRadioButtonBioEthanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBioEthanolActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonBioEthanol, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Transmission");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, 20));

        buttonGroup1.add(jRadioButtonTransmissionAny);
        jRadioButtonTransmissionAny.setText("Any");
        jRadioButtonTransmissionAny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTransmissionAnyActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonTransmissionAny, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        buttonGroup1.add(jRadioButtonManual);
        jRadioButtonManual.setText("Manual");
        jRadioButtonManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonManualActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        buttonGroup1.add(jRadioButtonAutomatic);
        jRadioButtonAutomatic.setText("Automatic");
        jRadioButtonAutomatic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAutomaticActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonAutomatic, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));
        getContentPane().add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 670, 130));

        jButtonPlaceOrder.setText("Place Order");
        jButtonPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlaceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 293, 120, 30));

        jButtonSave.setText("Save to File");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 323, 120, 40));

        jButtonLoadFromFile.setText("Load from file");
        jButtonLoadFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadFromFileActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLoadFromFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 120, 30));

        jButtonClearAll.setText("Clear All");
        jButtonClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearAllActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClearAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 120, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Model");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 50, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/2017-10best-lead-photo-672628-s-original.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 370, 130));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Make");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 50, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Pat's Car Hire");
        jLabel7.setToolTipText("");
        jLabel7.setName(""); // NOI18N
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 190, 40));

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Black", "Blue", "Silver", "Red", "White" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 70, 100));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Colour");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 50, 20));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Audi", "BMW", "Ford", "Honda", "Lexus", "Mazda", "Mitsubushi", "Toyota", "Volkswagen" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setToolTipText("");
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 110));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A4", "X5", "Ford", "Honda", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonManualActionPerformed
          transmission = Transmission.MANUAL;
    }//GEN-LAST:event_jRadioButtonManualActionPerformed

    private void jRadioButtonAutomaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAutomaticActionPerformed
     transmission = Transmission.AUTOMATIC;
    }//GEN-LAST:event_jRadioButtonAutomaticActionPerformed

    private void jRadioButtonTransmissionAnyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTransmissionAnyActionPerformed
       transmission = Transmission.ANY;
    }//GEN-LAST:event_jRadioButtonTransmissionAnyActionPerformed

     
    private void jRadioButtonBioEthanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBioEthanolActionPerformed
       this.fuelType = FuelType.BIOETHANOL;
    }//GEN-LAST:event_jRadioButtonBioEthanolActionPerformed

    private void jRadioButtonHybridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHybridActionPerformed
    this.fuelType = FuelType.HYBRID;
    }//GEN-LAST:event_jRadioButtonHybridActionPerformed

    private void jRadioButtonDieselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDieselActionPerformed
       this.fuelType = FuelType.DIESEL;
    }//GEN-LAST:event_jRadioButtonDieselActionPerformed

    private void jRadioPetrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPetrolActionPerformed
        this.fuelType = FuelType.PETROL;
    }//GEN-LAST:event_jRadioPetrolActionPerformed

    private void jRadioAnyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAnyButtonActionPerformed
   this.fuelType = FuelType.ANY;
    }//GEN-LAST:event_jRadioAnyButtonActionPerformed

    private void TwoSeatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoSeatsButtonActionPerformed
       
       this.numberOfSeats = TWO_NUMBER_OF_SEATS;
       
    }//GEN-LAST:event_TwoSeatsButtonActionPerformed

    private void jButtonPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlaceOrderActionPerformed
     
     try{   
        
    textArea1.setText(String.format("You have requested to hire a %s, %s %s with %d seats and %s transmission  ", selectColour, getFuelType().toString().toLowerCase(),selectMake, getNumberOfSeats(), getTransmission().toString().toLowerCase()));

     }
    catch(Exception e){
    
        textArea1.setText("");
        
    }
    
    
    
    }//GEN-LAST:event_jButtonPlaceOrderActionPerformed

    private void FourSeatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourSeatsButtonActionPerformed
        this.numberOfSeats =FOUR_NUMBER_OF_SEATS;
    }//GEN-LAST:event_FourSeatsButtonActionPerformed

    private void FiveSeatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveSeatsButtonActionPerformed
       this.numberOfSeats = FIVE_NUMBER_OF_SEATS;
    }//GEN-LAST:event_FiveSeatsButtonActionPerformed

    private void SevenSeatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenSeatsButtonActionPerformed
    this.numberOfSeats =SEVEN_NUMBER_OF_SEATS;
    }//GEN-LAST:event_SevenSeatsButtonActionPerformed

    private void EightSeatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EightSeatsButtonActionPerformed
     this.numberOfSeats = EIGHT_NUMBER_OF_SEATS;
    }//GEN-LAST:event_EightSeatsButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     //   jComboBox1.addItem("Ford2");
      // jComboBox1.setSelectedItem(null);
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
     
         selectMake = jList1.getSelectedValue().toString();
        
       /// DefaultListModel<selectMake> model =  jList1.getSelectedValue();
         
         
    }//GEN-LAST:event_jList1MouseClicked

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
     
        selectColour = jList2.getSelectedValue().toString();
        
    }//GEN-LAST:event_jList2MouseClicked

    private void jButtonClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAllActionPerformed
       
//         jList2.setSelectedIndex(0);
//        textArea1.setText("");
//   
//        jList1.setSelectedIndex(0);
//
//        TwoSeatsButton.setSelected(true);
//        jRadioAnyButton.setSelected(true);
//        jRadioButtonTransmissionAny.setSelected(true);

    
        this.dispose();
        new CarHire().setVisible(true);
      //
        ///initComponents();
        
    }//GEN-LAST:event_jButtonClearAllActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
       
           if(textArea1.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Please place an order");
        
        }
           else{
            try(FileWriter fw = new FileWriter(new File("CarHire.txt"), true) ;  PrintWriter pw = new PrintWriter(fw)) {
            
                
                pw.println(textArea1.getText());
            
            }
             catch (FileNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Unable to create file");
            } catch (IOException ex) {
             
                ex.printStackTrace();
            }
           }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    
    private void jButtonLoadFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadFromFileActionPerformed
      
            try {
                
                
             String line = "";
            
             
             BufferedReader br = new BufferedReader(new FileReader(new File("CarHire.txt")));
       
            while((line = br.readLine()) != null){
              
                textArea1.setText(line);
                    
                } 
            
            }
            catch (IOException ex) {
                Logger.getLogger(CarHire.class.getName()).log(Level.SEVERE, null, ex);
            }
       
    }//GEN-LAST:event_jButtonLoadFromFileActionPerformed

    public static void main(String args[]) {
     
                new CarHire().setVisible(true);
          
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton EightSeatsButton;
    private javax.swing.JRadioButton FiveSeatsButton;
    private javax.swing.JRadioButton FourSeatsButton;
    private javax.swing.JRadioButton SevenSeatsButton;
    private javax.swing.JRadioButton TwoSeatsButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButtonClearAll;
    private javax.swing.JButton jButtonLoadFromFile;
    private javax.swing.JButton jButtonPlaceOrder;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JRadioButton jRadioAnyButton;
    private javax.swing.JRadioButton jRadioButtonAutomatic;
    private javax.swing.JRadioButton jRadioButtonBioEthanol;
    private javax.swing.JRadioButton jRadioButtonDiesel;
    private javax.swing.JRadioButton jRadioButtonHybrid;
    private javax.swing.JRadioButton jRadioButtonManual;
    private javax.swing.JRadioButton jRadioButtonTransmissionAny;
    private javax.swing.JRadioButton jRadioPetrol;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
