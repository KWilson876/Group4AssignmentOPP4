package com.opp4_group4;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

class currencyConverter extends javax.swing.JFrame {
    public currencyConverter() {
        currencyConverterGUI();
    }

    private void currencyConverterGUI() {
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1.setText("jButton1");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setText("Input $:");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jTextField1ActionPerformed(evt);

            }

        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyPressed(java.awt.event.KeyEvent evt) {

                jTextField1KeyPressed(evt);

            }

        });

        jLabel2.setText("Currency Type:");
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "US", "CAN", "Euro" }));
        jLabel3.setText("JMD Amount $:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jTextField2ActionPerformed(evt);

            }

        });

        jButton2.setText("Convert");
        jButton2.setActionCommand("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton2ActionPerformed(evt);

            }

        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton3ActionPerformed(evt);

            }

        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(

                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        .addGroup(layout.createSequentialGroup()

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                        .addGroup(layout.createSequentialGroup()

                                                .addContainerGap()

                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)

                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)

                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                                                .addGap(18, 18, 18)

                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                                        .addComponent(jTextField1)

                                                        .addComponent(jComboBox1, 0, 170, Short.MAX_VALUE)

                                                        .addComponent(jTextField2)))

                                        .addGroup(layout.createSequentialGroup()

                                                .addGap(63, 63, 63)

                                                .addComponent(jButton2)

                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                                                .addComponent(jButton3)))

                                .addContainerGap(22, Short.MAX_VALUE))

        );

        layout.setVerticalGroup(

                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        .addGroup(layout.createSequentialGroup()

                                .addGap(50, 50, 50)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(27, 27, 27)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                        .addComponent(jLabel2)

                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(22, 22, 22)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(18, 18, 18)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                        .addComponent(jButton2)

                                        .addComponent(jButton3))

                                .addContainerGap(15, Short.MAX_VALUE))

        );

        pack();

    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        if(jTextField1.getText()!=null ){

            Double value=Double.parseDouble(jTextField1.getText());

            if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("US")){
                value=value*129.02;
                jTextField2.setText(value+"");

            }

            if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("CAN")){
                value=value*97.50;
                jTextField2.setText(value+"");

            }

            if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Euro")){
                value=value*164.33;
                jTextField2.setText(value+"");

            }

        }

    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {

        JTextField tf=(JTextField) evt.getComponent();
        String value = tf.getText();
        int l = value.length();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {

        }

        else {

            JOptionPane.showMessageDialog(evt.getComponent(),"Enter Only Numbers (0 - 9)");

        }

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText("");
        jTextField2.setText("");
        jComboBox1.setSelectedIndex(0);

    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;


}
