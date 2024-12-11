public class ClasePrincipal{
 public static void main(String[] args){


                System.out.println("La classe Main s'ha carregat.");



                Instrument saxofon = new Vent("Saxofón", 2000);
                Instrument violin = new Corda("Violín", 1500);
                Instrument bateria = new Percu("Bateria", 800);


                saxofon.tocar();
                violin.tocar();
                bateria.tocar();
        }
}
