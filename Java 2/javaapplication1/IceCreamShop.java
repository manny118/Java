
package javaapplication1;

import javaapplication1.EnumsForIceCream.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;


public class IceCreamShop extends javax.swing.JFrame {

    private double cost;
 
    private double toppingsCost;

    public IceCreamShop() {
        initComponents();
  
      checkButtons();

    }
    double totalCost  ;

    private double calculateCost(){
       
         totalCost  = cost + toppingsCost;
        
        return totalCost;
    }
    
    
    private void checkButtons(){
    
      ButtonGroup bg  = new ButtonGroup();
        bg.add(BananaSplitRadioButton);
        bg.add(SundaeRadioButton);
        bg.add(ConeRadioButton);
        
        ButtonGroup ng  = new ButtonGroup();
        ng.add(ChocolateRadioButton);
        ng.add(VanillaRadioButton);
        ng.add(StrawberryRadioButton);
        
     
        System.out.println( );
    
        ButtonGroup dg  = new ButtonGroup();
        dg.add(FlakeCheckBox);
        dg.add(SprinklesCheckBox);
        dg.add(SyrupCheckBox);
     
        ChocolateRadioButton.setSelected(true);
        TotalTextField.setText("1.50");
        ConeRadioButton.setSelected(true);
    
        
    }
    
    
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        OrderButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TotalTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        VanillaRadioButton = new javax.swing.JRadioButton();
        ChocolateRadioButton = new javax.swing.JRadioButton();
        StrawberryRadioButton = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        FlakeCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SyrupCheckBox = new javax.swing.JCheckBox();
        SprinklesCheckBox = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        ConeRadioButton = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        SundaeRadioButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        BananaSplitRadioButton = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ice Cream Shop");
        setBackground(new java.awt.Color(51, 153, 0));
        setFocusCycleRoot(false);
        setForeground(new java.awt.Color(204, 204, 0));

