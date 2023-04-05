package jessica.sthe.ecossistema;


public class Anfibios extends Animal {
    private String tipoRespiracao;

    public Anfibios(String tipoRespiracao) {
        this.tipoRespiracao = tipoRespiracao;
    }

    public Anfibios() {
    }

    

    public String getTipoRespiracao() {
        return tipoRespiracao;
    }

    public void setTipoRespiracao(String tipoRespiracao) {
        this.tipoRespiracao = tipoRespiracao;
    }

    @Override
    public void emitirsom() {
        System.out.println("coaxar");
    }

    @Override
    public void alimentar() {
        System.out.println("insetos");
    }

    @Override
    public void locomover() {
        System.out.println("nadam");
    }
    
     
}
