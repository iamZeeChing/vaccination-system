/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;

import java.io.FileWriter;
import javax.swing.JOptionPane;


/**
 *
 * @author ching
 */
public class PPage1 extends javax.swing.JFrame {

    /**
     * Creates new form PPage1
     */
    public PPage1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    //set Icon
    //PUp.setIcon(new javax.swing.ImageIcon(getclass().getResource(Images/Arrow.png)));
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        PCity1 = new javax.swing.JTextField();
        jDialog1 = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        jPanel_container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        PReturn = new javax.swing.JButton();
        PUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PSeenPw1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        PRealName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PDOB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PContactNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PPostcode = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PCity = new javax.swing.JTextField();
        PRegister = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Lab1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PPassword1 = new javax.swing.JPasswordField();
        PNoIC = new javax.swing.JTextField();
        PGender = new javax.swing.JLabel();
        PFemale = new javax.swing.JRadioButton();
        PMale = new javax.swing.JRadioButton();
        PPassword2 = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        PSeenPw2 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        PAddress = new javax.swing.JTextArea();
        PState = new javax.swing.JTextField();
        PNationality = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        PCity1.setToolTipText("Bukit Jalil");
        PCity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCity1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("IC / Passport No");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_container.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(218, 218, 218));

        Title.setBackground(new java.awt.Color(204, 204, 204));
        Title.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 0, 0));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Register");
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PReturn.setBackground(new java.awt.Color(255, 0, 51));
        PReturn.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        PReturn.setForeground(new java.awt.Color(255, 255, 255));
        PReturn.setText("Return");
        PReturn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PReturnMouseClicked(evt);
            }
        });
        PReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PReturnActionPerformed(evt);
            }
        });

        PUsername.setToolTipText("Example123");
        PUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PUsernameActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Username");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Password");

        PSeenPw1.setForeground(new java.awt.Color(102, 102, 102));
        PSeenPw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSeenPw1ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Full Name");

        PRealName.setToolTipText("Chye Zee Ching");
        PRealName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRealNameActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("IC / Passport No");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Date Of Birth");

        PDOB.setToolTipText("YYYDDMM \"20001122\"");
        PDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDOBActionPerformed(evt);
            }
        });
        PDOB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PDOBKeyTyped(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Contact No");

        PContactNo.setToolTipText("0123456789");
        PContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PContactNoActionPerformed(evt);
            }
        });
        PContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PContactNoKeyTyped(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Email");

        PEmail.setToolTipText("Examnple123@email.com");
        PEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PEmailActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Address");

        PPostcode.setToolTipText("54000");
        PPostcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPostcodeActionPerformed(evt);
            }
        });
        PPostcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PPostcodeKeyTyped(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Postcode");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("City");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("State");

        PCity.setToolTipText("Bukit Jalil");
        PCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCityActionPerformed(evt);
            }
        });

        PRegister.setBackground(new java.awt.Color(0, 153, 153));
        PRegister.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        PRegister.setForeground(new java.awt.Color(0, 0, 0));
        PRegister.setText("Register");
        PRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRegisterActionPerformed(evt);
            }
        });

        PPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPassword1ActionPerformed(evt);
            }
        });

        PNoIC.setToolTipText("001122101234");
        PNoIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PNoICKeyTyped(evt);
            }
        });

        PGender.setForeground(new java.awt.Color(0, 0, 0));
        PGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PGender.setText("Gender");

        PFemale.setText("Female");
        PFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PFemaleActionPerformed(evt);
            }
        });

        PMale.setText("Male");
        PMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMaleActionPerformed(evt);
            }
        });

        PPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPassword2ActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Confirm Password");

        PSeenPw2.setForeground(new java.awt.Color(102, 102, 102));
        PSeenPw2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSeenPw2ActionPerformed(evt);
            }
        });

        PAddress.setColumns(20);
        PAddress.setRows(5);
        jScrollPane1.setViewportView(PAddress);

        PState.setToolTipText("Bukit Jalil");
        PState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PStateActionPerformed(evt);
            }
        });

        PNationality.setToolTipText("Malaysian");
        PNationality.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PNationalityKeyTyped(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Nationality");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PUsername)
                                    .addComponent(PPassword1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PSeenPw1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(PPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PSeenPw2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PNationality)
                            .addComponent(PNoIC)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(PMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PRealName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PDOB)
                            .addComponent(PContactNo)
                            .addComponent(PEmail)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(PPostcode)
                            .addComponent(PCity)
                            .addComponent(PState))
                        .addGap(25, 25, 25)))
                .addComponent(Lab1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addGap(7, 7, 7)
                .addComponent(jLabel16)
                .addGap(90, 90, 90))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PRegister)
                .addGap(127, 127, 127)
                .addComponent(PReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(Lab1)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PSeenPw1)
                    .addComponent(PPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PSeenPw2)
                    .addComponent(jLabel15))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PRealName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PNoIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PGender)
                    .addComponent(PMale)
                    .addComponent(PFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PRegister)
                    .addComponent(PReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PRealName.getAccessibleContext().setAccessibleDescription("");
        PDOB.getAccessibleContext().setAccessibleName("");
        PEmail.getAccessibleContext().setAccessibleDescription("Example123@gmail.com");
        PPostcode.getAccessibleContext().setAccessibleDescription("");
        PCity.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel_containerLayout = new javax.swing.GroupLayout(jPanel_container);
        jPanel_container.setLayout(jPanel_containerLayout);
        jPanel_containerLayout.setHorizontalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel_containerLayout.setVerticalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PSeenPw2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PSeenPw2ActionPerformed
        // TODO add your handling code here:
        if(PSeenPw2.isSelected()){
            PPassword2.setEchoChar((char)0);
        }else{
            PPassword2.setEchoChar((char)'*');
        }
    }//GEN-LAST:event_PSeenPw2ActionPerformed

    private void PPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPassword2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PPassword2ActionPerformed

    private void PFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PFemaleActionPerformed
        // TODO add your handling code here:
        if(PFemale.isSelected()){
            PMale.setSelected(false);
        }
    }//GEN-LAST:event_PFemaleActionPerformed

    private void PNoICKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PNoICKeyTyped
        // TODO numeric only:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_PNoICKeyTyped

    private void PPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PPassword1ActionPerformed

    private void PRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRegisterActionPerformed
        String username = PUsername.getText();
        String pw1 = String.valueOf(PPassword1.getPassword());
        String pw2 = String.valueOf(PPassword2.getPassword());
        String name = PRealName.getText();
        String ic = PNoIC.getText();
        String nationality = PNationality.getText();
        String dob = PDOB.getText();
        String contact = PContactNo.getText();
        String email = PEmail.getText();
        String address = PAddress.getText();
        String postcode = PPostcode.getText();
        String city = PCity.getText();
        String state = PState.getText();
        
        String gender = null;
        if(PMale.isSelected()){
            gender = "Male";
        }else if(PFemale.isSelected()){
            gender = "Female";
        }
        
        try{
            boolean x = false;
            while(x == false){
                if(username.isBlank() || pw1.isBlank() || pw2.isBlank() || name.isBlank() || ic.isBlank() || dob.isBlank() ||
                    contact.isBlank() || email.isBlank() || address.isBlank() || postcode.isBlank() ||
                    city.isBlank() || state.isBlank()){
                    JOptionPane.showMessageDialog(PCity, "Please fill out the blank space!");
                    x=false;
                    break;
                }else if(!(pw1.equals(pw2))){
                    JOptionPane.showMessageDialog(PPassword2, "Please ensure both entered password matches!");
                    x=false;
                    break;
                }else {
                    x=true;
                    FileWriter peofile = new FileWriter("People.txt",true);
                    peofile.write("Username: "+username+"\nPassword: "+pw1+"\nFull Name: "+name+"\nIC / Passport No: "+ic+ "\nNationalty: "+nationality+
                            "\nGender: "+gender+ "\nDate of Birth: "+dob+"\nContact No: "+contact+"\nEmail: "+email+"\nAddress: "+address+
                            "\nPostcode: "+postcode+"\nCity: "+city+"\nState: "+state+"\n\n");
                    peofile.close();
                    JOptionPane.showMessageDialog(PCity, "Dear "+name+",\n\nYou have registered successfully! You may proceed to login.");
                    setVisible(true);
                    this.dispose();
                    Page2 PeoplePage= new Page2();
                    PeoplePage.setVisible(true);    
                   
                }
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(PCity,"Error! Please try again.");
        }
    }//GEN-LAST:event_PRegisterActionPerformed

    private void PCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PCityActionPerformed

    private void PPostcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPostcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PPostcodeActionPerformed

    private void PEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PEmailActionPerformed

    private void PContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PContactNoActionPerformed

    private void PDOBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PDOBKeyTyped
        // TODO numeric only:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_PDOBKeyTyped

    private void PDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PDOBActionPerformed

    private void PRealNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRealNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRealNameActionPerformed

    private void PSeenPw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PSeenPw1ActionPerformed
        // Show and hide password:
        if(PSeenPw1.isSelected()){
            PPassword1.setEchoChar((char)0);
        }else{
            PPassword1.setEchoChar((char)'*');
        }
        //sas
    }//GEN-LAST:event_PSeenPw1ActionPerformed

    private void PUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PUsernameActionPerformed

    private void PReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PReturnActionPerformed
        this.dispose();
        Page3 committeePage= new Page3();
        committeePage.setVisible(true);
    }//GEN-LAST:event_PReturnActionPerformed

    private void PReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PReturnMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Page1 startPage= new Page1();
        startPage.setVisible(true);
    }//GEN-LAST:event_PReturnMouseClicked

    private void PCity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PCity1ActionPerformed

    private void PStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PStateActionPerformed

    private void PContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PContactNoKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_PContactNoKeyTyped

    private void PNationalityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PNationalityKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_PNationalityKeyTyped

    private void PPostcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PPostcodeKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_PPostcodeKeyTyped

    private void PMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMaleActionPerformed
        // TODO add your handling code here:
        if(PMale.isSelected()){
            PFemale.setSelected(false);
        }
    }//GEN-LAST:event_PMaleActionPerformed

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
            java.util.logging.Logger.getLogger(PPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PPage1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lab1;
    private javax.swing.JTextArea PAddress;
    private javax.swing.JTextField PCity;
    private javax.swing.JTextField PCity1;
    private javax.swing.JTextField PContactNo;
    private javax.swing.JTextField PDOB;
    private javax.swing.JTextField PEmail;
    private javax.swing.JRadioButton PFemale;
    private javax.swing.JLabel PGender;
    private javax.swing.JRadioButton PMale;
    private javax.swing.JTextField PNationality;
    private javax.swing.JTextField PNoIC;
    private javax.swing.JPasswordField PPassword1;
    private javax.swing.JPasswordField PPassword2;
    private javax.swing.JTextField PPostcode;
    private javax.swing.JTextField PRealName;
    private javax.swing.JButton PRegister;
    private javax.swing.JButton PReturn;
    private javax.swing.JCheckBox PSeenPw1;
    private javax.swing.JCheckBox PSeenPw2;
    private javax.swing.JTextField PState;
    private javax.swing.JTextField PUsername;
    private javax.swing.JLabel Title;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_container;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
