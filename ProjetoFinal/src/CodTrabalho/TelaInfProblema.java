package CodTrabalho;

import java.awt.CardLayout;
import java.util.Random;
import javax.swing.JOptionPane;

public class TelaInfProblema extends javax.swing.JPanel {
    private Controller controller;
    private Cliente cliente;
    private CardLayout layout;
    public TelaInfProblema(CardLayout layout) {
        initComponents();
        this.layout = layout;
        this.controller = Controller.iniciar();
        this.cliente = Cliente.iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoTexto = new javax.swing.JTextArea();
        btnRealizar = new javax.swing.JButton();
        BotaoVoltar = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Noto Sans Mono", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Informar Problemas na Conexão");

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Descrição do Problema");

        campoTexto.setBackground(new java.awt.Color(204, 204, 255));
        campoTexto.setColumns(20);
        campoTexto.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        campoTexto.setLineWrap(true);
        campoTexto.setRows(5);
        jScrollPane1.setViewportView(campoTexto);

        btnRealizar.setBackground(new java.awt.Color(0, 204, 204));
        btnRealizar.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        btnRealizar.setText("Realizar Solicitação");
        btnRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarActionPerformed(evt);
            }
        });

        BotaoVoltar.setBackground(new java.awt.Color(0, 204, 204));
        BotaoVoltar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        BotaoVoltar.setText("Voltar");
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(406, Short.MAX_VALUE)
                .addComponent(BotaoVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRealizar)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRealizar)
                    .addComponent(BotaoVoltar))
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarActionPerformed
        this.realizarSolicitacao();
    }//GEN-LAST:event_btnRealizarActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        this.layout.show(this.getParent(),"telaServicos");
    }//GEN-LAST:event_BotaoVoltarActionPerformed
    
    private void realizarSolicitacao(){
        Random random = new Random();
        int idSolicitacao = random.nextInt(900000) + 100000;
        if (this.campoTexto.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Erro! Campo descrição vazio.");
        } else{
            this.controller.criarSolicitacao(this.campoTexto.getText().trim(), this.cliente.getLogin().getIdUser(), idSolicitacao);
            this.campoTexto.setText("");
            JOptionPane.showMessageDialog(this, "Solicitação enviada com suceesso", "Notificação", JOptionPane.OK_OPTION);
            this.layout.show(this.getParent(), "telaServicos");
            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JButton btnRealizar;
    private javax.swing.JTextArea campoTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
