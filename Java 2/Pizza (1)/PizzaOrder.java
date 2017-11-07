
package ex29;
import ex27.Person;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class PizzaOrder extends javax.swing.JFrame {

    Connection conn ;
    ArrayList<Customer> mycustomers = new ArrayList<>();
    private  int myCounter = 0 ;
    PreparedStatement ps;
    public PizzaOrder() {
       
        
        try {
            initComponents();
           
             conn = DriverManager.getConnection("jdbc:sqlserver://localhost\\SD-12:1433;databaseName=USER","emmanuel" ,"manny" );
            
            System.out.println("Successful connection");
        
            NextButton.setEnabled(false);
            PrevButton.setEnabled(false);
            FirstButton.setEnabled(false);
            LastButton.setEnabled(false);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection failed!");
        }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        ResetButton = new javax.swing.JButton();
        PlaceOrderButton = new javax.swing.JButton();
        SelectAllButton = new javax.swing.JButton();
        NameSearchButton = new javax.swing.JButton();
        PhoneNumberSearchButton = new javax.swing.JButton();
        NewButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PizzaName_jList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        NameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AddressTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PhoneNumberTextField = new javax.swing.JTextField();
        FirstButton = new javax.swing.JButton();
        PrevButton = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        LastButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rb_Panel = new javax.swing.JPanel();
        PersonalRadioButton = new javax.swing.JRadioButton();
        LargeRadioButton = new javax.swing.JRadioButton();
        MediumRadioButton = new javax.swing.JRadioButton();
        SmallRadioButton = new javax.swing.JRadioButton();
        cb_Panel = new javax.swing.JPanel();
        TomatoesCheckBox = new javax.swing.JCheckBox();
        PineappleCheckBox = new javax.swing.JCheckBox();
        OnionCheckBox = new javax.swing.JCheckBox();
        MushroomsCheckBox = new javax.swing.JCheckBox();
        PepperoniCheckBox = new javax.swing.JCheckBox();
        JapelonsCheckBox = new javax.swing.JCheckBox();
        HamCheckBox = new javax.swing.JCheckBox();
        SweetcornCheckBox = new javax.swing.JCheckBox();
        SausageCheckBox = new javax.swing.JCheckBox();
        BaconCheckBox = new javax.swing.JCheckBox();
        ExtraCheeseCheckBox = new javax.swing.JCheckBox();
        ChickenCheckBox = new javax.swing.JCheckBox();
        SalamiCheckBox = new javax.swing.JCheckBox();
        GreenPeppersCheckBox = new javax.swing.JCheckBox();
        base_rb_Panel = new javax.swing.JPanel();
        RegularRadioButton = new javax.swing.JRadioButton();
        ApacheRisingRadioButton = new javax.swing.JRadioButton();
        ThinRadioButton = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        sauceJList = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        DetailsTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        lblIndex = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        PlaceOrderButton.setText("Place Order");
        PlaceOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderButtonActionPerformed(evt);
            }
        });

        SelectAllButton.setText("Select all Customers");
        SelectAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectAllButtonActionPerformed(evt);
            }
        });

        NameSearchButton.setText("Name Search");
        NameSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameSearchButtonActionPerformed(evt);
            }
        });

        PhoneNumberSearchButton.setText("Phone Number Search");
        PhoneNumberSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberSearchButtonActionPerformed(evt);
            }
        });

        NewButton.setText("New");
        NewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewButtonActionPerformed(evt);
            }
        });

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        PizzaName_jList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Indian Apache", "Mexican Pepper Volcano", "All Day Breakfast", "Bacon Apache", "Buffalo", "Cajun Apache", "Chicken Apache", "Gerocino", "Hot Apache", "Sitting Bul", "Texas Beef Resta", "Tomahawk", "Vegetarian", "Wigwammer", "MAKE YOUR OWN" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(PizzaName_jList);

        jLabel1.setText("Name");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setText("Address");

        jLabel3.setText("Phone Number");

        FirstButton.setText("<<");
        FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstButtonActionPerformed(evt);
            }
        });

        PrevButton.setText("<");
        PrevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevButtonActionPerformed(evt);
            }
        });

        NextButton.setText(">");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        LastButton.setText(">>");
        LastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Special Requirements");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 255));
        jLabel5.setText("Order a Pizza");

        jLabel6.setText("Name");

        jLabel7.setText("Details");

        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Database");

        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Navigation");

        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Details");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 255));
        jLabel12.setText("Customer Details");

        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Search");

        rb_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Size"));

        buttonGroup1.add(PersonalRadioButton);
        PersonalRadioButton.setText("Personal");
        rb_Panel.add(PersonalRadioButton);

        buttonGroup1.add(LargeRadioButton);
        LargeRadioButton.setText("Large");
        rb_Panel.add(LargeRadioButton);

        buttonGroup1.add(MediumRadioButton);
        MediumRadioButton.setText("Medium");
        rb_Panel.add(MediumRadioButton);

        buttonGroup1.add(SmallRadioButton);
        SmallRadioButton.setText("Small");
        rb_Panel.add(SmallRadioButton);

        cb_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Extra Toppings"));

        TomatoesCheckBox.setText("Tomatoes");

        PineappleCheckBox.setText("Pineapple");

        OnionCheckBox.setText("Onion");

        MushroomsCheckBox.setText("Mushrooms");

        PepperoniCheckBox.setText("Pepperoni");

        JapelonsCheckBox.setText("Japelons");

        HamCheckBox.setText("Ham");

        SweetcornCheckBox.setText("Sweetcorn");

        SausageCheckBox.setText("Sausage");

        BaconCheckBox.setText("Bacon");

        ExtraCheeseCheckBox.setText("Extra Cheese");

        ChickenCheckBox.setText("Chicken");

        SalamiCheckBox.setText("Salami");

        GreenPeppersCheckBox.setText("Green Peppers");

        javax.swing.GroupLayout cb_PanelLayout = new javax.swing.GroupLayout(cb_Panel);
        cb_Panel.setLayout(cb_PanelLayout);
        cb_PanelLayout.setHorizontalGroup(
            cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cb_PanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cb_PanelLayout.createSequentialGroup()
                        .addGroup(cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChickenCheckBox)
                            .addComponent(BaconCheckBox)
                            .addComponent(SausageCheckBox)
                            .addComponent(HamCheckBox))
                        .addGap(18, 18, 18)
                        .addGroup(cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SweetcornCheckBox)
                            .addComponent(ExtraCheeseCheckBox)
                            .addComponent(GreenPeppersCheckBox)
                            .addComponent(SalamiCheckBox)))
                    .addGroup(cb_PanelLayout.createSequentialGroup()
                        .addGroup(cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PepperoniCheckBox)
                            .addComponent(OnionCheckBox)
                            .addComponent(TomatoesCheckBox))
                        .addGap(12, 12, 12)
                        .addGroup(cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PineappleCheckBox)
                            .addComponent(MushroomsCheckBox)
                            .addComponent(JapelonsCheckBox))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        cb_PanelLayout.setVerticalGroup(
            cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cb_PanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TomatoesCheckBox)
                    .addComponent(PineappleCheckBox))
                .addGap(5, 5, 5)
                .addGroup(cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OnionCheckBox)
                    .addComponent(MushroomsCheckBox))
                .addGap(5, 5, 5)
                .addGroup(cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PepperoniCheckBox)
                    .addComponent(JapelonsCheckBox))
                .addGap(5, 5, 5)
                .addGroup(cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HamCheckBox)
                    .addComponent(SweetcornCheckBox))
                .addGap(5, 5, 5)
                .addGroup(cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SausageCheckBox)
                    .addComponent(GreenPeppersCheckBox))
                .addGap(5, 5, 5)
                .addGroup(cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BaconCheckBox)
                    .addComponent(ExtraCheeseCheckBox))
                .addGap(5, 5, 5)
                .addGroup(cb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChickenCheckBox)
                    .addComponent(SalamiCheckBox)))
        );

        base_rb_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Base"));

        buttonGroup2.add(RegularRadioButton);
        RegularRadioButton.setText("Regular");

        buttonGroup2.add(ApacheRisingRadioButton);
        ApacheRisingRadioButton.setText("Apache Rising");

        buttonGroup2.add(ThinRadioButton);
        ThinRadioButton.setText("Thin");

        javax.swing.GroupLayout base_rb_PanelLayout = new javax.swing.GroupLayout(base_rb_Panel);
        base_rb_Panel.setLayout(base_rb_PanelLayout);
        base_rb_PanelLayout.setHorizontalGroup(
            base_rb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(base_rb_PanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(base_rb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ThinRadioButton)
                    .addComponent(ApacheRisingRadioButton)
                    .addComponent(RegularRadioButton)))
        );
        base_rb_PanelLayout.setVerticalGroup(
            base_rb_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(base_rb_PanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(RegularRadioButton)
                .addGap(5, 5, 5)
                .addComponent(ApacheRisingRadioButton)
                .addGap(5, 5, 5)
                .addComponent(ThinRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sauceJList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Original", "BBQ sauce", "No sauce", "Curry sauce" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(sauceJList);

        DetailsTextArea.setEditable(false);
        DetailsTextArea.setColumns(20);
        DetailsTextArea.setLineWrap(true);
        DetailsTextArea.setRows(5);
        jScrollPane5.setViewportView(DetailsTextArea);

        lblIndex.setText("0 of 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PlaceOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(93, 93, 93)
                                        .addComponent(jLabel2)))
                                .addGap(160, 160, 160))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PhoneNumberSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(NameSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SelectAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FirstButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(PrevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(lblIndex))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LastButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DeleteButton))
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(base_rb_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(cb_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelectAllButton))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameSearchButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PhoneNumberSearchButton)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cb_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(rb_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(base_rb_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FirstButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PrevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LastButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(lblIndex)))
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(25, 25, 25)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(PlaceOrderButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectAllButtonActionPerformed
      
        NextButton.setEnabled(true);
            
        PrevButton.setEnabled(true);
        FirstButton.setEnabled(true);
        LastButton.setEnabled(true);
        
        try{
        myCounter = 1;
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM customers where id = ?");
       // ps.setString(1, myCounter+"");
        
        ps.setInt(1, myCounter);
        ResultSet resultSet = ps.executeQuery();
        displayRecords(resultSet);
        
        }
        catch(SQLException e){
            e.printStackTrace();
        
        }
        
    }//GEN-LAST:event_SelectAllButtonActionPerformed

    public void getRecords(){
        
    
    }
    
    public void displayRecords( ResultSet   resultSet){

        
        try{
            //Customer cc = mycustomers.get(myCounter);
            ps = conn.prepareStatement("select * from customers where id = ?");
            ps.setInt(1, myCounter);
            
              resultSet = ps.executeQuery();
            
            if(!mycustomers.isEmpty()){
            
             
            String name = resultSet.getString("name");
            String phoneNumber = resultSet.getString("phoneNumber");
            String address = resultSet.getString("address");
            
            
            Customer cc = mycustomers.get(myCounter);
            mycustomers.add(cc);
            
            
       //     Customer customer = new Customer(name , phoneNumber , address );
         
       //     mycustomers.add(customer);
            
            }
            else{
                
                
            while(resultSet.next()){
            
            NameTextField.setText(resultSet.getString("name"));
            PhoneNumberTextField.setText(resultSet.getString("phoneNumber"));
            AddressTextField.setText(resultSet.getString("address"));
            
            //    NameTextField.setText(customer);
                
            }
            
            }
        }
        catch(SQLException e){
            System.out.println("Cannot display");
            e.printStackTrace();
        
        }
    }
    
    
    
    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
      
        this.dispose();
        new PizzaOrder().setVisible(true);
        
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void LastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastButtonActionPerformed
       
        myCounter = mycustomers.size() - 1;
        
    }//GEN-LAST:event_LastButtonActionPerformed

    private void NewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewButtonActionPerformed
        
     NameTextField.setText("");
     AddressTextField.setText("");
     PhoneNumberTextField.setText("");
     
    }//GEN-LAST:event_NewButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
    
           String getName = NameTextField.getText();
        String getAddress = AddressTextField.getText();
        String getPhoneNumber = PhoneNumberSearchButton.getText();
         
        try{
        PreparedStatement ps = conn.prepareStatement("insert into customers values(?, ?, ?)");
        
        ps.setString(1, getName);
        ps.setString(2, getAddress);
        ps.setString(3, getPhoneNumber);
        
        int result = ps.executeUpdate();// ps.executeQuery();
        
        if(result == 1){
            JOptionPane.showMessageDialog(this, "Save successful");
        }
        else{
             JOptionPane.showMessageDialog(this, "Save failed");
        }
        
        }
        
        catch(Exception e){
        
        }
        
        
        
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void PlaceOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderButtonActionPerformed
    
        String order = "";
        
        for(Component cc : rb_Panel.getComponents()){
        
            if(cc instanceof JRadioButton){
            
                JRadioButton jb = (JRadioButton)cc;
                
                if(jb.isSelected()){
               
                    order += jb.getText();
            
                }
            }
        }
        
        for(Component com : cb_Panel.getComponents()){
        
            if(com instanceof JCheckBox){
            
                JCheckBox jc = (JCheckBox)com;
                if(jc.isSelected()){
                order += ", " + jc.getText();
                }
            }
            
        }
        
        
        for(Component cc : base_rb_Panel.getComponents()){
        
            if(cc instanceof JRadioButton){
            
                JRadioButton jb = (JRadioButton)cc;
                
                if(jb.isSelected()){
                    
                    order += jb.getText();
                    
                }
                
            }
        
        }
 
        String options = sauceJList.getSelectedValuesList().toString().toLowerCase();
        
        options = options.substring(1, options.length() - 1);
        
        order += " " + options;
        
        
        String pizzaName = PizzaName_jList.getSelectedValuesList().toString().toLowerCase();
        
        pizzaName = pizzaName.substring(1, pizzaName.length() -1);
        
        order += ", " + pizzaName;
        
        
         DetailsTextArea.setText(order);
        
    }//GEN-LAST:event_PlaceOrderButtonActionPerformed

    private void NameSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameSearchButtonActionPerformed
     
        
        String getName = NameTextField.getText();
        
        if(getName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a name");
        }
           
        else{
        try{
            PreparedStatement ps = conn.prepareStatement("select * from customers where NAME like ?");
            ps.setString(1, getName);
            ResultSet resultSet = ps.executeQuery();
            displayRecords(resultSet);
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        }
          
        
    }//GEN-LAST:event_NameSearchButtonActionPerformed

    private void PhoneNumberSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberSearchButtonActionPerformed
     
        String getPhoneNumber = PhoneNumberTextField.getText();
        if(getPhoneNumber.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a phonenumber");
        }
        else{
        try{
            PreparedStatement ps = conn.prepareStatement("select * from customers where phoneNumber = ?");
            ps.setString(1, getPhoneNumber);
            ResultSet resultSet = ps.executeQuery();
            displayRecords(resultSet);
            //displayRecords(ps);
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        }
        
    }//GEN-LAST:event_PhoneNumberSearchButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
    
        String getName = NameTextField.getText();
        
        if(getName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a name");
        }
        else{
            try{
           
            PreparedStatement ps = conn.prepareStatement("Delete from customers where name = ?");
            ps.setString(1, getName);
            int result = ps.executeUpdate();
            if(result == 1){
            JOptionPane.showMessageDialog(this, "Delete successful");
            }
            else{
            JOptionPane.showMessageDialog(this, "Delete failed");
            }
            }
            
            catch(SQLException e){
                JOptionPane.showMessageDialog(this, "Cannot delete");
                e.printStackTrace();
                
            }
            
        }
        
        
        
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
      
        myCounter++;
        displayRecords(null);
        
    }//GEN-LAST:event_NextButtonActionPerformed

    private void PrevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevButtonActionPerformed
    
        if(myCounter < 0){
        
            myCounter = mycustomers.size() - 1;
        
        }
        else{
        myCounter--;
        }
        displayRecords(null);
    }//GEN-LAST:event_PrevButtonActionPerformed

    private void FirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstButtonActionPerformed
     
        myCounter = 0;
        
        
    }//GEN-LAST:event_FirstButtonActionPerformed

    public void searchDetails(PreparedStatement ps){
    
       // PreparedStatement ps = 
        
        
    }
    
    
    public static void main(String args[]) {
   
                new PizzaOrder().setVisible(true);
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JRadioButton ApacheRisingRadioButton;
    private javax.swing.JCheckBox BaconCheckBox;
    private javax.swing.JCheckBox ChickenCheckBox;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextArea DetailsTextArea;
    private javax.swing.JCheckBox ExtraCheeseCheckBox;
    private javax.swing.JButton FirstButton;
    private javax.swing.JCheckBox GreenPeppersCheckBox;
    private javax.swing.JCheckBox HamCheckBox;
    private javax.swing.JCheckBox JapelonsCheckBox;
    private javax.swing.JRadioButton LargeRadioButton;
    private javax.swing.JButton LastButton;
    private javax.swing.JRadioButton MediumRadioButton;
    private javax.swing.JCheckBox MushroomsCheckBox;
    private javax.swing.JButton NameSearchButton;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JButton NewButton;
    private javax.swing.JButton NextButton;
    private javax.swing.JCheckBox OnionCheckBox;
    private javax.swing.JCheckBox PepperoniCheckBox;
    private javax.swing.JRadioButton PersonalRadioButton;
    private javax.swing.JButton PhoneNumberSearchButton;
    private javax.swing.JTextField PhoneNumberTextField;
    private javax.swing.JCheckBox PineappleCheckBox;
    private javax.swing.JList PizzaName_jList;
    private javax.swing.JButton PlaceOrderButton;
    private javax.swing.JButton PrevButton;
    private javax.swing.JRadioButton RegularRadioButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JCheckBox SalamiCheckBox;
    private javax.swing.JCheckBox SausageCheckBox;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton SelectAllButton;
    private javax.swing.JRadioButton SmallRadioButton;
    private javax.swing.JCheckBox SweetcornCheckBox;
    private javax.swing.JRadioButton ThinRadioButton;
    private javax.swing.JCheckBox TomatoesCheckBox;
    private javax.swing.JPanel base_rb_Panel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JPanel cb_Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblIndex;
    private javax.swing.JPanel rb_Panel;
    private javax.swing.JList sauceJList;
    // End of variables declaration//GEN-END:variables
}
