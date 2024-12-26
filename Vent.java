public class Vent extends Instrument {
    public Vent(String name, int prize) {

        super(name, prize);
    }

    public void tocar() {
        System.out.println("Està sonant un instrument de vent.");
    }
    public static String tocarMetodeEstatic(){
        return "Està sonant un instrument de vent.";
    }
}
