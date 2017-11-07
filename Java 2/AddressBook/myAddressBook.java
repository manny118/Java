package ex27;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class myAddressBook extends javax.swing.JFrame {
   
     Connection conn;
    
      int rowcount;
      
    private ArrayList<Person> listOfPeople = new ArrayList<>();
    private  int myCounter = 0 ;
    private int currentPositionInList;
  
    public myAddressBook() {
        
        initComponents();
        IDTextField.setEnabled(false);
        FirstRecordButton.setEnabled(false);
        LastRecordButton.setEnabled(false);
        
    
        try {
          conn = DriverManager.getConnection("jdbc:sqlserver://localhost\\SD-12:1433;databaseName=USER","emmanuel" ,"manny" );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
            ex.printStackTrace();
        }
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LastNameSearchTextField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LastNameTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        PhoneNumberTextField = new javax.swing.JTextField();
        SelectAllButton = new javax.swing.JButton();
        InsertButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        ClearAllButton = new javax.swing.JButton();
        FirstRecordButton = new javax.swing.JButton();
        PreviousRecordButton = new javax.swing.JButton();
        NextRecordButton = new javax.swing.JButton();
        LastRecordButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Last Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, -1));
        getContentPane().add(LastNameSearchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 110, -1));

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 100, -1));

        jLabel2.setText("Address Book Entries");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 20));

        jLabel3.setText("ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 20, -1));

        jLabel4.setText("First Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, -1));

        jLabel5.setText("Last Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, -1));

        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, -1));

        jLabel7.setText("Phone Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel8.setText("Navigation");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));
        getContentPane().add(LastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 150, -1));
        getContentPane().add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 150, -1));
        getContentPane().add(PhoneNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 150, -1));

        SelectAllButton.setText("Select All");
        SelectAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectAllButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SelectAllButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 120, -1));

        InsertButton.setText("Insert");
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });
        getContentPane().add(InsertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 120, -1));

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 120, -1));

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 120, -1));

        ClearAllButton.setText("Clear all TextFields");
        ClearAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearAllButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearAllButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        FirstRecordButton.setText("<<");
        FirstRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstRecordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FirstRecordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 50, -1));

        PreviousRecordButton.setText("<");
        PreviousRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousRecordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PreviousRecordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 50, -1));

        NextRecordButton.setText(">");
        NextRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextRecordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NextRecordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 290, 50, -1));

        LastRecordButton.setText(">>");
        LastRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastRecordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LastRecordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 50, -1));

        jLabel9.setText("Search for Last Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Address Book");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 90, 20));
        getContentPane().add(IDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 150, -1));
        getContentPane().add(firstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed

        String getFirstName = firstNameTextField.getText();
        String getLastName = LastNameTextField.getText();
        String getEmail = EmailTextField.getText();
        String getPhoneNumber = PhoneNumberTextField.getText();
        
        try{
            
        if(getFirstName.length() != 0 && getLastName.length() != 0){
        
            
        String sql = "insert into AddressBook values(?, ?, ?, ?)";
       PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, getFirstName);
        ps.setString(2, getLastName);
        ps.setString(3, getEmail);
        ps.setString(4, getPhoneNumber);
       
         rowcount = ps.executeUpdate();
        
        if (rowcount == 1){
         JOptionPane.showMessageDialog(null, "User Added");
         IDTextField.setText("");                 
         firstNameTextField.setText("");                  
         LastNameTextField.setText("");                  
         EmailTextField.setText("");                  
         PhoneNumberTextField.setText("");             
         LastNameSearchTextField.setText("");

       
        }
        else{
             JOptionPane.showMessageDialog(null, "Please enter first name and last name");          
        }
       
        }
         
        }
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Insert failed!");
        ex.printStackTrace();
        }
        
    }//GEN-LAST:event_InsertButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
      
        rowcount = 0;
        String getId = IDTextField.getText();
        String sql = "Delete from AddressBook where id = ?";
        
        try{
        
       PreparedStatement  ps = conn.prepareStatement(sql);
        
         ps.setString(1, getId);
     
         rowcount  = ps.executeUpdate();
          
          if(rowcount == 1){
            JOptionPane.showMessageDialog(null, "Delete Successful");
            IDTextField.setText("");                 
            firstNameTextField.setText("");                  
            LastNameTextField.setText("");                  
            EmailTextField.setText("");                  
            PhoneNumberTextField.setText("");             
            LastNameSearchTextField.setText("");
          
          }
          else{
               JOptionPane.showMessageDialog(null, "Delete Failed");
          } 
        
        
        }
        
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Cannot delete");
        ex.printStackTrace();
        }
        
        
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
       
       String id = IDTextField.getText();
       String getFirstName = firstNameTextField.getText();
       String getLastName = LastNameTextField.getText();
       String getEmail = EmailTextField.getText();
       String getPhoneNumber = PhoneNumberTextField.getText();
        
       String sql = "update AddressBook set firstName = ?, lastName = ?, email = ?, phoneNumber = ? where ID = ?";
        try{
      
          PreparedStatement    ps = conn.prepareStatement(sql);
            
          ps.setString(1,  getFirstName);
          ps.setString(2, getLastName);
          ps.setString(3, getEmail);
          ps.setString(4, getPhoneNumber);
          ps.setString(5, id);
          rowcount  = ps.executeUpdate();
          
          if(rowcount == 1){
            JOptionPane.showMessageDialog(null, "Update Successful");
          
          }
          else{
               JOptionPane.showMessageDialog(null, "Update Failed");
          }
          
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Not updated!");
           
        ex.printStackTrace();
        }
        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
  
          String getLastName = LastNameSearchTextField.getText();
        
          listOfPeople.clear();
        
          currentPositionInList = 0;
        
          try {            
              String sql = "select * from AddressBook where lastName = ?";        
            PreparedStatement  ps = conn.prepareStatement(sql);            
              ps.setString(1, getLastName);           
           
              ResultSet   resultSet = ps.executeQuery();
           
              showDetails(resultSet);
              displayDetails();
              
          } catch (SQLException ex) {
              System.out.println("Can't search");   ex.printStackTrace();              
          }
        
    }//GEN-LAST:event_SearchButtonActionPerformed

    
    public void showDetails(ResultSet resultSet){
    
          try {
              
              while(resultSet.next()){
                  
                  int id = resultSet.getInt("ID");
                  String firstName = resultSet.getString("firstName");
                  String lastName = resultSet.getString("lastName");
                  String email = resultSet.getString("email");
                  String phoneNumber = resultSet.getString("phoneNumber");
                  
                  //   currentPositionInList = id;
                  
                  ///Person pp = 
                  
                  Person p1 = new Person(id, firstName, lastName, email, phoneNumber);
                  listOfPeople.add(p1);
                  
              }   } catch (SQLException ex) {
                  System.out.println("Details cannot be shown");
                  ex.printStackTrace();
          }
    
    }

    
    public void displayDetails(){
   
                  IDTextField.setText("");
                  firstNameTextField.setText("");
                  LastNameTextField.setText("");
                  EmailTextField.setText("");
                  PhoneNumberTextField.setText("");
             
                  if(!listOfPeople.isEmpty()){                
                      
                      Person p =   listOfPeople.get(myCounter);             
                      
                      IDTextField.setText(Integer.toString(p.getID()));  
       
                    //  firstNameTextField.setText(listOfPeople.get(0).getFirstName());
                      firstNameTextField.setText(p.getFirstName());                      
                      LastNameTextField.setText(p.getLastName());                     
                      EmailTextField.setText(p.getEmail());                      
                      PhoneNumberTextField.setText(p.getPhoneNumber());                   
                      
                  }
                  else{JOptionPane.showMessageDialog(null, "There's no one in the list");                }          
          
    }
    
    private void SelectAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectAllButtonActionPerformed
      
             
        FirstRecordButton.setEnabled(true);
        LastRecordButton.setEnabled(true);
        
          try {
              listOfPeople.clear();
              myCounter =0;
            
           PreparedStatement   ps = conn.prepareStatement("select * from AddressBook");
          
            ResultSet  resultSet = ps.executeQuery();
              showDetails(resultSet);     
              displayDetails();
            
          }
          catch(SQLException e){
          e.printStackTrace();
          }
          
    }//GEN-LAST:event_SelectAllButtonActionPerformed

    private void ClearAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearAllButtonActionPerformed
      
        IDTextField.setText("");                
        firstNameTextField.setText("");                 
        LastNameTextField.setText("");                 
        EmailTextField.setText("");                
        PhoneNumberTextField.setText("");           
        LastNameSearchTextField.setText("");      
        firstNameTextField.requestFocus();
        
    }//GEN-LAST:event_ClearAllButtonActionPerformed

 
    public myAddressBook(Connection conn, Statement ss, PreparedStatement ps, ResultSet resultSet, int currentPositionInList, JButton ClearAllButton, JButton DeleteButton, JTextField EmailTextField, JButton FirstRecordButton, JTextField IDTextField, JButton InsertButton, JTextField LastNameSearchTextField, JTextField LastNameTextField, JButton LastRecordButton, JButton NextRecordButton, JTextField PhoneNumberTextField, JButton PreviousRecordButton, JButton SearchButton, JButton SelectAllButton, JButton UpdateButton, JTextField firstNameTextField, JLabel jLabel1, JLabel jLabel10, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel6, JLabel jLabel7, JLabel jLabel8, JLabel jLabel9) throws HeadlessException {
        this.conn = conn;
//        this.ss = ss;
//        this.ps = ps;
//        this.resultSet = resultSet;
        this.currentPositionInList = currentPositionInList;
        this.ClearAllButton = ClearAllButton;
        this.DeleteButton = DeleteButton;
        this.EmailTextField = EmailTextField;
        this.FirstRecordButton = FirstRecordButton;
        this.IDTextField = IDTextField;
        this.InsertButton = InsertButton;
        this.LastNameSearchTextField = LastNameSearchTextField;
        this.LastNameTextField = LastNameTextField;
        this.LastRecordButton = LastRecordButton;
        this.NextRecordButton = NextRecordButton;
        this.PhoneNumberTextField = PhoneNumberTextField;
        this.PreviousRecordButton = PreviousRecordButton;
        this.SearchButton = SearchButton;
        this.SelectAllButton = SelectAllButton;
        this.UpdateButton = UpdateButton;
        this.firstNameTextField = firstNameTextField;
        this.jLabel1 = jLabel1;
        this.jLabel10 = jLabel10;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel6 = jLabel6;
        this.jLabel7 = jLabel7;
        this.jLabel8 = jLabel8;
        this.jLabel9 = jLabel9;
    }
    
    
    private void FirstRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstRecordButtonActionPerformed
 
        myCounter = 0;
      
        displayDetails();
    
    }//GEN-LAST:event_FirstRecordButtonActionPerformed

    private void LastRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastRecordButtonActionPerformed
          
        
        myCounter = listOfPeople.size() - 1;
        
            displayDetails();
       
    }//GEN-LAST:event_LastRecordButtonActionPerformed

    private void NextRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextRecordButtonActionPerformed

        myCounter = myCounter+1;
        
        if(myCounter == listOfPeople.size()){
            
                myCounter = 0;
         
                displayDetails();
            }
            else{
            
                displayDetails();
            }
    }//GEN-LAST:event_NextRecordButtonActionPerformed

    
    private void PreviousRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousRecordButtonActionPerformed
     
        
              myCounter = myCounter-1;

              if(myCounter < 0 ){
            
                myCounter = listOfPeople.size()  - 1;
           
                displayDetails();
        
            }
            else{
          
                displayDetails();
        
            }
     
    }//GEN-LAST:event_PreviousRecordButtonActionPerformed

  
    
    public static void main(String args[]) {
     
                new myAddressBook().setVisible(true);
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearAllButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JButton FirstRecordButton;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JButton InsertButton;
    private javax.swing.JTextField LastNameSearchTextField;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JButton LastRecordButton;
    private javax.swing.JButton NextRecordButton;
    private javax.swing.JTextField PhoneNumberTextField;
    private javax.swing.JButton PreviousRecordButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton SelectAllButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTextField firstNameTextField;
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
    // End of variables declaration//GEN-END:variables
}
