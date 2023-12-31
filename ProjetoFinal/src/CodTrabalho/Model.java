package CodTrabalho;

import java.util.ArrayList;

public class Model {
    
    private ArrayList<Usuario> usuarios;
    private ArrayList<Solicitacao> solicitacoes;
    
    public Model(){
        this.usuarios=new ArrayList<>();
        this.solicitacoes=new ArrayList<>();
    }
    
    public void addUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }
    public void addSolicitacao(Solicitacao solicitacao){
        this.solicitacoes.add(solicitacao);
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }
    
    public Usuario getUsuario(int indice){
        return this.usuarios.get(indice);
    }
    
    public boolean confirmarlogin(Login login){
        boolean existelogin=false;
        boolean existesenha=false;
        boolean existe=false;
        
        for (Usuario i : this.getUsuarios()) {
            if (i.getLogin().getIdUser().equals(login.getIdUser())) {
                existelogin=true;
            }
            if (i.getLogin().getSenha().equals(login.getSenha())) {
                existesenha=true;
            }
            
            if (existelogin && existesenha) {
                existe=true;
            }
        }
        return existe;
    }
    
    public int buscaUser(Login login){
        int index = -999;
        int count = 0;
        for (Usuario i : this.getUsuarios()){
            if (i.getLogin().getIdUser().equals(login.getIdUser()) &&
                    i.getLogin().getSenha().equals(login.getSenha())){
                index = count;
            }
            count++;
        }
        return index;
    }
    
    public boolean buscaId(String idUser){
        boolean existe = false;
        for (Usuario i : this.usuarios){
            if (i.getLogin().getIdUser().equals(idUser)){
                existe = true;
            }
        }
        return existe;
    }
    
    public void atualizarUsuario(int indice, Usuario user){
        this.usuarios.set(indice, user);
    }
    
    public int buscaSolicitacao(int id){
        int encontrou = -999;
        int count = 0;
        for (Solicitacao s : this.getSolicitacoes()){
            if (s.getId() == id){
                encontrou = count;
            }
            count++;
        }
        return encontrou;
    }
    
    public Solicitacao getSolicitacao(int indice){
        return this.solicitacoes.get(indice);
    }
}
