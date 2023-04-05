package jessica.sthe.ecossistema;


public class Passaro extends ave {
    private String corpenas;

    public Passaro() {
    }

    public Passaro(String corpenas) {
        this.corpenas = corpenas;
    }

    public String getCorpenas() {
        return corpenas;
    }

    public void setCorpenas(String corpenas) {
        this.corpenas = corpenas;
    }

    @Override
    public void emitirsom() {
        System.out.println("cantar");
    }

    @Override
    public void alimentar() {
        System.out.println("insetos");
    }

    @Override
    public void locomover() {
        System.out.println("voar");
    }

    @Override
    public void Status() {
       System.out.println("Peso: " + this.peso);
        System.out.println("idade: " + this.idade);
        System.out.println("membros: " + this.membros);
        System.out.println("as cores das penas sao " + this.getCorpenas());
    }
    
}
