package CodTrabalho;

public class Imovel {

    private String rua;
    private int numero;
    private int CEP;
    private String complemento;
    private int plano;
    private String planoString;
    public Imovel() {
        
        this.rua = "";
        this.numero = 0;
        this.CEP = 0;
        this.complemento = "";
        
    }

    
    
    
    public Imovel(int plano,String PlanoString,String rua, int numero, int CEP, String complemento) {
        
        this.plano=plano;
        this.planoString=planoString;
        this.rua = rua;
        this.numero = numero;
        this.CEP = CEP;
        this.complemento = complemento;
        
        
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public int getCEP() {
        return CEP;
    }

    public String getComplemento() {
        return complemento;
    }

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }

    public String getPlanoString() {
        return planoString;
    }

    public void setPlanoString(String planoString) {
        this.planoString = planoString;
    }

}
