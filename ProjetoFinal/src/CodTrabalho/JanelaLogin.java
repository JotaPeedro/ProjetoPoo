package CodTrabalho;

import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

        

public class JanelaLogin extends javax.swing.JFrame{
    private CardLayout paginas;
    private Controller controller;
    
    public JanelaLogin() {
        initComponents();
        controller = Controller.iniciar();
        paginas = (CardLayout) this.painelPrincipal.getLayout();
        this.painelPrincipal.add(new TelaCentral(paginas), "telaServicos");
        this.painelPrincipal.add(new TelaCentralF(paginas), "telaServFuncionario");
        this.painelPrincipal.add(new TelaProblemas(paginas), "telaSolicitacoesFuncionario");
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Central do Assinante");
        setSize(new java.awt.Dimension(700, 500));

        painelPrincipal.setLayout(new java.awt.CardLayout());

        painelLogin.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Noto Sans Mono", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Central do Assinante");

        jLabel2.setBackground(new java.awt.Color(0, 204, 255));
        jLabel2.setFont(new java.awt.Font("Noto Sans Mono", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Login");

        jLabel3.setBackground(new java.awt.Color(0, 204, 255));
        jLabel3.setFont(new java.awt.Font("Noto Sans Mono", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Senha");

        campoID.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N

        campoSenha.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N

        btnEntrar.setBackground(new java.awt.Color(0, 204, 204));
        btnEntrar.setFont(new java.awt.Font("Noto Sans Mono", 0, 18)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(0, 204, 204));
        btnCadastrar.setFont(new java.awt.Font("Noto Sans Mono", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addGap(83, 83, 83)
                        .addComponent(btnEntrar)
                        .addGap(15, 15, 15)))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(96, 96, 96))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar)
                    .addComponent(btnCadastrar))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        painelPrincipal.add(painelLogin, "janelaLogin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        JanelaCadastro janelaCadastro = JanelaCadastro.iniciar(controller);
        janelaCadastro.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                JanelaCadastro.fechar();
            }
        });
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String idUser = this.campoID.getText();
        String senha = this.campoSenha.getText();
        Login login = new Login(idUser, senha);
        Cliente cliente = Cliente.iniciar();
  
        this.limparCampos();
        
        /////////POLIMORFISMO/////////////
      if (this.controller.validaLogin(login)) {
            int posiUser = this.controller.buscarUser(login);
            Usuario user = (Usuario) this.controller.getUsuario(posiUser);

            if (user instanceof Funcionario) {
                paginas.show(this.painelPrincipal, "telaServFuncionario");
            } else if (user instanceof Cliente) {
                Cliente client = (Cliente) user;
                Cliente.setCliente(client);
                this.painelPrincipal.add(TelaPlanos.iniciar(paginas), "telaInfos");
                this.painelPrincipal.add(new TelaCadastroPlano(paginas), "telaCadastroPlano");
                this.painelPrincipal.add(new TelaInfProblema(paginas), "telaProblemaConexao");
                paginas.show(this.painelPrincipal, "telaServicos");
            }
    } else {
        JOptionPane.showMessageDialog(this, "Usuário e/ou senha incorretos", "Login Incorreto", JOptionPane.ERROR_MESSAGE);
    }
       /////////POLIMORFISMO/////////////
       
    }//GEN-LAST:event_btnEntrarActionPerformed
     public void limparCampos(){
        this.campoID.setText("");
        this.campoSenha.setText("");
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
            java.util.logging.Logger.getLogger(JanelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JanelaLogin principal = new JanelaLogin();
                principal.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JTextField campoID;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel painelLogin;
    public javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables

}
