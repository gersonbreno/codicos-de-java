public class Elevador {
    private int andarAtual;
    private int quantAndares;
    private int capacidade;
    private int quantAtual;

    public Elevador(int capTotal, int quantAndares) {
        this.quantAndares=quantAndares;
        this.capacidade=capTotal;
        this.quantAtual=0;
        this.andarAtual=0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andar) {
        andarAtual=andar;
    }


    public void entrar() {
        if(quantAtual<capacidade)
            this.quantAtual+=1;
        else
            System.out.println("Elevador lotado! Pegue o proximo.");
    }

    public void sair() {
        if(quantAtual==0)
            System.out.println("Elevador vázio!");
        else
        this.quantAtual--;
    }

    public boolean subir() {
        if(andarAtual<quantAndares) {
            andarAtual++;
            return true;
        }
        //System.out.println("Já estamos no último andar!"); Está certa de ambas as forma      
        return false;
    }

    public void descer() {
        if(andarAtual!=0) {
            andarAtual--;
            return;
        }
        System.out.println("Elevador no terreo.");
    }
}