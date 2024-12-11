public abstract class Instrument {
    //Atributos
    private String name;
    private int prize;

    // Constructor
    public Instrument(String name, int prize){
        this.name = name;
        this.prize = prize;

    }
    // Getters
    public String getName(){
        return name;
    }
    public int getPrize(){
        return prize;
    }
    // Setters
    public void setName (String name) {
        this.name = name;
    }
    public void setPrize (int prize){
        this.prize = prize;
    }

    // Metodo propio
    public abstract void tocar();

    static {
        System.out.println("La classe Instrument s'ha carregat.");
    }
}

