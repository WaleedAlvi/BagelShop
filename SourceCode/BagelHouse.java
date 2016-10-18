import javax.swing.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;

public class BagelHouse extends JFrame implements ActionListener{
    
    private double white = 1.25;
    private double wholewheat = 1.50;
    private double regularCoffee = 1.25;
    private double cappuccino = 2.00;
    private double cafeAuLait = 1.75;
    private double creamCheese = 0.50;
    private double butter = 0.25;
    private double blueberryJam = 0.75;
    private double raspberryJam = 0.75;
    private double peachJelly = 0.75;
   
    DecimalFormat df = new DecimalFormat("#.00");
    Date date = new Date();

    public BagelHouse() {
        initComponents();
    }
    
    
  
    public void actionPerformed(ActionEvent e){
        if(radNoBagel == e.getSource()){
            System.out.println("Helo");
        }
    }
    
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        radNoBagel = new javax.swing.JRadioButton();
        radWhite = new javax.swing.JRadioButton();
        radWheat = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtWhiteQty = new javax.swing.JTextField();
        txtWholeWheatQty = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        chkCreameCheese = new javax.swing.JCheckBox();
        chkButter = new javax.swing.JCheckBox();
        chkBlueberryJam = new javax.swing.JCheckBox();
        chkRasberryJam = new javax.swing.JCheckBox();
        chkPeachJelly = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        radNoCoffee = new javax.swing.JRadioButton();
        radRegCoffee = new javax.swing.JRadioButton();
        radCappuccino = new javax.swing.JRadioButton();
        radCafeAuLait = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtRegCoffeeQty = new javax.swing.JTextField();
        txtCafeAuLaitQty = new javax.swing.JTextField();
        txtCappuccinoQty = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblTax = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuPrintReceipt = new javax.swing.JMenu();
        menuItemSave = new javax.swing.JMenuItem();
        menuItemPrint = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pick a Bagel"));

