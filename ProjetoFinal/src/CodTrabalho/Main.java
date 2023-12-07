package CodTrabalho;


public class Main {

   

   
    public void iniciar() {
        JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
        janelaPrincipal.setVisible(true);
    }

   
    
    public Main(){
        this.iniciar();
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
