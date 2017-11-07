package ex28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompaniesGUI extends javax.swing.JFrame {
    
Connection conn;
PreparedStatement ps;
ResultSet rs;

    public CompaniesGUI() {
        initComponents();
   
    try {
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost\\SD-12:1433;databaseName=USER","emmanuel" ,"manny" );
    } catch (SQLException ex) {
        System.out.println("Cannot connect!");
        ex.printStackTrace();
    }
            
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SelectAllButton = new javax.swing.JButton();
        LoadLocationsButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        LoadWebsiteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CompanyNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        WebsiteTextField = new javax.swing.JTextField();
        ContactNameTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        FirstButton = new javax.swing.JButton();
        PreviousButton = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        LastButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        StreetAddressTextArea = new javax.swing.JTextArea();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CommentTextArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        LanguagesTextArea = new javax.swing.JTextArea();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Companies for Work Experience");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 220, 30));

        SelectAllButton.setText("Select all Companies");
        getContentPane().add(SelectAllButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 160, 40));

        LoadLocationsButton.setText("Load Locations");
        getContentPane().add(LoadLocationsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 160, 40));

        SearchButton.setText("Search");
        getContentPane().add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 90, 30));

        LoadWebsiteButton.setText("Load Website");
        getContentPane().add(LoadWebsiteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 120, -1));

        jLabel2.setText("Company Locations");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, 20));

        jLabel3.setText("Company Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 90, -1));
        getContentPane().add(CompanyNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 170, 30));

        jLabel4.setText("Street Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 90, -1));
        getContentPane().add(WebsiteTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 140, -1));
        getContentPane().add(ContactNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 260, 20));
        getContentPane().add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 260, -1));

        FirstButton.setText("<<");
        getContentPane().add(FirstButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 50, 30));

        PreviousButton.setText("<");
        getContentPane().add(PreviousButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 50, 30));

        NextButton.setText(">");
        getContentPane().add(NextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 50, 30));

        LastButton.setText(">>");
        getContentPane().add(LastButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 50, 30));

        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 40, 20));

        jLabel7.setText("Contact Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel8.setText("Website");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel9.setText("Languages");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 70, -1));

        StreetAddressTextArea.setColumns(20);
        StreetAddressTextArea.setRows(5);
        jScrollPane4.setViewportView(StreetAddressTextArea);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 270, 40));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 180, 150, 200));

        CommentTextArea.setColumns(20);
        CommentTextArea.setRows(5);
        jScrollPane1.setViewportView(CommentTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 270, 40));

        jLabel10.setText("Comment");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        LanguagesTextArea.setColumns(20);
        LanguagesTextArea.setRows(5);
        jScrollPane2.setViewportView(LanguagesTextArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 270, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
   
                new CompaniesGUI().setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CommentTextArea;
    private javax.swing.JTextField CompanyNameTextField;
    private javax.swing.JTextField ContactNameTextField;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JButton FirstButton;
    private javax.swing.JTextArea LanguagesTextArea;
    private javax.swing.JButton LastButton;
    private javax.swing.JButton LoadLocationsButton;
    private javax.swing.JButton LoadWebsiteButton;
    private javax.swing.JButton NextButton;
    private javax.swing.JButton PreviousButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton SelectAllButton;
    private javax.swing.JTextArea StreetAddressTextArea;
    private javax.swing.JTextField WebsiteTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
