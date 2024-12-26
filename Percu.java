public class Percu extends Instrument{

    public Percu (String name, int prize){

        super(name, prize);
    }

    public void tocar(){

        System.out.println("Està sonant un instrument de percussió.");
    }
    public static String tocarMetodeEstatic(){
        return "Està sonant un instrument de percussió.";
    }
}
