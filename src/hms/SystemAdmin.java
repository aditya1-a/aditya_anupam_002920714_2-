/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hms;

import model.DoctorDirectory;
import model.DoctorModel;
import model.HospitalDirectory;
import model.PatientDirectory;


/**
 *
 * @author anupamaditya
 */
public class SystemAdmin extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdmin
     */
    
    DoctorDirectory DocDirectory;
    PatientDirectory PatDirectory;
    HospitalDirectory HospDirectory;
  
    
    public SystemAdmin() {
        initComponents();
        
        DocDirectory = new DoctorDirectory();
        PatDirectory  = new PatientDirectory();
        HospDirectory = new HospitalDirectory();
        
//        DocDirectory = new DoctorDirectory();
//        PatDirectory = new PatientDirectory();
//        HospDirectory = new HospitalDirectory();
    }

//    SystemAdmin(DoctorDirectory DocDirectory) {
//       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//       initComponents();
//       this.DocDirectory = DocDirectory;
//      
//       
//    }

//    SystemAdmin(PatientDirectory PatDirectory, HospitalDirectory HospDirectory, DoctorDirectory DocDirectory ) {
//        initComponents();
//        this.PatDirectory = PatDirectory;
//        this.HospDirectory = HospDirectory;
//        this.DocDirectory = DocDirectory;
//    }

//    SystemAdmin(HospitalDirectory HospDirectory) {
//        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        initComponents();
//        this.HospDirectory = HospDirectory;
//    }

//    SystemAdmin(PatientDirectory PatDirectory, HospitalDirectory HospDirectory, DoctorDirectory DocDirectory) {
//        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        initComponents();
//        this.PatDirectory = PatDirectory;
//        this.DocDirectory = DocDirectory;
//        this.HospDirectory = HospDirectory;
//        
//    }

//    SystemAdmin(HospitalDirectory HospDirectory, DoctorDirectory DocDirectory, PatientDirectory PatDirectory) {
//        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        initComponents();
//        this.PatDirectory = PatDirectory;
//        this.DocDirectory = DocDirectory;
//        this.HospDirectory = HospDirectory;
//        
//    }

//    SystemAdmin(HospitalDirectory HospDirectory, DoctorDirectory DocDirectory) {
//        initComponents();
//        
//        this.HospDirectory = HospDirectory;
//        this.DocDirectory = DocDirectory;
//    }

//    SystemAdmin(DoctorDirectory DocDirectory, HospitalDirectory HospDirectory) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

//    SystemAdmin(DoctorDirectory DocDirectory, HospitalDirectory HospDirectory) {
//       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        initComponents();
//        
//    }

    SystemAdmin(DoctorDirectory DocDirectory, HospitalDirectory HospDirectory, PatientDirectory PatDirectory) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        initComponents();
        this.PatDirectory = PatDirectory;
        this.HospDirectory = HospDirectory;
        this.DocDirectory = DocDirectory;
        
    }

    

   

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JHospitalDetailsBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JPatientDetailsBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JDoctorDetailAdminButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        JHospitalDetailsBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JHospitalDetailsBtn.setForeground(new java.awt.Color(0, 102, 153));
        JHospitalDetailsBtn.setText("Hospital Details");
        JHospitalDetailsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JHospitalDetailsBtnMouseClicked(evt);
            }
        });
        jPanel1.add(JHospitalDetailsBtn);
        JHospitalDetailsBtn.setBounds(1030, 570, 150, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/hospital.png")); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1040, 420, 140, 140);

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255), 4));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1010, 400, 190, 220);

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/patient-3.png")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(640, 410, 140, 140);

        JPatientDetailsBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JPatientDetailsBtn.setForeground(new java.awt.Color(0, 102, 153));
        JPatientDetailsBtn.setText("Patient Details");
        JPatientDetailsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPatientDetailsBtnMouseClicked(evt);
            }
        });
        JPatientDetailsBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JPatientDetailsBtnKeyPressed(evt);
            }
        });
        jPanel1.add(JPatientDetailsBtn);
        JPatientDetailsBtn.setBounds(630, 570, 150, 40);

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255), 4));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(610, 400, 190, 220);

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/doctor-2.png")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 420, 140, 140);

        JDoctorDetailAdminButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JDoctorDetailAdminButton.setForeground(new java.awt.Color(0, 102, 153));
        JDoctorDetailAdminButton.setText("Doctor Details");
        JDoctorDetailAdminButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JDoctorDetailAdminButtonMouseClicked(evt);
            }
        });
        jPanel1.add(JDoctorDetailAdminButton);
        JDoctorDetailAdminButton.setBounds(240, 570, 150, 40);

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255), 4));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 400, 190, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/anupamaditya/Downloads/Temp-1700x900.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-40, -200, 1580, 1240);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1537, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JDoctorDetailAdminButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JDoctorDetailAdminButtonMouseClicked
        // TODO add your handling code here:
        DoctorDetailsAdmin DDA = new DoctorDetailsAdmin(DocDirectory, HospDirectory, PatDirectory);
        DDA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JDoctorDetailAdminButtonMouseClicked

    private void JPatientDetailsBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPatientDetailsBtnKeyPressed
        // TODO add your handling code here:
    
        
    }//GEN-LAST:event_JPatientDetailsBtnKeyPressed

    private void JPatientDetailsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPatientDetailsBtnMouseClicked
        // TODO add your handling code here:
        PatientDetailsAdmin PDA = new PatientDetailsAdmin(DocDirectory, HospDirectory, PatDirectory);
        PDA.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_JPatientDetailsBtnMouseClicked

    private void JHospitalDetailsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JHospitalDetailsBtnMouseClicked
        // TODO add your handling code here:
        HospitalDetailsAdmin HDA = new HospitalDetailsAdmin(DocDirectory, HospDirectory, PatDirectory);
        HDA.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_JHospitalDetailsBtnMouseClicked

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
            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JDoctorDetailAdminButton;
    private javax.swing.JButton JHospitalDetailsBtn;
    private javax.swing.JButton JPatientDetailsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
