package jessica.sthe.ecossistema;
public class JessicaStheEcossistema {    
    public static void main(String[] args) {
      
    Manifero cavalo = new Manifero();   
        System.out.println("CAVALO");
    cavalo.setPeso(500);
    cavalo.setIdade(2);
    cavalo.setMembros(4);
    cavalo.emitirsom();
    cavalo.alimentar();
    cavalo.locomover();
    cavalo.Status();
        System.out.println("******************************");
        System.out.println("Peixinho");
    Peixe dory = new Peixe();
    dory.setPeso(0.5f);
    dory.setMembros(3);
    dory.setIdade(1);
    dory.alimentar();
    dory.emitirsom();
    dory.locomover();
    dory.Status();
        System.out.println("**************************");
        System.out.println("Calango do lulinha");
    Reptil calango = new Reptil();
    calango.setPeso(1.0f);
    calango.setIdade(2);
    calango.setMembros(4);
    calango.alimentar();
    calango.emitirsom();
    calango.locomover();
    calango.Status();
        System.out.println("*****************************");
        System.out.println("Piriquito");
    ave rosa = new ave();
    rosa.setPeso(1.0f);
    rosa.setIdade(10);
    rosa.setMembros(4);
    rosa.alimentar();
    rosa.emitirsom();
    rosa.locomover();
    rosa.Status();
        System.out.println("*****************************");
        System.out.println("sapo");
        Anfibios sapo = new Anfibios();
        sapo.setIdade(1);
        sapo.setMembros(4);
        sapo.setPeso(5);
        sapo.setTipoRespiracao("bronquial");
        sapo.locomover();
        sapo.alimentar();
        sapo.emitirsom();
        sapo.Status();
        System.out.println("*****************************");
        System.out.println("tubarão");
        Tubarao tmartelo = new Tubarao();
        tmartelo.setTipotubarao("tubarão matelo");
        tmartelo.setIdade(2);
        tmartelo.setMembros(2);
        tmartelo.setPeso(3);
        tmartelo.alimentar();
        tmartelo.emitirsom();
        tmartelo.Status();
    }
    
}
