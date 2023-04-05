package jessica.sthe.ecossistema;
public abstract class Animal {
      protected float peso;
      protected int idade;
      protected int membros;

    public Animal() {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    public void locomover() {
        
    }
      public void alimentar() {
          
      }
      public void emitirsom(){
          
      }
    public void Status(){
        System.out.println("Peso: " + this.peso);
        System.out.println("idade: " + this.idade);
        System.out.println("membros: " + this.membros);
        
    }
      
}
