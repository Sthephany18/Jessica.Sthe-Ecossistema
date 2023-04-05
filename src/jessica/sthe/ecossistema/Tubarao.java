package jessica.sthe.ecossistema;

public class Tubarao extends Peixe{
    private String Tipotubarao;

    public Tubarao() {
    }

    public Tubarao(String Tipotubarao) {
        this.Tipotubarao = Tipotubarao;
    }

    public String getTipotubarao() {
        return Tipotubarao;
    }

    public void setTipotubarao(String Tipotubarao) {
        this.Tipotubarao = Tipotubarao;
    }

    @Override
    public void locomover() {
        System.out.println("nadar");
    }

    @Override
    public void alimentar() {
        System.out.println("peixes menores");
    }

    @Override
    public void emitirsom() {
        System.out.println("nenhum");
    }

    @Override
    public void Status() {
        System.out.println("o tipo do tubarao e " + this.getTipotubarao());
        System.out.println("Peso: " + this.peso);
        System.out.println("idade: " + this.idade);
        System.out.println("membros: " + this.membros);
    }
    
   
    
    
}
