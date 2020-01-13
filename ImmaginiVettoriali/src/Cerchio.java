public class Cerchio extends Forma {
    private double raggio;

    public Cerchio(Colore colore, double raggio) {
        super(colore);
        this.raggio = raggio;
    }

    public double perimetro(){
        return raggio*2*Math.PI;
    }

    public double area(){
        return Math.PI*raggio*raggio;
    }

    @Override
    public String toString() {
        return "Cerchio,\tcolore: " + this.getColore() + "\traggio: " + this.raggio;
    }
}
