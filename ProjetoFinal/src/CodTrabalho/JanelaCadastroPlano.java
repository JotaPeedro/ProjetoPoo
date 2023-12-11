package CodTrabalho;

import javax.swing.JOptionPane;

public class JanelaCadastroPlano extends javax.swing.JFrame {
    
    public static JanelaCadastroPlano janelaCad;
    Controller controller;
    Cliente cliente;
    int linhas = 0;
    
    public static JanelaCadastroPlano iniciar(){
        if(janelaCad == null){
            janelaCad = new JanelaCadastroPlano();
        }
        return janelaCad;
    }
    public static JanelaCadastroPlano fechar(){
        janelaCad = null;
        return janelaCad;
    }
    
    private JanelaCadastroPlano() {
        initComponents();
        this.setVisible(true);
        this.controller = Controller.iniciar();
        this.cliente = Cliente.iniciar();
        this.mostrarImoveis();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoRua = new javax.swing.JTextField();
        campoNumero = new javax.swing.JTextField();
        campoCEP = new javax.swing.JTextField();
        campoComplemento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaImoveis = new javax.swing.JTable();
        btnConcluir = new javax.swing.JButton();
        btnCadastrar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoPlano = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Ímovel");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Noto Sans Mono", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Cadastro Novo Plano");

        jLabel2.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Rua");

        jLabel3.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Número");

        jLabel4.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("CEP");

        jLabel5.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Complemento");

        campoRua.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        campoRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRuaActionPerformed(evt);
            }
        });

        campoNumero.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N

        campoCEP.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N

        campoComplemento.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N

        tabelaImoveis.setBackground(new java.awt.Color(102, 102, 102));
        tabelaImoveis.setFont(new java.awt.Font("Noto Sans Mono", 0, 12)); // NOI18N
        tabelaImoveis.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaImoveis.setFocusable(false);
        tabelaImoveis.setGridColor(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(tabelaImoveis);

        btnConcluir.setBackground(new java.awt.Color(0, 204, 204));
        btnConcluir.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        btnConcluir.setText("Concluir");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

        btnCadastrar1.setBackground(new java.awt.Color(0, 204, 204));
        btnCadastrar1.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        btnCadastrar1.setText("Cadastrar");
        btnCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Informe o Plano Desejado:");

        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("1-300MB por R$79,00");

        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("2-500MB por R$99,90");

        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setText("3-800MB por R$119,99");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 204));
        jLabel10.setText("Planos Disponíveis:");

        campoPlano.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        campoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPlanoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(campoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCadastrar1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(campoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(btnConcluir)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(campoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar1)
                    .addComponent(jLabel6)
                    .addComponent(campoPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConcluir)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPlanoActionPerformed

    private void btnCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar1ActionPerformed
        this.cadastrar();
    }//GEN-LAST:event_btnCadastrar1ActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        fechar();
        this.dispose();
    }//GEN-LAST:event_btnConcluirActionPerformed

    private void campoRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRuaActionPerformed
    
    private void cadastrar(){
        int numero = controller.validaNumeros(this.campoNumero.getText().trim());
        int cep = controller.validaNumeros(this.campoCEP.getText().trim());
        String rua = this.campoRua.getText().trim();
        String complemento = this.campoComplemento.getText().trim();
        int plano=controller.validaNumeros(this.campoPlano.getText().trim());
        String planoString="";
        
        
        if(plano==1){
           
            planoString="300MB";
            
        }else if(plano==2){
            planoString="500MB";
            
        }else if(plano==3){
            planoString="800MB";
        }
        
        
        
        if (numero == -999){
            this.exibeMensagemErro("Erro!! Caractere inválido no campo número.");
            this.limparCampo("numero");
        }
        if (cep == -999){
            this.exibeMensagemErro("Erro!! Caractere inválido no campo CEP.");
            this.limparCampo("cep");
        }
        if (linhas <= 13){
            Imovel imovel = new Imovel(plano,planoString,rua, numero, cep, complemento);
            if (linhas > 0){
                if (this.controller.verificarImovel(this.cliente.getImoveis(), imovel)){
                    this.exibeMensagemErro("Erro!! Este endereço já foi inserido.");
                    this.limpaCampos();
                }else if (numero != -999 && cep != -999){
                    this.addLinha(planoString,rua, numero, complemento, cep, linhas);
                    this.cliente.addImovel(new Imovel(plano,planoString,rua, numero, cep, complemento));
                    this.limpaCampos();
                    linhas++;
                }
            }  
            if (linhas == 0 && numero != -999 && cep != -999){
                this.addLinha(planoString,rua, numero, complemento, cep, linhas);
                this.cliente.addImovel(new Imovel(plano,planoString,rua, numero, cep, complemento));
                this.limpaCampos();
                linhas++;
            }
        }
    }
    private void addLinha(String planoString,String rua, int numero, String complemento,int cep, int linha){
        
        this.tabelaImoveis.setValueAt(planoString, linha, 0);
        this.tabelaImoveis.setValueAt(rua, linha, 1);
        this.tabelaImoveis.setValueAt(numero, linha, 2);
        this.tabelaImoveis.setValueAt(complemento, linha, 3);
        this.tabelaImoveis.setValueAt(cep, linha, 4);
    }
    private void exibeMensagemErro(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem, "Erro",JOptionPane.ERROR_MESSAGE);
    }
    private void limparCampo(String campo){
        if(campo.equals("numero")){
            this.campoNumero.setText("");
        }
        if(campo.equals("cep")){
            this.campoCEP.setText("");
        }
    }
    private void limpaCampos(){
        this.campoRua.setText("");
        this.campoCEP.setText("");
        this.campoComplemento.setText("");
        this.campoNumero.setText("");
        this.campoPlano.setText("");
    }
    private void mostrarImoveis(){
        for (Imovel i : this.cliente.getImoveis()){
            this.addLinha(i.getPlanoString(),i.getRua(), i.getNumero(), i.getComplemento(), i.getCEP(), linhas);
            linhas++;
        }
    }
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
            java.util.logging.Logger.getLogger(JanelaCadastroPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastroPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCadastroPlano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar1;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JTextField campoCEP;
    private javax.swing.JTextField campoComplemento;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoPlano;
    private javax.swing.JTextField campoRua;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaImoveis;
    // End of variables declaration//GEN-END:variables
}
