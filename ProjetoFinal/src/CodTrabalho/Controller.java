package CodTrabalho;

import java.util.ArrayList;

public class Controller {
    private Model model;
    private Solicitacao solicitacao;
    private static Controller controller;
     ///////SINGLETON//////////
    public static Controller iniciar(){
        if (controller == null)
            controller = new Controller();
        return controller;
    }
    
    private Controller(){
        Usuario funcionario = new Funcionario("Administrador");
        Login loginFuncionario = new Login("funcionario", "funcionario123");
        funcionario.setLogin(loginFuncionario);
        this.model = new Model();
        this.model.addUsuario(funcionario);
        
    }
    ///////SINGLETON//////////
    /////////////Excecao Verificada///////////
    public int validaNumeros(String numero){
        int num;
        try{
            num = Integer.parseInt(numero);
        }catch(NumberFormatException e){
            num = -999;
            System.out.println(e.getMessage());
        }
        return num;
    }
    
    /////////Excecao verificada////////////
    public void validaCadastro(Cliente user){
        this.model.addUsuario(user);
    }
    public boolean validaLogin(Login login){
        return this.model.confirmarlogin(login);
    }
    public boolean verificaLogin(String idUser){
        return this.model.buscaId(idUser);
    }
    public Usuario getUsuario(int indice){
        return this.model.getUsuario(indice);
    }
    public int buscarUser(Login login){
        return this.model.buscaUser(login);
    }
    public boolean verificarPlano(ArrayList<Plano> planos, Plano plano){
        boolean existe = false;
        for (Plano i : planos){
            if (i.getRua().equals(plano.getRua()) && 
                    i.getCEP() == plano.getCEP() &&
                    i.getNumero() == plano.getNumero() &&
                    i.getComplemento().equals(plano.getComplemento())){
                existe = true;
            }
        }
        return existe;
    }
    public void validaUpdateUser(int indice, Usuario user){
        this.model.atualizarUsuario(indice, user);
    }
    public void criarSolicitacao(String descricao, String idCliente, int numSolicitacao){
        this.solicitacao = new Solicitacao(descricao, idCliente, numSolicitacao);
        this.model.addSolicitacao(solicitacao);
    }
    public ArrayList<Solicitacao> validaViewSolicitacoes(){
        return this.model.getSolicitacoes();
    }
    public int validaBusca(int id){
        return this.model.buscaSolicitacao(id);
    }
    public Solicitacao validaViewSolicitacao(int indice){
        return this.model.getSolicitacao(indice);
    }
}
