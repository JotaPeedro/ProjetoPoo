package CodTrabalho;

import java.awt.CardLayout;
import javax.swing.JOptionPane;

public class TelaCadastroPlano extends javax.swing.JPanel {
    private int linha;
    private Controller controller;
    private Cliente cliente;
    private CardLayout paginas;
    public TelaCadastroPlano(CardLayout paginas) {
        initComponents();
        this.paginas = paginas;
        cliente = Cliente.iniciar();
        controller = Controller.iniciar();
        linha = 0;
        this.mostrarPlanos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoRua = new javax.swing.JTextField();
        campoCep = new javax.swing.JTextField();
        campoNum = new javax.swing.JTextField();
        campoComplemento = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPlanos = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoPlano = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Noto Sans Mono", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Cadastrar Novo Plano");

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Rua");

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Número");

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("CEP");

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Complemento");

        campoRua.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N

        campoCep.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N

        campoNum.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N

        campoComplemento.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N

        btnCadastrar.setBackground(new java.awt.Color(0, 204, 204));
        btnCadastrar.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

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

        jLabel9.setBackground(new java.awt.Color(0, 204, 204));
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setText("3-800MB por R$119,99");

        jLabel10.setBackground(new java.awt.Color(0, 204, 204));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 204));
        jLabel10.setText("Planos Disponíveis:");

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("1-300MB por R$79,00");

        jLabel8.setBackground(new java.awt.Color(0, 204, 204));
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("2-500MB por R$99,90");

        campoPlano.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        campoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPlanoActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 204, 204));
        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Informe o Plano Desejado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(btnVoltar))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabel8)
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(campoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoNum, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(campoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCadastrar)
                                    .addComponent(campoPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(campoNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        this.cadastrarPlano();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.controller.validaUpdateUser(this.controller.buscarUser(this.cliente.getLogin()), cliente);
        this.paginas.show(this.getParent(), "telaServicos");
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void campoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPlanoActionPerformed
    
    private void cadastrarPlano(){
        int planoo= controller.validaNumeros(this.campoPlano.getText().trim());
        int numero = controller.validaNumeros(this.campoNum.getText().trim());
        int cep = controller.validaNumeros(this.campoCep.getText().trim());
        String rua = this.campoRua.getText().trim();
        String complemento = this.campoComplemento.getText().trim();
          String planoString="";
        
        if(planoo==1){
            
            planoString="300MB";
            
        }else if(planoo==2){
            planoString="500MB";
            
        }else if(planoo==3){
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
        if (linha <= 13){
            Plano plano = new Plano(planoo,planoString,rua, numero, cep, complemento);
            if (linha > 0){
                if (this.controller.verificarPlano(this.cliente.getPlanos(), plano)){
                    this.exibeMensagemErro("Erro!! Este endereço já foi inserido.");
                    this.limpaCampos();
                }else if (numero != -999 && cep != -999){
                    this.addLinha(planoString,rua, numero,  cep, complemento,linha);
                    this.cliente.addPlano(plano);
                    this.limpaCampos();
                    linha++;
                }
            }  
            if (linha == 0 && numero != -999 && cep != -999){
                this.addLinha(planoString,rua, numero,  cep,complemento, linha);
                this.cliente.addPlano(new Plano(planoo,planoString,rua, numero, cep, complemento));
                this.limpaCampos();
                linha++;
            }
        }
    }
    
    private void mostrarPlanos(){
        for (Plano i : cliente.getPlanos()){
            int planoo=i.getPlanoo();
            String planoString="";
        
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
    
       private void addLinha(String planoString,String rua, int numero, int cep,String complemento, int linha){
        
        this.tabelaPlanos.setValueAt(planoString, linha, 0);
        this.tabelaPlanos.setValueAt(rua, linha, 1);
        this.tabelaPlanos.setValueAt(numero, linha, 2);
        this.tabelaPlanos.setValueAt(complemento, linha, 3);
        this.tabelaPlanos.setValueAt(cep, linha, 4);
    }
    private void exibeMensagemErro(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem, "Erro",JOptionPane.ERROR_MESSAGE);
    }
    private void limparCampo(String campo){
        if(campo.equals("numero")){
            this.campoNum.setText("");
        }
        if(campo.equals("cep")){
            this.campoCep.setText("");
        }
    }
    private void limpaCampos(){
        this.campoRua.setText("");
        this.campoCep.setText("");
        this.campoComplemento.setText("");
        this.campoNum.setText("");
        this.campoPlano.setText(" ");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoCep;
    private javax.swing.JTextField campoComplemento;
    private javax.swing.JTextField campoNum;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPlanos;
    // End of variables declaration//GEN-END:variables
}
