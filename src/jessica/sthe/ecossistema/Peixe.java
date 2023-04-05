
package jessica.sthe.ecossistema;


public class Peixe extends Animal {
    private String corEscama;

    public Peixe() {
        this.corEscama = corEscama;
    }

    public String getCorescama() {
        return corEscama;
    }

    public void setCorescama(String corescama) {
        this.corEscama = corEscama;
    }

    @Override
    public void emitirsom() {
        System.out.println("nenhum");
          
    }
  
    @Override
    public void alimentar() {
        System.out.println("minhoca");
    }

    @Override
    public void locomover() {
        System.out.println("nadar");
    }
    
    
}
