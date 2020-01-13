public  abstract class Forma {
     private Colore colore;

    public Colore getColore() {
        return colore;
    }

    public Forma(Colore colore) {
        this.colore = colore;
    }

    public abstract double perimetro();
    public abstract double area();

}
