package jessica.sthe.ecossistema;

public class Manifero extends Animal{
    private String corPelo;

    public Manifero() {
        this.corPelo = corPelo;
    }

    public String getCorpelo() {
        return corPelo;
    }

    public void setCorpelo(String corpelo) {
        this.corPelo = corpelo;
    }

    @Override
    public void emitirsom() {
        System.out.println("relicha");
    }

    @Override
    public void alimentar() {
        System.out.println("feno e racao");      
    }

    @Override
    public void locomover() {
        System.out.println("passo, trote e galope");
    }
    
    
}
