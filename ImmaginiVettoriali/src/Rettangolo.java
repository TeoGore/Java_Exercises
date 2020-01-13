public class Rettangolo extends Forma{
    private double base, altezza;

    public Rettangolo(Colore colore, double base, double altezza) {
        super(colore);
        this.base = base;
        this.altezza = altezza;
    }

    public double perimetro(){
        return 2*(base + altezza);
    }
    public double area(){
        return base*altezza;
    }
    @Override
    public String toString() {
        return "Rettangolo,\tcolore: " + this.getColore() + "\tbase: " + base + "\taltezza: " + altezza;
    }
}
