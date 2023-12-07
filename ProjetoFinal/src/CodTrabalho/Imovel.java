package CodTrabalho;

public class Imovel {

    private String rua;
    private int numero;
    private int CEP;
    private String complemento;
    private String plano;

    public Imovel() {
        this.plano = "";
        this.rua = "";
        this.numero = 0;
        this.CEP = 0;
        this.complemento = "";
    }

    public Imovel(String plano, String rua, int numero, int CEP, String complemento) {
        this.plano = plano;
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

}
