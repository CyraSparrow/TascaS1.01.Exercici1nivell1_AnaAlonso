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
   //aplicación método static

        System.out.println(Percu.tocarMetodeEstatic());
        System.out.println(Vent.tocarMetodeEstatic());
        System.out.println(Corda.tocarMetodeEstatic());
}
