/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hms;

import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DoctorDirectory;
import model.DocData;
import model.House;
import model.City;
import model.Community;
import model.HospitalDirectory;
import model.PatientDirectory;

/**
 *
 * @author anupamaditya
 */


public class AddDoctorDetails1 extends javax.swing.JFrame {

    /**
     * Creates new form AddDoctorDetails1
     */
    
    DoctorDirectory DocDirectory;
    HospitalDirectory HospDirectory;
    PatientDirectory PatDirectory;
 

    
//    public AddDoctorDetails1(DoctorDirectory DocDirectory) {
//        initComponents();
//        
//        this.DocDirectory = DocDirectory;   //we are pushing whole reference to DoctorDirectory
//        
//    }
    
    
    private AddDoctorDetails1() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       initComponents();
    }

//    AddDoctorDetails1(DoctorDirectory DocDirectory, HospitalDirectory HospDirectory) {
//       //new throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//       initComponents();
//       this.DocDirectory = DocDirectory;
//    }

    AddDoctorDetails1(DoctorDirectory DocDirectory, HospitalDirectory HospDirectory, PatientDirectory PatDirectory) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         initComponents();
         this.DocDirectory = DocDirectory;
         this.HospDirectory = HospDirectory;
         this.PatDirectory = PatDirectory;
         
       
    }

    
    

   

//    AddDoctorDetails1(DoctorDirectory DocDirectory, HospitalDirectory HospDirectory, PatientDirectory PatDirectory) {
//        initComponents();
//        
//        this.DocDirectory = DocDirectory;   //we are pushing whole reference to DoctorDirectory
//        this.PatDirectory = PatDirectory;
//        this.HospDirectory = HospDirectory;
//    }

    
//    AddDoctorDetails1(DoctorDirectory DocDirectory, HospitalDirectory HospDirectory, PatientDirectory PatDirectory) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