        OrderButton.setText("Order");
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Total");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Please Place Your Order");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ice Cream Flavour"));

        VanillaRadioButton.setText("Vanilla");

        ChocolateRadioButton.setText("Chocolate");

        StrawberryRadioButton.setText("Strawberry");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StrawberryRadioButton)
                    .addComponent(VanillaRadioButton)
                    .addComponent(ChocolateRadioButton))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ChocolateRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VanillaRadioButton)
                .addGap(9, 9, 9)
                .addComponent(StrawberryRadioButton)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Toppings"));

        FlakeCheckBox.setText("Flake");
        FlakeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlakeCheckBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("€0.20");

        jLabel6.setText("€0.20");

        jLabel5.setText("€0.20");

        SyrupCheckBox.setText("Syrup");
        SyrupCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SyrupCheckBoxActionPerformed(evt);
            }
        });

        SprinklesCheckBox.setText("Sprinkles");
        SprinklesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SprinklesCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SprinklesCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(FlakeCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SyrupCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FlakeCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SprinklesCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SyrupCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ice Cream Choice"));

        ConeRadioButton.setText("Cone");
        ConeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConeRadioButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("€1.90");

        jLabel9.setText("€2.50");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\dsd12\\Downloads\\coneeee.jpg")); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\dsd12\\Downloads\\Sundaeee.jpg")); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\dsd12\\Downloads\\Bananasplitttrr.gif")); // NOI18N
        jLabel13.setText("jLabel13");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        SundaeRadioButton.setText("Sundae");
        SundaeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SundaeRadioButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("€1.50");

        BananaSplitRadioButton.setText("Banana Split");
        BananaSplitRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BananaSplitRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel8)
                                .addGap(102, 102, 102)
                                .addComponent(jLabel9))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(ConeRadioButton)
                                .addGap(39, 39, 39)
                                .addComponent(SundaeRadioButton)
                                .addGap(59, 59, 59)
                                .addComponent(BananaSplitRadioButton)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConeRadioButton)
                    .addComponent(SundaeRadioButton)
                    .addComponent(BananaSplitRadioButton))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jMenuBar1.setToolTipText("");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Help");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(TotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(OrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SprinklesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SprinklesCheckBoxActionPerformed
     
        this.toppingsCost = Toppings.SPRINKLES.getPricePerToppings();
        
    }//GEN-LAST:event_SprinklesCheckBoxActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
      
        System.exit(0);
        
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void SundaeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SundaeRadioButtonActionPerformed
      
        this.cost = IceCreamChoice.SUNDAE.getPice();
        SyrupCheckBox.setSelected(true);
        VanillaRadioButton.setSelected(true);
        TotalTextField.setText("€2.10");
        
    }//GEN-LAST:event_SundaeRadioButtonActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
     
        this.cost = IceCreamChoice.SUNDAE.getPice();
       SyrupCheckBox.setSelected(true);
        VanillaRadioButton.setSelected(true);
        TotalTextField.setText("€2.10");
        SundaeRadioButton.setSelected(true);
    
        
    }//GEN-LAST:event_jLabel12MouseClicked

    private void ConeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConeRadioButtonActionPerformed
      
        this.cost = IceCreamChoice.CONE.getPice();
        
    }//GEN-LAST:event_ConeRadioButtonActionPerformed

    private void BananaSplitRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BananaSplitRadioButtonActionPerformed
       
        this.cost = IceCreamChoice.BANANA_SPLIT.getPice();
        JOptionPane.showMessageDialog(null, "Your banana split comes with chocolate, vanilla and strawberry");  
        ConeRadioButton.setEnabled(false);
        SundaeRadioButton.setEnabled(false);
        BananaSplitRadioButton.setEnabled(false);
        TotalTextField.setText("€2.50");
          if(SundaeRadioButton.isSelected() == true){
        
            SundaeRadioButton.setEnabled(true);
             
        }
        
           if(ConeRadioButton.isSelected()){
        
            ConeRadioButton.setEnabled(true);
            
        }
           else if(BananaSplitRadioButton.isSelected()){
               
               BananaSplitRadioButton.setEnabled(true);
           }
          
        
    }//GEN-LAST:event_BananaSplitRadioButtonActionPerformed

    //jlabel for banana split
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
       
        JOptionPane.showMessageDialog(null, "Your banana split comes with chocolate, vanilla and strawberry");
        ConeRadioButton.setEnabled(false);
        SundaeRadioButton.setEnabled(false);
        BananaSplitRadioButton.setEnabled(false);
        TotalTextField.setText("€2.50");
        
   //    || jLabel12.setEnabled() == true
        if(SundaeRadioButton.isSelected() ){
        
            SundaeRadioButton.setEnabled(true);
        
            this.cost = IceCreamChoice.SUNDAE.getPice();
   //
        }
          if(ConeRadioButton.isSelected() == true){
        
            ConeRadioButton.setEnabled(true);
        
             this.cost = IceCreamChoice.CONE.getPice();
   //
        }
        
        
        
    }//GEN-LAST:event_jLabel13MouseClicked

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
       
        String Flavour = "";
        if(ChocolateRadioButton.isSelected() == true){
            Flavour = "Chocolate";
        }
        else if(VanillaRadioButton.isSelected() == true){
         
            Flavour = "Vanilla";
        }
        else if(StrawberryRadioButton.isSelected() == true){
            Flavour = "Strawberry";
        }
        
        
        String IceCream = "";
        if(SundaeRadioButton.isSelected() == true){
            IceCream = "Sundae";
        }
        else if(ConeRadioButton.isSelected() == true){
         
            IceCream = "Cone";
        }
        else if(BananaSplitRadioButton.isSelected() == true){
            IceCream = "Banana Split";
        }
        
        
         String toppings = "";
      
         if(FlakeCheckBox.isSelected() == true){
            toppings = "Flake";
        }
        else if(SyrupCheckBox.isSelected() == true){
         
            toppings = "Syrup";
        }
        else if(SprinklesCheckBox.isSelected() == true){
            toppings = "Sprinkles";
        }
        
        JOptionPane.showMessageDialog(null, String.format("You have ordered \n an Ice Cream %s with \n %s Flavoured Ice Cream\n with a %s \n\n\n\nPlease pay the Cahsier %s" ,IceCream, Flavour, toppings ,calculateCost() ), "You have ordered",JOptionPane.PLAIN_MESSAGE);
                
        ChocolateRadioButton.setSelected(true);
        TotalTextField.setText("1.50");
        ConeRadioButton.setSelected(true);
          
      
        
        
    }//GEN-LAST:event_OrderButtonActionPerformed

    private void SyrupCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SyrupCheckBoxActionPerformed
       
        
        this.toppingsCost = Toppings.SYRUP.getPricePerToppings();
        
    }//GEN-LAST:event_SyrupCheckBoxActionPerformed

    private void FlakeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlakeCheckBoxActionPerformed
    
        this.toppingsCost = Toppings.FLAKE.getPricePerToppings();
        
        
    }//GEN-LAST:event_FlakeCheckBoxActionPerformed

    
    ///JLABEL FOR THE CONE
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
      
        this.cost = IceCreamChoice.CONE.getPice();
   //
        ConeRadioButton.setSelected(true);
        TotalTextField.setText("€1.70");
    }//GEN-LAST:event_jLabel11MouseClicked

   
    
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IceCreamShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IceCreamShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IceCreamShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IceCreamShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IceCreamShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BananaSplitRadioButton;
    private javax.swing.JRadioButton ChocolateRadioButton;
    private javax.swing.JRadioButton ConeRadioButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JCheckBox FlakeCheckBox;
    private javax.swing.JButton OrderButton;
    private javax.swing.JCheckBox SprinklesCheckBox;
    private javax.swing.JRadioButton StrawberryRadioButton;
    private javax.swing.JRadioButton SundaeRadioButton;
    private javax.swing.JCheckBox SyrupCheckBox;
    private javax.swing.JTextField TotalTextField;
    private javax.swing.JRadioButton VanillaRadioButton;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
