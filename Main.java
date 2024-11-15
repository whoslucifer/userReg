import javax.swing.*;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        radFem = new javax.swing.JRadioButton();
        radMale = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        textContact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textAddress = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 21)); // NOI18N
        jLabel1.setText("Registration Form");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel2.setText("ID");

        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel3.setText("Name");

        textId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel4.setText("Gender");

        radFem.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        radFem.setText("Female");
        radFem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radFemMouseClicked(evt);
            }
        });

        radMale.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        radMale.setText("Male");
        radMale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radMaleMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel5.setText("Address");

        textContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textContactActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel6.setText("Contact");

        textAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAddressActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(204, 204, 204));
        btnExit.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(204, 204, 204));
        btnRegister.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(13, 13, 13)
                                                                .addComponent(radMale)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(radFem))
                                                        .addComponent(textContact, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(55, 55, 55))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(radFem)
                                        .addComponent(radMale))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textContact, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(53, Short.MAX_VALUE))
        );

        table.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String [] {
                        "ID", "Name", "Gender", "Address", "Contact"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void textIdActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void textContactActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void textAddressActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void radFemMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void radMaleMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radFem;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JTable table;
    private javax.swing.JTextField textAddress;
    private javax.swing.JTextField textContact;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textName;
    // End of variables declaration
}

