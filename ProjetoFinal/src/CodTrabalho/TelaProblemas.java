package CodTrabalho;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class TelaProblemas extends javax.swing.JPanel {
    private Controller controller;
    private CardLayout layout;

    public TelaProblemas(CardLayout layout) {
        initComponents();
        this.setVisible(true);
        controller = Controller.iniciar();
        this.layout = layout;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoIdSolicitacao = new javax.swing.JTextField();
        btnVisualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSolicitacoes = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnAtualiza = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Noto Sans Mono", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Solicitações");

        jLabel2.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Cód. Solicitação");

        campoIdSolicitacao.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N

        btnVisualizar.setBackground(new java.awt.Color(0, 204, 204));
        btnVisualizar.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        tabelaSolicitacoes.setAutoCreateRowSorter(true);
        tabelaSolicitacoes.setBackground(new java.awt.Color(204, 204, 255));
        tabelaSolicitacoes.setFont(new java.awt.Font("Noto Sans Mono", 0, 12)); // NOI18N
        tabelaSolicitacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID User", "Cód.", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaSolicitacoes);

        btnVoltar.setBackground(new java.awt.Color(0, 204, 204));
        btnVoltar.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

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
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(campoIdSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVisualizar)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtualiza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoIdSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnAtualiza))
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        int idSolicitacao = this.controller.validaNumeros(this.campoIdSolicitacao.getText().trim());
        int indiceSolicitacao = -999;
        if (idSolicitacao != -999 || this.campoIdSolicitacao.getText().trim().isEmpty()){
            indiceSolicitacao = this.controller.validaBusca(idSolicitacao);
            if (indiceSolicitacao == -999){
                JOptionPane.showMessageDialog(this, "Solicitação não encontrada", "Notificação", JOptionPane.INFORMATION_MESSAGE);
                indiceSolicitacao = -999;
            } else if (indiceSolicitacao >= 0){
                //this.btnVisualizar.addActionListener(new JanelaListener(indiceSolicitacao));
                JanelaSolicitacao janelaSolicitacao = JanelaSolicitacao.iniciar(indiceSolicitacao);
                janelaSolicitacao.addWindowListener(new WindowAdapter(){
                    @Override
                    public void windowClosing(WindowEvent e){
                        JanelaSolicitacao.fechar();
                    }
                });
            }
        } else{
            JOptionPane.showMessageDialog(this, "Erro!! Caractere inválido no campo busca.", "Erro", JOptionPane.ERROR_MESSAGE);
            this.campoIdSolicitacao.setText("");
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed
        this.mostrarSolicitacoes();
    }//GEN-LAST:event_btnAtualizaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.layout.show(this.getParent(), "telaServFuncionario");
    }//GEN-LAST:event_btnVoltarActionPerformed
      
    public void mostrarSolicitacoes(){
        int linha = 0;
        for (Solicitacao s : this.controller.validaViewSolicitacoes()){
            this.tabelaSolicitacoes.setValueAt(s.getIdCliente(), linha, 0);
            this.tabelaSolicitacoes.setValueAt(Integer.toString(s.getId()), linha, 1);
            this.tabelaSolicitacoes.setValueAt(s.getDescricao(), linha, 2);
        }
    }
    
    private class JanelaListener implements ActionListener{
        int indice;
        public JanelaListener(int indice){
            this.indice = indice;
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
            JanelaSolicitacao janelaSolicitacao = JanelaSolicitacao.iniciar(this.indice);
            janelaSolicitacao.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                    JanelaSolicitacao.fechar();
                }
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoIdSolicitacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaSolicitacoes;
    // End of variables declaration//GEN-END:variables
}
