package CodTrabalho;

import java.awt.CardLayout;

public class TelaPlanos extends javax.swing.JPanel {
    CardLayout cardLayout;
    private static TelaPlanos telaInfos = null;
    private TelaPlanos(CardLayout layout) {
        initComponents();
        cardLayout = layout;
        this.mostrarInfos();
    }
    
    public static TelaPlanos iniciar(CardLayout layout){
        if (telaInfos == null){
            telaInfos = new TelaPlanos(layout);
        }
        return telaInfos;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPlanos = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTelC = new javax.swing.JLabel();
        lblTelR = new javax.swing.JLabel();
        lblNumConta = new javax.swing.JLabel();
        lblCodBanco = new javax.swing.JLabel();
        btnAtualiza = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Noto Sans Mono", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Planos Cliente");

        jLabel2.setFont(new java.awt.Font("Noto Sans Mono", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Noto Sans Mono", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("E-mail:");

        jLabel4.setFont(new java.awt.Font("Noto Sans Mono", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Tel. Celular:");

        jLabel5.setFont(new java.awt.Font("Noto Sans Mono", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Tel. Residencial:");

        jLabel6.setFont(new java.awt.Font("Noto Sans Mono", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Conta Bancária");

        jLabel7.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("Nº Conta: ");

        jLabel8.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Cód. Banco: ");

        tabelaPlanos.setBackground(new java.awt.Color(204, 204, 255));
        tabelaPlanos.setFont(new java.awt.Font("Noto Sans Mono", 0, 12)); // NOI18N
        tabelaPlanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Plano", "Rua", "Nº", "Complemento", "CEP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaPlanos);

        btnVoltar.setBackground(new java.awt.Color(0, 204, 204));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("jLabel9");

        lblEmail.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("jLabel10");

        lblTelC.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        lblTelC.setForeground(new java.awt.Color(255, 255, 255));
        lblTelC.setText("jLabel11");

        lblTelR.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        lblTelR.setForeground(new java.awt.Color(255, 255, 255));
        lblTelR.setText("jLabel12");

        lblNumConta.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        lblNumConta.setForeground(new java.awt.Color(255, 255, 255));
        lblNumConta.setText("jLabel13");

        lblCodBanco.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        lblCodBanco.setForeground(new java.awt.Color(255, 255, 255));
        lblCodBanco.setText("jLabel14");

        btnAtualiza.setBackground(new java.awt.Color(0, 204, 204));
        btnAtualiza.setFont(new java.awt.Font("Noto Sans Mono", 0, 12)); // NOI18N
        btnAtualiza.setText("Atualizar");
        btnAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTelC, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                            .addComponent(lblTelR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtualiza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar)))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblTelC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblTelR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblNumConta)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblCodBanco))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnAtualiza))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        cardLayout.show(this.getParent(), "telaServicos");
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed
        this.mostrarInfos();
    }//GEN-LAST:event_btnAtualizaActionPerformed
    
    private void mostrarInfos(){
        
        Cliente cliente = Cliente.iniciar();
        this.lblNome.setText(cliente.getNome());
        this.lblEmail.setText(cliente.getEmail());
        this.lblTelC.setText(Integer.toString(cliente.getTelCelular()));
        this.lblTelR.setText(Integer.toString(cliente.getTelResidencial()));
        this.lblNumConta.setText(Integer.toString(cliente.getContaBancaria().getNumConta()));
        this.lblCodBanco.setText(Integer.toString(cliente.getContaBancaria().getCodBanco()));
        int linha = 0;
        
        
        
        
        
        for (Plano i : cliente.getPlanos()){
            String planoString=" ";
            int planoo=i.getPlanoo();
            if(planoo==1){
               planoString="300MB";
           
            
        }else if(planoo==2){
             planoString="500MB";
           
            
        }else if(planoo==3){
            planoString="800MB";
           
        }
            this.tabelaPlanos.setValueAt(planoString, linha, 0);
            
            this.tabelaPlanos.setValueAt(i.getRua(), linha, 1);
            this.tabelaPlanos.setValueAt(i.getNumero(), linha, 2);
            this.tabelaPlanos.setValueAt(i.getComplemento(), linha, 3);
            this.tabelaPlanos.setValueAt(i.getCEP(), linha, 4);
            linha++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodBanco;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumConta;
    private javax.swing.JLabel lblTelC;
    private javax.swing.JLabel lblTelR;
    private javax.swing.JTable tabelaPlanos;
    // End of variables declaration//GEN-END:variables
}
