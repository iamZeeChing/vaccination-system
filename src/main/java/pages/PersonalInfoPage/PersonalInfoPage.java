/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.pages.PersonalInfoPage;

import main.java.ApplicationContext;
import main.java.models.User;
import main.java.pages.BasePage;
import main.java.services.UserService;

import java.io.FileNotFoundException;

/**
 *
 * @author Zhi Yan
 */
public class PersonalInfoPage extends BasePage {

    /**
     * Creates new form CPage3
     */
    public PersonalInfoPage(ApplicationContext applicationContext) throws FileNotFoundException {
        super(applicationContext);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    public void initComponents() {

        jPanel_main = new javax.swing.JPanel();
        jPanel_personal_info = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_area_main = new javax.swing.JTextArea();
        btn_people_account = new javax.swing.JButton();
        btn_get_personal_info = new javax.swing.JButton();
        VacAppoint = new javax.swing.JButton();
        Supply = new javax.swing.JButton();
        StatRe = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_main.setBackground(new java.awt.Color(0, 102, 102));

        jPanel_personal_info.setBackground(new java.awt.Color(204, 204, 204));

        text_area_main.setColumns(20);
        text_area_main.setRows(5);
        jScrollPane1.setViewportView(text_area_main);

        javax.swing.GroupLayout jPanel_personal_infoLayout = new javax.swing.GroupLayout(jPanel_personal_info);
        jPanel_personal_info.setLayout(jPanel_personal_infoLayout);
        jPanel_personal_infoLayout.setHorizontalGroup(
            jPanel_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_personal_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel_personal_infoLayout.setVerticalGroup(
            jPanel_personal_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_personal_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_people_account.setBackground(new java.awt.Color(102, 102, 102));
        btn_people_account.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn_people_account.setForeground(new java.awt.Color(255, 255, 255));
        btn_people_account.setText("People Account");
        btn_people_account.setToolTipText("");
        btn_people_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeToPeopleAccountPage(evt);
            }
        });

        btn_get_personal_info.setBackground(new java.awt.Color(102, 102, 102));
        btn_get_personal_info.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn_get_personal_info.setForeground(new java.awt.Color(255, 255, 255));
        btn_get_personal_info.setText("Personal Info");
        btn_get_personal_info.setToolTipText("");
        btn_get_personal_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    get_personal_info(evt);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        VacAppoint.setBackground(new java.awt.Color(102, 102, 102));
        VacAppoint.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        VacAppoint.setForeground(new java.awt.Color(255, 255, 255));
        VacAppoint.setText("Vaccination Appointments");
        VacAppoint.setToolTipText("");
        VacAppoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VacAppointActionPerformed(evt);
            }
        });

        Supply.setBackground(new java.awt.Color(102, 102, 102));
        Supply.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Supply.setForeground(new java.awt.Color(255, 255, 255));
        Supply.setText("Supply of Vaccines");
        Supply.setToolTipText("");
        Supply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplyActionPerformed(evt);
            }
        });

        StatRe.setBackground(new java.awt.Color(102, 102, 102));
        StatRe.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        StatRe.setForeground(new java.awt.Color(255, 255, 255));
        StatRe.setText("Statistical Reports");
        StatRe.setToolTipText("");
        StatRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatReActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 0, 0));
        logout.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("LOGOUT");
        logout.setToolTipText("");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("WELCOME TO");
        jLabel4.setToolTipText("");
        jLabel4.setName("header_1"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COVID-19 VACCINE REGISTRATION SYSTEM");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel_mainLayout = new javax.swing.GroupLayout(jPanel_main);
        jPanel_main.setLayout(jPanel_mainLayout);
        jPanel_mainLayout.setHorizontalGroup(
            jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_mainLayout.createSequentialGroup()
                        .addGroup(jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_get_personal_info, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_people_account, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Supply, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StatRe, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VacAppoint)
                            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel_personal_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1337, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_mainLayout.setVerticalGroup(
            jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_mainLayout.createSequentialGroup()
                        .addComponent(btn_get_personal_info, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_people_account, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(VacAppoint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Supply, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(StatRe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_personal_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void routeToPeopleAccountPage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_get_people_account_2
        this.applicationContext.getPersonalInfoPage().setVisible(false);
        this.applicationContext.getPeopleAccountPage().setVisible(true);
    }

    private void get_personal_info(java.awt.event.ActionEvent evt) throws FileNotFoundException {//GEN-FIRST:event_get_personal_info
        final String newLine = "\n";
        String contents = "";
        UserService userService = new UserService();
        User userDetails = userService.viewUser(this.applicationContext.getCurrentUsername());
        text_area_main.setText("");
        contents += "Username: " + userDetails.getUsername();
        contents += newLine;
        contents += "Password: " + userDetails.getPassword();
        contents += newLine;
        contents += "Actual Name: " + userDetails.getActualName();
        contents += newLine;
        contents += "Nationality: " + userDetails.getNationality();
        contents += newLine;
        contents += "Date of Birth: " + userDetails.getDateOfBirth();
        contents += newLine;
        contents += "Gender: " + userDetails.getGender();
        contents += newLine;
        contents += "Contact No: " + userDetails.getContactNo();
        contents += newLine;
        contents += "Email: " + userDetails.getEmail();
        contents += newLine;
        contents += "Address: " + userDetails.getAddress();
        contents += newLine;
        contents += "Postcode: " + userDetails.getPostcode();
        contents += newLine;
        contents += "City: " + userDetails.getCity();
        contents += newLine;
        contents += "State: " + userDetails.getState();
        contents += newLine;
        contents += "Role: " + userDetails.getRole();
        text_area_main.setText(contents);

//        for (String row: text_area_main.getText().split("\n")){
//            System.out.println("row: " + row);
//        }
    }//GEN-LAST:event_get_personal_info

    private void VacAppointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VacAppointActionPerformed
        // TODO add your handling code here:
        this.dispose();
//        CPage6_VacAppointment VacAppoint= new CPage6_VacAppointment();
//        VacAppoint.setVisible(true);
    }//GEN-LAST:event_VacAppointActionPerformed

    private void SupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplyActionPerformed
        // TODO add your handling code here:
        this.dispose();
//        CPage7_SupplyVac Supply= new CPage7_SupplyVac();
//        Supply.setVisible(true);
    }//GEN-LAST:event_SupplyActionPerformed

    private void StatReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatReActionPerformed
        // TODO add your handling code here:
        this.dispose();
//        CPage8_Report StatRe= new CPage8_Report();
//        StatRe.setVisible(true);
    }//GEN-LAST:event_StatReActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
//        Page2_Committee compage1= new Page2_Committee();
//        compage1.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StatRe;
    private javax.swing.JButton Supply;
    private javax.swing.JButton VacAppoint;
    private javax.swing.JButton btn_get_personal_info;
    private javax.swing.JButton btn_people_account;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel_main;
    private javax.swing.JPanel jPanel_personal_info;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTextArea text_area_main;
    // End of variables declaration//GEN-END:variables
}
