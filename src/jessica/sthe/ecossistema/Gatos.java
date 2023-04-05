package jessica.sthe.ecossistema;

public class Gatos extends Manifero {
    private String CorOlhos;

    public Gatos() {
    }

    public Gatos(String CorOlhos) {
        this.CorOlhos = CorOlhos;
    }

    public String getCorOlhos() {
        return CorOlhos;
    }

    public void setCorOlhos(String CorOlhos) {
        this.CorOlhos = CorOlhos;
    }

    @Override
    public void Status() {
        System.out.println("a cor dos olhos sao: " + this.getCorOlhos());
        System.out.println("Peso: " + this.peso);
        System.out.println("idade: " + this.idade);
        System.out.println("membros: " + this.membros);
    }

    @Override
    public void locomover() {
        System.out.println("patas");
    }

    @Override
    public void alimentar() {
        System.out.println("peixe");
    }

    @Override
    public void emitirsom() {
        System.out.println("miar");
    }
    
}
