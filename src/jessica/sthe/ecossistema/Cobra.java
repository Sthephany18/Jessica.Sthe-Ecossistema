package jessica.sthe.ecossistema;

public class Cobra extends Reptil  {
    private String Cor;

    public Cobra() {
    }

    public Cobra(String Cor) {
        this.Cor = Cor;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    @Override
    public void emitirsom() {
        System.out.println("nenhum");
    }

    @Override
    public void alimentar() {
        System.out.println("ratos");
    }

    @Override
    public void locomover() {
        System.out.println("rastejar");
    }

    @Override
    public void Status() {
      System.out.println("Peso: " + this.peso);
        System.out.println("idade: " + this.idade);
        System.out.println("membros: " + this.membros);
        System.out.println("a cor da cobra é " + this.getCor());
    }
    
}