        radNoBagel.setText("None");
        radNoBagel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNoBagelActionPerformed(evt);
            }
        });

        radWhite.setText("White ($1.25)");
        radWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radWhiteActionPerformed(evt);
            }
        });

        radWheat.setText("Whole Wheat ($1.50)");
        radWheat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radWheatActionPerformed(evt);
            }
        });

        jLabel4.setText("Qty:");

        txtWhiteQty.setMinimumSize(new java.awt.Dimension(84, 28));
        txtWhiteQty.setPreferredSize(new java.awt.Dimension(84, 28));

        txtWholeWheatQty.setMinimumSize(new java.awt.Dimension(84, 28));
        txtWholeWheatQty.setPreferredSize(new java.awt.Dimension(84, 28));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radWheat)
                    .addComponent(radWhite)
                    .addComponent(radNoBagel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWhiteQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWholeWheatQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(radNoBagel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radWhite))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWhiteQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radWheat)
                    .addComponent(txtWholeWheatQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pick your Toppings"));

        chkCreameCheese.setText("Creame Cheese ($0.50)");
        chkCreameCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCreameCheeseActionPerformed(evt);
            }
        });

        chkButter.setText("Butter ($0.25) ");

        chkBlueberryJam.setText("Blueberry Jam ($0.25)");
        chkBlueberryJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBlueberryJamActionPerformed(evt);
            }
        });

        chkRasberryJam.setText("Rasberry Jam ($0.75)");

        chkPeachJelly.setText("Peach Jelly ($0.75)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCreameCheese)
                    .addComponent(chkButter)
                    .addComponent(chkBlueberryJam)
                    .addComponent(chkRasberryJam)
                    .addComponent(chkPeachJelly))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(chkCreameCheese, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkButter, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkBlueberryJam, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkRasberryJam, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPeachJelly, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Coffee"));

        radNoCoffee.setText("None");
        radNoCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNoCoffeeActionPerformed(evt);
            }
        });

        radRegCoffee.setText("Regular Coffee ($1.25)");
        radRegCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radRegCoffeeActionPerformed(evt);
            }
        });

        radCappuccino.setText("Cappuccino ($2.00)");
        radCappuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCappuccinoActionPerformed(evt);
            }
        });

        radCafeAuLait.setText("Cafe Au Lait ($1.75)");
        radCafeAuLait.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCafeAuLaitActionPerformed(evt);
            }
        });

        jLabel5.setText("Qty:");

        txtRegCoffeeQty.setMinimumSize(new java.awt.Dimension(84, 28));
        txtRegCoffeeQty.setPreferredSize(new java.awt.Dimension(84, 28));

        txtCafeAuLaitQty.setMinimumSize(new java.awt.Dimension(84, 28));
        txtCafeAuLaitQty.setPreferredSize(new java.awt.Dimension(84, 28));
        txtCafeAuLaitQty.setRequestFocusEnabled(false);
        txtCafeAuLaitQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCafeAuLaitQtyActionPerformed(evt);
            }
        });

        txtCappuccinoQty.setMinimumSize(new java.awt.Dimension(84, 28));
        txtCappuccinoQty.setPreferredSize(new java.awt.Dimension(84, 28));
        txtCappuccinoQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCappuccinoQtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(radRegCoffee)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radCappuccino)
                            .addComponent(radCafeAuLait)
                            .addComponent(radNoCoffee))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCappuccinoQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtRegCoffeeQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCafeAuLaitQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegCoffeeQty, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radNoCoffee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radRegCoffee)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radCappuccino)
                    .addComponent(txtCappuccinoQty, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCafeAuLaitQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radCafeAuLait))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Price"));

        jLabel1.setText("Subtotal");

        jLabel2.setText("Tax (%13)");

        jLabel3.setText("Total");

        lblSubtotal.setText("$0.00");
        lblSubtotal.setPreferredSize(new java.awt.Dimension(47, 16));

        lblTax.setText("$0.00");
        lblTax.setPreferredSize(new java.awt.Dimension(47, 16));

        lblTotal.setText("$0.00");
        lblTotal.setPreferredSize(new java.awt.Dimension(47, 16));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.setMaximumSize(new java.awt.Dimension(102, 29));
        btnReset.setMinimumSize(new java.awt.Dimension(102, 29));
        btnReset.setPreferredSize(new java.awt.Dimension(102, 29));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.setMaximumSize(new java.awt.Dimension(102, 29));
        btnExit.setMinimumSize(new java.awt.Dimension(102, 29));
        btnExit.setPreferredSize(new java.awt.Dimension(102, 29));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        menuPrintReceipt.setText("File");

        menuItemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSave.setText("Save");
        menuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSaveActionPerformed(evt);
            }
        });
        menuPrintReceipt.add(menuItemSave);

        menuItemPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuItemPrint.setText("Print");
        menuItemPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPrintActionPerformed(evt);
            }
        });
        menuPrintReceipt.add(menuItemPrint);

        jMenuBar1.add(menuPrintReceipt);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnCalculate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radWhiteActionPerformed
        radNoBagel.setSelected(false);
        chkCreameCheese.setEnabled(true);
        chkButter.setEnabled(true);
        chkBlueberryJam.setEnabled(true);
        chkRasberryJam.setEnabled(true);
        chkPeachJelly.setEnabled(true);
        txtWhiteQty.setEnabled(true);

    }//GEN-LAST:event_radWhiteActionPerformed

    private void radWheatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radWheatActionPerformed
        radNoBagel.setSelected(false);
        chkCreameCheese.setEnabled(true);
        chkButter.setEnabled(true);
        chkBlueberryJam.setEnabled(true);
        chkRasberryJam.setEnabled(true);
        chkPeachJelly.setEnabled(true);
        txtWholeWheatQty.setEnabled(true);
    }//GEN-LAST:event_radWheatActionPerformed

    private void chkCreameCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCreameCheeseActionPerformed

    }//GEN-LAST:event_chkCreameCheeseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        ResetBagels();
        ResetCoffee();
        ResetToppings();
        ResetPrice();

    }//GEN-LAST:event_btnResetActionPerformed

    private void chkBlueberryJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBlueberryJamActionPerformed

    }//GEN-LAST:event_chkBlueberryJamActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        String subtotal = df.format(Subtotal());
        String tax = df.format(CalcTax());
        String total = df.format(CalcTotal());

        lblSubtotal.setText(subtotal);
        lblTax.setText(tax);
        lblTotal.setText(total);
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void radNoBagelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNoBagelActionPerformed
        /*
        chkCreameCheese.setEnabled(false);
        chkButter.setEnabled(false);
        chkBlueberryJam.setEnabled(false);
        chkRasberryJam.setEnabled(false);
        chkPeachJelly.setEnabled(false);
        radWhite.setSelected(false);
        radWheat.setSelected(false);
        txtWhiteQty.setText("");
        txtWholeWheatQty.setText("");
        txtWhiteQty.setEnabled(false);
        txtWholeWheatQty.setEnabled(false);
        */
    }//GEN-LAST:event_radNoBagelActionPerformed

    private void radNoCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNoCoffeeActionPerformed
        radRegCoffee.setSelected(false);
        radCappuccino.setSelected(false);
        radCafeAuLait.setSelected(false);
        txtRegCoffeeQty.setText("");
        txtCafeAuLaitQty.setText("");
        txtCappuccinoQty.setText("");
        txtRegCoffeeQty.setEnabled(false);
        txtCafeAuLaitQty.setEnabled(false);
        txtCappuccinoQty.setEnabled(false);
    }//GEN-LAST:event_radNoCoffeeActionPerformed

    private void radRegCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radRegCoffeeActionPerformed
        radNoCoffee.setSelected(false);
        txtRegCoffeeQty.setEnabled(true);
    }//GEN-LAST:event_radRegCoffeeActionPerformed

    private void radCappuccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCappuccinoActionPerformed
        radNoCoffee.setSelected(false);
        txtCappuccinoQty.setEnabled(true);
    }//GEN-LAST:event_radCappuccinoActionPerformed

    private void radCafeAuLaitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCafeAuLaitActionPerformed
        radNoCoffee.setSelected(false);
        txtCafeAuLaitQty.setEnabled(true);
    }//GEN-LAST:event_radCafeAuLaitActionPerformed

    private void menuItemPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPrintActionPerformed
        //print
    }//GEN-LAST:event_menuItemPrintActionPerformed

    private void menuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSaveActionPerformed
        SaveReciept();
    }//GEN-LAST:event_menuItemSaveActionPerformed

    private void txtCafeAuLaitQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCafeAuLaitQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCafeAuLaitQtyActionPerformed

    private void txtCappuccinoQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCappuccinoQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCappuccinoQtyActionPerformed

    public void SaveReciept() {
        try {
            double whiteQty = Double.parseDouble(txtWhiteQty.getText());
            double wholewheatQty = Double.parseDouble(txtWholeWheatQty.getText());
            double regCoffeeQty = Double.parseDouble(txtRegCoffeeQty.getText());
            double CappuccinoQty = Double.parseDouble(txtCafeAuLaitQty.getText());
            double CafeAuLaitQty = Double.parseDouble(txtCappuccinoQty.getText());

            File f1 = new File("BagelHouseReceipt.txt");
            FileWriter fw = new FileWriter(f1);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Bagel House" + "\n");
            bw.write(date.toString() + "\n");
            bw.write("*******************************" + "\n");
            bw.write("Order: " + "\n");

            if (radWhite.isSelected()) {
                bw.write("White x" + txtWhiteQty + "\n");
                bw.write("\t" + Double.toString(whiteQty * 1.25) + "\n");
            }

            if (radWheat.isSelected()) {
                bw.write("Whole Wheat x" + txtWholeWheatQty + "\n");
                bw.write("\t" + Double.toString(wholewheatQty * 1.50) + "\n");
            }

            if (chkCreameCheese.isSelected()) {
                bw.write("Creame Cheese" + "\n");
                bw.write("\t" + "0.50" + "\n");
            }

            if (chkButter.isSelected()) {
                bw.write("Butter" + "\n");
                bw.write("\t" + "0.25" + "\n");
            }

            if (chkBlueberryJam.isSelected()) {
                bw.write("Blueberry Jam" + "\n");
                bw.write("\t" + "0.25" + "\n");
            }

            if (chkRasberryJam.isSelected()) {
                bw.write("Rasberry Jam" + "\n");
                bw.write("\t" + "0.75" + "\n");
            }

            if (chkPeachJelly.isSelected()) {
                bw.write("Peach Jelly" + "\n");
                bw.write("\t" + "0.75" + "\n");
            }

            if (radRegCoffee.isSelected()) {
                bw.write("Regular Coffee x" + txtRegCoffeeQty + "\n");
                bw.write("\t" + Double.toString(regCoffeeQty * 1.25) + "\n");
            }

            if (radCappuccino.isSelected()) {
                bw.write("Cappuccino x" + txtCafeAuLaitQty + "\n");
                bw.write("\t" + Double.toString(CappuccinoQty * 2.00) + "\n");
            }

            if (radCafeAuLait.isSelected()) {
                bw.write("Cafe Au Lait x" + txtCappuccinoQty + "\n");
                bw.write("\t" + Double.toString(CafeAuLaitQty * 1.75) + "\n");
            }

            bw.write("\n" + "Subtotal: " + Double.toString(Subtotal()) + "\n");
            bw.write("Tax: " + Double.toString(CalcTax()) + "\n");
            bw.write("Total: " + Double.toString(CalcTotal()) + "\n");
            bw.close();
        } catch (IOException e) {
            System.out.println("Couldn't save to file.");
        }
    }

    public double BagelCost() {

        int whiteQty = Integer.parseInt(txtWhiteQty.getText());
        int wholewheatQty = Integer.parseInt(txtWholeWheatQty.getText());
        double bagelcost = 0;

        if (radWhite.isSelected()) {
            bagelcost = bagelcost + (whiteQty * 1.25);
        }
        if (radWheat.isSelected()) {
            bagelcost = bagelcost + (wholewheatQty * 1.50);
        }

        return bagelcost;
    }

    public double CoffeeCost() {
        /*
        try {
            int regCoffeeQty = Integer.parseInt(txtRegCoffeeQty.getText());
            int CappuccinoQty = Integer.parseInt(txtCappuccinoQty.getText());
            int CafeAuLaitQty = Integer.parseInt(txtCafeAuLaitQty.getText());

            if (radRegCoffee.isSelected()) {
                coffeecost = coffeecost + (regCoffeeQty * 1.25);
            } else if (radCappuccino.isSelected()) {
                coffeecost = coffeecost + (CappuccinoQty * 2.00);
            } else if (radCafeAuLait.isSelected()) {
                coffeecost = coffeecost + (CafeAuLaitQty * 1.75);
            }
        } catch (NumberFormatException e) {
            System.out.println("coffee cost error");
        }
        */
        return 0;
    }

    public double ToppingCost() {
        double cost = 0;

        if (chkCreameCheese.isSelected()) {
            cost = cost + 0.50;
        }
        if (chkButter.isSelected()) {
            cost = cost + 0.25;
        }
        if (chkBlueberryJam.isSelected()) {
            cost = cost + 0.25;
        }
        if (chkRasberryJam.isSelected()) {
            cost = cost + 0.75;
        }
        if (chkPeachJelly.isSelected()) {
            cost = cost + 0.75;
        }

        return cost;
    }

    public double Subtotal() {

        double subtotal = 0;

        subtotal = BagelCost() + ToppingCost() + CoffeeCost();

        return subtotal;
    }

    public double CalcTax() {
        double tax = 0;

        tax = Subtotal() * 0.13;

        return tax;
    }

    public double CalcTotal() {
        double total = 0;

        total = Subtotal() + CalcTax();

        return total;
    }

    public void ResetBagels() {
        ButtonGroup Bagels = new ButtonGroup();

        Bagels.add(radNoBagel);
        Bagels.add(radWhite);
        Bagels.add(radWheat);
        Bagels.clearSelection();

        txtWhiteQty.setText("");
        txtWholeWheatQty.setText("");
    }

    public void ResetToppings() {
        chkButter.setSelected(false);
        chkCreameCheese.setSelected(false);
        chkBlueberryJam.setSelected(false);
        chkRasberryJam.setSelected(false);
        chkPeachJelly.setSelected(false);
    }

    public void ResetCoffee() {
        ButtonGroup Coffee = new ButtonGroup();

        Coffee.add(radNoCoffee);
        Coffee.add(radRegCoffee);
        Coffee.add(radCappuccino);
        Coffee.add(radCafeAuLait);
        Coffee.clearSelection();

        txtRegCoffeeQty.setText("");
        txtCafeAuLaitQty.setText("");
        txtCappuccinoQty.setText("");
    }

    public void ResetPrice() {
        lblSubtotal.setText("$0.00");
        lblTax.setText("$0.00");
        lblTotal.setText("$0.00");
    }
    
    
    public static void main(String args[]) {
        BagelHouse bh = new BagelHouse();
        bh.setVisible(true);
           
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox chkBlueberryJam;
    private javax.swing.JCheckBox chkButter;
    private javax.swing.JCheckBox chkCreameCheese;
    private javax.swing.JCheckBox chkPeachJelly;
    private javax.swing.JCheckBox chkRasberryJam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JMenuItem menuItemPrint;
    private javax.swing.JMenuItem menuItemSave;
    private javax.swing.JMenu menuPrintReceipt;
    private javax.swing.JRadioButton radCafeAuLait;
    private javax.swing.JRadioButton radCappuccino;
    private javax.swing.JRadioButton radNoBagel;
    private javax.swing.JRadioButton radNoCoffee;
    private javax.swing.JRadioButton radRegCoffee;
    private javax.swing.JRadioButton radWheat;
    private javax.swing.JRadioButton radWhite;
    private javax.swing.JTextField txtCafeAuLaitQty;
    private javax.swing.JTextField txtCappuccinoQty;
    private javax.swing.JTextField txtRegCoffeeQty;
    private javax.swing.JTextField txtWhiteQty;
    private javax.swing.JTextField txtWholeWheatQty;
    // End of variables declaration//GEN-END:variables
}
