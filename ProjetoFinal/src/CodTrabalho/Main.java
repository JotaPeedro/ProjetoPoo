package CodTrabalho;

public class Main {

    public void iniciar() {
        JanelaLogin janelaLogin = new JanelaLogin();
        janelaLogin.setVisible(true);
    }

    public Main() {
        this.iniciar();
    }

    public static void main(String[] args) {
        new Main(); 
    }
}
