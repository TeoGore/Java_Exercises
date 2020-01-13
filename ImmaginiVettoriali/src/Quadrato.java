public class Quadrato extends Forma {
    private double lato;

    public Quadrato(Colore colore, double lato) {
        super(colore);
        this.lato = lato;
    }

    public double perimetro(){
        return 4*lato;
    }
    public double area(){
        return lato*lato;
    }
    @Override
    public String toString() {
        return "Quadrato,\tcolore: " + this.getColore() + "\tlato: " + this.lato;
    }
}
