
package calculadora1;

public class MiPrimeraCalculadora extends javax.swing.JFrame {
    int op=0, p=0;
    double rsum=0,rmul=1,n1=0, r;
    String entrada = "", s;
    private Object getText;
    public MiPrimeraCalculadora() {
        initComponents();
        this.setLocationRelativeTo(null);        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnMult1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        BtnSuma = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        BtnBorrar = new javax.swing.JButton();
        BPunto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        PantallaOut = new javax.swing.JTextField();
        PantallaIn = new javax.swing.JTextField();
        PantallaSigno = new javax.swing.JTextField();
        BtnResta = new javax.swing.JButton();
        BtnMult = new javax.swing.JButton();
        BtnDiv = new javax.swing.JButton();
        BC = new javax.swing.JButton();

        BtnMult1.setText("x");
        BtnMult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMult1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "El profe Bernardo León", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        BtnSuma.setBackground(new java.awt.Color(255, 255, 255));
        BtnSuma.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnSuma.setForeground(new java.awt.Color(51, 51, 255));
        BtnSuma.setText("+");
        BtnSuma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(255, 255, 255), null, new java.awt.Color(51, 51, 51)));
        BtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumaActionPerformed(evt);
            }
        });

        BtnIgual.setBackground(new java.awt.Color(255, 255, 255));
        BtnIgual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnIgual.setForeground(new java.awt.Color(51, 51, 255));
        BtnIgual.setText("=");
        BtnIgual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(255, 255, 255), null, new java.awt.Color(51, 51, 51)));
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(204, 204, 204));
        B1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B1.setText("1");
        B1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(204, 204, 204));
        B2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B2.setText("2");
        B2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(204, 204, 204));
        B3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B3.setText("3");
        B3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(204, 204, 204));
        B4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B4.setText("4");
        B4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(204, 204, 204));
        B5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B5.setText("5");
        B5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(204, 204, 204));
        B6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B6.setText("6");
        B6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setBackground(new java.awt.Color(204, 204, 204));
        B7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B7.setText("7");
        B7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(204, 204, 204));
        B8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B8.setText("8");
        B8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(204, 204, 204));
        B9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B9.setText("9");
        B9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B0.setBackground(new java.awt.Color(204, 204, 204));
        B0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B0.setText("0");
        B0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        BtnBorrar.setBackground(new java.awt.Color(255, 255, 255));
        BtnBorrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnBorrar.setForeground(new java.awt.Color(51, 51, 255));
        BtnBorrar.setText("AC");
        BtnBorrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(255, 255, 255), null, new java.awt.Color(51, 51, 51)));
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });

        BPunto.setBackground(new java.awt.Color(204, 204, 204));
        BPunto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BPunto.setText(".");
        BPunto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPuntoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(51, 51, 51)));

        PantallaOut.setBackground(new java.awt.Color(0, 0, 0));
        PantallaOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PantallaOut.setForeground(new java.awt.Color(102, 255, 0));
        PantallaOut.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        PantallaOut.setBorder(null);
        PantallaOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PantallaOutActionPerformed(evt);
            }
        });

        PantallaIn.setBackground(new java.awt.Color(0, 0, 0));
        PantallaIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PantallaIn.setForeground(new java.awt.Color(255, 255, 0));
        PantallaIn.setBorder(null);
        PantallaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PantallaInActionPerformed(evt);
            }
        });

        PantallaSigno.setBackground(new java.awt.Color(0, 0, 0));
        PantallaSigno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PantallaSigno.setForeground(new java.awt.Color(204, 102, 0));
        PantallaSigno.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        PantallaSigno.setBorder(null);
        PantallaSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PantallaSignoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PantallaOut)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PantallaIn, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(PantallaSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(PantallaSigno))
                    .addComponent(PantallaIn, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(PantallaOut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtnResta.setBackground(new java.awt.Color(255, 255, 255));
        BtnResta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnResta.setForeground(new java.awt.Color(51, 51, 255));
        BtnResta.setText("-");
        BtnResta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(255, 255, 255), null, new java.awt.Color(51, 51, 51)));
        BtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRestaActionPerformed(evt);
            }
        });

        BtnMult.setBackground(new java.awt.Color(255, 255, 255));
        BtnMult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnMult.setForeground(new java.awt.Color(51, 51, 255));
        BtnMult.setText("x");
        BtnMult.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(255, 255, 255), null, new java.awt.Color(51, 51, 51)));
        BtnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultActionPerformed(evt);
            }
        });

        BtnDiv.setBackground(new java.awt.Color(255, 255, 255));
        BtnDiv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnDiv.setForeground(new java.awt.Color(51, 51, 255));
        BtnDiv.setText("/");
        BtnDiv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(255, 255, 255), null, new java.awt.Color(51, 51, 51)));
        BtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivActionPerformed(evt);
            }
        });

        BC.setBackground(new java.awt.Color(255, 255, 255));
        BC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BC.setForeground(new java.awt.Color(51, 51, 255));
        BC.setText("C");
        BC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(255, 255, 255), null, new java.awt.Color(51, 51, 51)));
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                    .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(B8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(B5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(B0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B6, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(BtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(BtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BC)
                        .addComponent(BtnBorrar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(B7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(B5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(B2))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(B4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(B1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B0))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(B8)
                                .addComponent(B9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(B6)
                                .addComponent(BtnMult)
                                .addComponent(BtnDiv))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(B3)
                                .addComponent(BtnSuma)
                                .addComponent(BtnResta))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BPunto)
                                .addComponent(BtnIgual))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMult1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMult1ActionPerformed

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
        int c = entrada.length()-1;
        entrada = entrada.substring(0, c);
        PantallaIn.setText(null);
        pantalla();
    }//GEN-LAST:event_BCActionPerformed

    private void BtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivActionPerformed
        
        s="/";
        signo();
        n1 = Double.parseDouble(entrada); 
        p=1;
        switch (op){
            case 0:
                rmul=n1;                                               
                entrada="";
                n1=0;               
                break;
            case 1:  // (+)
                rmul=n1;                                               
                entrada="";
                n1=0;
                break;               
            case 2:  //  (-)                
                rmul=(-n1);                
                entrada="";
                n1=0;
                break;
            case 3:   // (x)                
                rmul = rmul*n1;
                entrada="";
                n1=0;
                break;
            case 4:
                rmul = rmul/n1;
                entrada="";
                n1=0;
                break;
        }      
        op = 4;  
    }//GEN-LAST:event_BtnDivActionPerformed

    private void BtnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultActionPerformed
        s="x";
        signo();
        n1 = Double.parseDouble(entrada); 
        p=1;
        switch (op){
            case 0:
                rmul=n1;                                               
                entrada="";
                n1=0;               
                break;
            case 1:  // (+)
                rmul=n1;                                               
                entrada="";
                n1=0;
                break;
            case 2:  //  (-)
                rmul=(-n1);                
                entrada="";
                n1=0;
                break;
            case 3:  //   (x)                                
                rmul = rmul*n1;
                entrada="";
                n1=0;
                break;                
            default:    // (/)              
                rmul = rmul/n1;
                entrada="";
                n1=0;
                break;                          
        }       
        op = 3;
    }//GEN-LAST:event_BtnMultActionPerformed
    
    private void BtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRestaActionPerformed
        s="-";
        signo();
        n1 = Double.parseDouble(entrada);
        
        switch (op){
            case 0:
                rsum=n1;                
                break;
            default:  // (1, 2, 3 o 4)
                break;
        }  
        operacion();
        pantalla();
        resultado();
        op = 2;
        p=0;
    }//GEN-LAST:event_BtnRestaActionPerformed

    private void BPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPuntoActionPerformed
        if (!(PantallaIn.getText().contains("."))){
            entrada = entrada + ".";
            pantalla();
        }
    }//GEN-LAST:event_BPuntoActionPerformed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        PantallaIn.setText(null);
        PantallaOut.setText("0");
        PantallaSigno.setText(null);
        entrada="";
        rsum=0;
        rmul=1;
        r=0;
        op=0;
        s="";
        n1=0;
        p=0;
       

    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        entrada = entrada + 0;
        pantalla();
    }//GEN-LAST:event_B0ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        entrada = entrada + 9;
        pantalla();
    }//GEN-LAST:event_B9ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        entrada = entrada + 8;
        pantalla();
    }//GEN-LAST:event_B8ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        entrada = entrada + 7;
        pantalla();
    }//GEN-LAST:event_B7ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        entrada = entrada + 6;
        pantalla();
    }//GEN-LAST:event_B6ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        entrada = entrada + 5;
        pantalla();
    }//GEN-LAST:event_B5ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        entrada = entrada + 4;
        pantalla();
    }//GEN-LAST:event_B4ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        entrada = entrada + 3;
        pantalla();
    }//GEN-LAST:event_B3ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        entrada = entrada + 2;
        pantalla();
    }//GEN-LAST:event_B2ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        entrada = entrada + 1;
        pantalla();
    }//GEN-LAST:event_B1ActionPerformed

    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed
        s="=";
        signo();
        n1 = Double.parseDouble(entrada);       
        operacion();                    
        pantalla();
        resultado();
        
        PantallaIn.setText(null);
        PantallaSigno.setText(null);
        entrada=(Double.toString((r)));
        rsum=0;
        rmul=1;
        op=0;
        s="";        
        p=0;
        
    }//GEN-LAST:event_BtnIgualActionPerformed

    private void BtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumaActionPerformed
        s="+";
        signo();        
        n1 = Double.parseDouble(entrada);
        
        switch (op){
            case 0:
                rsum=n1;                
                break;
            default:  // (1, 2, 3 o 4)                              
                break;            
        }  
        operacion();
        pantalla();
        resultado();
        op = 1;
        p=0;
    }//GEN-LAST:event_BtnSumaActionPerformed

    private void PantallaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PantallaInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PantallaInActionPerformed

    private void PantallaOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PantallaOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PantallaOutActionPerformed

    private void PantallaSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PantallaSignoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PantallaSignoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiPrimeraCalculadora().setVisible(true);
            }
        });
    }
    
    public void pantalla(){
        PantallaIn.setText(entrada);
    }
    
    public void resultado(){        
        if (r%1==0){
            PantallaOut.setText(Integer.toString((int)(r)));}
        else
            PantallaOut.setText(Double.toString((r)));
    }
    
    public void signo(){
        PantallaSigno.setText(s);
    }
    
    public void operacion(){        
        switch (op){
            case 1:                
                rsum= rsum + n1;           
                break;            
            case 2:
                rsum= rsum - n1;                
                break;                
            case 3:
                rmul = rmul*n1 ;                   
                break;                
            case 4:
                rmul = rmul/n1 ;                  
                break;            
            default: 
                entrada = ""; 
                break;        }
        rsum=rsum+rmul*p;
        r=rsum;
        entrada = "";
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BC;
    private javax.swing.JButton BPunto;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnDiv;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnMult;
    private javax.swing.JButton BtnMult1;
    private javax.swing.JButton BtnResta;
    private javax.swing.JButton BtnSuma;
    private javax.swing.JTextField PantallaIn;
    private javax.swing.JTextField PantallaOut;
    private javax.swing.JTextField PantallaSigno;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
