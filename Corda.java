public class Corda extends  Instrument{

    public Corda(String name, int prize){
        super(name, prize);
    }
    public void tocar (){

        System.out.println("Està sonant un instrument de corda.");
    }
    public static String tocarMetodeEstatic(){
        return "Està sonant un instrument de corda.";

}
}
