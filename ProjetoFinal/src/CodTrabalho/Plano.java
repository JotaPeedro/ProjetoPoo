package CodTrabalho;

public class Plano {

    private String rua;
    private int numero;
    private int CEP;
    private String complemento;
    private int planoo;
    private String planoString;
    public Plano() {
        
        this.rua = "";
        this.numero = 0;
        this.CEP = 0;
        this.complemento = "";
        
    }

    
    
    
    public Plano(int planoo,String PlanoString,String rua, int numero, int CEP, String complemento) {
        
        this.planoo=planoo;
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

    public int getPlanoo() {
        return planoo;
    }

    public void setPlanoo(int plano) {
        this.planoo = planoo;
    }

    public String getPlanoString() {
        return planoString;
    }

    public void setPlanoString(String planoString) {
        this.planoString = planoString;
    }

}