//    AddDoctorDetails1(DoctorDirectory DocDirectory, HospitalDirectory HospDirectory, PatientDirectory PatDirectory) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JDocID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JFNameDoc = new javax.swing.JTextField();
        JLNameDoc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JAgeDoc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JBGroupDoc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JGenderDoc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        JDepartmentDoc = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        JAddressDoc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JPhoneNoDoc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JCityDoc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JJoiningDateDoc = new com.toedter.calendar.JDateChooser();
        JSaveDocButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        JBackAddDoctorButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        JPinCode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        JCommunityDoc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        JCountryDoc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Joining date");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 90, 40));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Doctor ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 70, 30));
        jPanel1.add(JDocID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 160, 30));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, 30));

        JFNameDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JFNameDocKeyPressed(evt);
            }
        });
        jPanel1.add(JFNameDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 160, 30));

        JLNameDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JLNameDocKeyPressed(evt);
            }
        });
        jPanel1.add(JLNameDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 160, 30));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 90, 30));

        JAgeDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JAgeDocKeyPressed(evt);
            }
        });
        jPanel1.add(JAgeDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 160, 30));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Age");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 70, 30));
        jPanel1.add(JBGroupDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 160, 30));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Blood Group");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 100, 30));

        JGenderDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other", " ", " " }));
        JGenderDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JGenderDocActionPerformed(evt);
            }
        });
        jPanel1.add(JGenderDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 160, 30));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 80, 30));

        JDepartmentDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JDepartmentDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDepartmentDocActionPerformed(evt);
            }
        });
        jPanel1.add(JDepartmentDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 160, 30));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Department");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 100, 40));
        jPanel1.add(JAddressDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 260, 30));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Street Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 110, 40));

        JPhoneNoDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JPhoneNoDocKeyPressed(evt);
            }
        });
        jPanel1.add(JPhoneNoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 150, 30));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone No");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 80, 40));
        jPanel1.add(JCityDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 160, 30));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("City");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 80, 40));
        jPanel1.add(JJoiningDateDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 150, 30));

        JSaveDocButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JSaveDocButton.setForeground(new java.awt.Color(0, 102, 153));
        JSaveDocButton.setText("Save");
        JSaveDocButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JSaveDocButtonMouseClicked(evt);
            }
        });
        jPanel1.add(JSaveDocButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 670, 150, 30));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Doctor's Details");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 80));

        JBackAddDoctorButton.setBackground(new java.awt.Color(0, 153, 204));
        JBackAddDoctorButton.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/undo-2.png")); // NOI18N
        JBackAddDoctorButton.setText("Back");
        JBackAddDoctorButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBackAddDoctorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBackAddDoctorButtonMouseClicked(evt);
            }
        });
        JBackAddDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBackAddDoctorButtonActionPerformed(evt);
            }
        });
        jPanel1.add(JBackAddDoctorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 150, 80));

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PinCode");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 90, 30));
        jPanel1.add(JPinCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 150, 30));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 600, 90, 30));
        jPanel1.add(JEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 600, 160, 30));

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Community");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 160, 100, 30));

        JCommunityDoc.setToolTipText("");
        jPanel1.add(JCommunityDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 160, 140, 30));

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Country");
        jLabel16.setToolTipText("");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 240, 80, 30));
        jPanel1.add(JCountryDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 240, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1201, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JDepartmentDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDepartmentDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JDepartmentDocActionPerformed

    private void JBackAddDoctorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBackAddDoctorButtonMouseClicked
        // TODO add your handling code here:
       // DoctorDetailsAdmin DDA = new DoctorDetailsAdmin();
        //DDA.setVisible(true);
    }//GEN-LAST:event_JBackAddDoctorButtonMouseClicked

    private void JGenderDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JGenderDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JGenderDocActionPerformed

    private void JSaveDocButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JSaveDocButtonMouseClicked
        // TODO add your handling code here:
        
        String docID = JDocID.getText();
        String fname = JFNameDoc.getText();
        String lname = JLNameDoc.getText();
        int age = Integer.parseInt(JAgeDoc.getText());
        String gender = JGenderDoc.getSelectedItem().toString();
        String department = JDepartmentDoc.getSelectedItem().toString();
        String streetaddress = JAddressDoc.getText();
        String pincode = JPinCode.getText();
        String bloodgroup = JBGroupDoc.getText();
        String phoneNo = JPhoneNoDoc.getText();
        String city = JCityDoc.getText();
        String community = JCommunityDoc.getText();
        String country = JCountryDoc.getText();
        Date JoiningDate = JJoiningDateDoc.getDate();
        String email = JEmail.getText();
        int length = phoneNo.length();
      
  
        
        //DocData dd = DocDirectory.addNewDocData();
        if (docID.isEmpty() || fname.isEmpty()|| lname.isEmpty() ||/* age.isEmpty()||*/ bloodgroup.isEmpty() 
                || gender.isEmpty() || department.isEmpty() || streetaddress.isEmpty() || 
                /*phoneNo.isEmpty() || */ city.isEmpty() || email.isEmpty() || community.isEmpty() || country.isEmpty()/*|| JoiningDate.isEmpty()*/){
            JOptionPane.showMessageDialog(this,
                    "Please enter all fields",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE); 
            
                }
        else if(length<10){
            JOptionPane.showMessageDialog(this,
                    "Please enter cell no of 10 digits",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);
           
        }
        else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", email))) 
{
            JOptionPane.showMessageDialog(null,
                    "Please enter a valid email",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        else{
        DocData dd = DocDirectory.addNewDocData();
        dd.setFName(fname);
        dd.setLName(lname);
        dd.setDocID(docID);
        dd.setBloodgroup(bloodgroup);
        dd.setDepartment(department);
        dd.setGender(gender);
        dd.setAge(age);
        dd.setPhoneNo(phoneNo);
        
        House docHouse = new House();
        docHouse.setStreetAddress(streetaddress);
        dd.setHouse(docHouse);
        
        City docCity = new City();
        docCity.setCity(city);
        dd.setCity(docCity);
        
        Community docCommunity = new Community();
        docCommunity.setCommunityName(community);               
        dd.setCommunity(docCommunity);
        
        Community docpincode = new Community();
        docpincode.setPincode(pincode);
        dd.setPincode(docpincode);
        
        //docCommunity.setPincode(pincode);   
        City docCountry = new City();
        docCountry.setCountry(country);
        dd.setCountry(docCountry);
        
        dd.setJoiningDate(JoiningDate);
        dd.setEmailAddress(email);
        
        
         
        JOptionPane.showMessageDialog(this, "New record added");
        
        
            JDocID.setText("");
            JFNameDoc.setText("");
            JLNameDoc.setText("");
            JAgeDoc.setText("");
            JBGroupDoc.setText("");
            JGenderDoc.setSelectedIndex(0);
            JDepartmentDoc.setSelectedIndex(0);
            JCityDoc.setText("");
            JAddressDoc.setText("");
            JPhoneNoDoc.setText("");
            JPinCode.setText("");
            JEmail.setText("");
            JCountryDoc.setText("");
            JCommunityDoc.setText("");
        
        }
        //String DocID = JDocID.getText();
        //String FName
        
       /*
        DoctorDirectory DocDirectory = new DoctorDirectory();
        DocDirectory.setDocID(JDocID.getText());
        DocDirec.setFNameDoc(JFNameDoc.getText());
        DocDirec.setLNameDoc(JLNameDoc.getText());
        DocDirec.setAgeDoc(Integer.parseInt(JAgeDoc.getText()));
        DocDirec.setBGroupDoc(JBGroupDoc.getText());
        DocDirec.setGenderDoc(JGenderDoc.getSelectedItem().toString());
        DocDirec.setDepartmentDoc(JDepartmentDoc.getSelectedItem().toString());
        DocDirec.setAddressDoc(JAddressDoc.getText());
        DocDirec.setCityDoc(JCityDoc.getText());
        DocDirec.setPhoneNoDoc(Integer.parseInt(JPhoneNoDoc.getText()));
        DocDirec.setJoiningDateDoc(JJoiningDateDoc.getDate());
        
     */   
       
       /*
         if (DocDirec.getDocID().isEmpty() || DocDirec.getFNameDoc().isEmpty()|| DocDirec.getLNameDoc().isEmpty() || /*DocDirec.getAgeDoc().isEmpty()|| DocDirec.getBGroupDoc().isEmpty() 
                || DocDirec.getGenderDoc().isEmpty() || DocDirec.getDepartmentDoc().isEmpty() || DocDirec.getAddressDoc().isEmpty() || 
                DocDirec.getPhoneNoDoc().isEmpty() ||  DocDirec.getCityDoc().isEmpty() /*|| DocDirec.getJoiningDateDoc().isEmpty)){
            JOptionPane.showMessageDialog(this,
                    "Please enter all fields",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);
        } else if(DocDirec.getPhoneNoDoc()<10){
            JOptionPane.showMessageDialog(this,
                    "Please enter cell no of 10 digits",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE); 
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Doctor Details Added");
            
            JDocID.setText("");
            JFNameDoc.setText("");
            JLNameDoc.setText("");
            JAgeDoc.setText("");
            JBGroupDoc.setText("");
            JGenderDoc.setSelectedIndex(0);
            JDepartmentDoc.setSelectedIndex(0);
            JCityDoc.setText("");
            JAddressDoc.setText("");
            JPhoneNoDoc.setText("");          
            
            
        }
        
        /*else {
            ViewDoctorDetails Vdd = new ViewDoctorDetails();
            DefaultTableModel model = (DefaultTableModel) Vdd.JTableDoc.getModel();
            model.addRow( new Object[] {name, empid, age, gender, date, level, teaminfo, 
                positiontitle, cellphoneno, email, ImageLabel});
            
            TFName.setText("");
            TFEmpID.setText("");
            TFAge.setText("");
            TFGender.setSelectedIndex(0);
            //TFDateChooser.setDate("yyyy-MM-dd");
            //TFDateChooser.setCalendar(null);
            TFLevel.setSelectedIndex(0);
            TFTeamInfo.setText("");
            TFPositionTitle.setText("");
            TFCellPhoneNo.setText("");
            TFEmailAdd.setText("");
            image_txt.setText("");
          
        } 
        */
        
        
    }//GEN-LAST:event_JSaveDocButtonMouseClicked

    private void JBackAddDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBackAddDoctorButtonActionPerformed
        // TODO add your handling code here:
  
        
        DoctorDetailsAdmin DDA = new DoctorDetailsAdmin(DocDirectory, HospDirectory, PatDirectory);
        DDA.setVisible(true); 
    }//GEN-LAST:event_JBackAddDoctorButtonActionPerformed

    private void JPhoneNoDocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPhoneNoDocKeyPressed
        // TODO add your handling code here:
        try{
        String CellNumber = JPhoneNoDoc.getText();
        int length = CellNumber.length();
        char c = evt.getKeyChar();
        
        //check for number 0 to 9
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            //check for length not more than 10 digit
            if(length<10){
                JPhoneNoDoc.setEditable(true);
                
            } else{
                JPhoneNoDoc.setEditable(false);
            }
        }else{
            if (evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                JPhoneNoDoc.setEditable(true);
            } else{
                JPhoneNoDoc.setEditable(false);
            }
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_JPhoneNoDocKeyPressed

    private void JAgeDocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JAgeDocKeyPressed
        // TODO add your handling code here:
        String CellNumber = JAgeDoc.getText();
        int length = CellNumber.length();
        char c = evt.getKeyChar();
        
        //check for number 0 to 1
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            //check for length not more than 2 digit
            if(length<2){
                JAgeDoc.setEditable(true);
                
            } else{
                JAgeDoc.setEditable(false);
            }
        }else{
            if (evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                JAgeDoc.setEditable(true);
            } else{
                JAgeDoc.setEditable(false);
            }
        }
    }//GEN-LAST:event_JAgeDocKeyPressed

    private void JFNameDocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JFNameDocKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c )|| Character.isISOControl(c)){
            JFNameDoc.setEditable(true);
        } else {
            JFNameDoc.setEditable(false);
        }
    }//GEN-LAST:event_JFNameDocKeyPressed

    private void JLNameDocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JLNameDocKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c )|| Character.isISOControl(c)){
            JLNameDoc.setEditable(true);
        } else {
            JLNameDoc.setEditable(false);
        }
    }//GEN-LAST:event_JLNameDocKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddDoctorDetails1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDoctorDetails1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDoctorDetails1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDoctorDetails1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDoctorDetails1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JAddressDoc;
    private javax.swing.JTextField JAgeDoc;
    private javax.swing.JTextField JBGroupDoc;
    private javax.swing.JButton JBackAddDoctorButton;
    private javax.swing.JTextField JCityDoc;
    private javax.swing.JTextField JCommunityDoc;
    private javax.swing.JTextField JCountryDoc;
    private javax.swing.JComboBox<String> JDepartmentDoc;
    private javax.swing.JTextField JDocID;
    private javax.swing.JTextField JEmail;
    private javax.swing.JTextField JFNameDoc;
    private javax.swing.JComboBox<String> JGenderDoc;
    private com.toedter.calendar.JDateChooser JJoiningDateDoc;
    private javax.swing.JTextField JLNameDoc;
    private javax.swing.JTextField JPhoneNoDoc;
    private javax.swing.JTextField JPinCode;
    private javax.swing.JButton JSaveDocButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
