package CodTrabalho;

import java.util.ArrayList;

public class Cliente extends Usuario {
    
    private static Cliente cliente;
    private String nome;
    private ArrayList<Plano> planos = new ArrayList<>();
    private Login login;
    private String email;
    private int telefoneResidencial;
    private int telefoneCelular;
    private ContaBancaria contaBancaria = new ContaBancaria();
    private int CodigoCliente;
    ///////SINGLETON//////////
    public static Cliente iniciar(){
        if (cliente == null)
            cliente = new Cliente();
        return cliente;
    }
    public static void fechar(){
        cliente = null;
    }
    public static void setCliente(Cliente user){
        cliente = user;
    }
    public static Cliente getCliente(){
        return cliente;
    }
    
    //////SINGLETON//////////
    private Cliente(){
    }
    
    public void setContaBancaria(ContaBancaria contaBancaria){
        this.contaBancaria = contaBancaria;
    }
    public ContaBancaria getContaBancaria(){
        return this.contaBancaria;
    }
    public int getTelResidencial(){
        return this.telefoneResidencial;
    }
    public void setTelResidencial(int num){
        this.telefoneResidencial = num;
    }
    public int getTelCelular(){
        return this.telefoneCelular;
    }
    public void setTelCelular(int num){
        this.telefoneCelular = num;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void addPlano(Plano plano){
        this.planos.add(plano);
    }
    public ArrayList<Plano> getPlanos(){
        return this.planos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    @Override
    public Login getLogin() {
        return this.login;
    }

    @Override
    public void setLogin(Login login) {
        this.login = login;
    }

    
    @Override
    public String getTipo() {
        return this.getClass().getSimpleName();
    }
}
