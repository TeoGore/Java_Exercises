public class TesterImmagini {
    public static void main(String[] args) {
        ImgVect v1 = new ImgVect(4);
        Forma f1 = new Cerchio(Colore.BLUE, 3);
        Forma f2 = new Quadrato(Colore.RED, 4);
        Forma f3 = new Quadrato(Colore.YELLOW, 1);
        Forma f4 = new Rettangolo(Colore.BLUE, 8, 4);
        Forma f5 = new Cerchio(Colore.BLACK, 9);
        v1.NewForm(f1);
        v1.NewForm(f2);
        v1.NewForm(f3);
        v1.NewForm(f4);

        v1.StampaForme(); //non le fa

        System.out.println("ROSSO: " + v1.AreaColore(Colore.RED));
        System.out.println("GIALLO: "+ v1.AreaColore(Colore.YELLOW));
        System.out.println("BLU: " + v1.AreaColore(Colore.BLUE));
        System.out.println("NERO: " + v1.AreaColore(Colore.BLACK));

    }
}
