public class TesterBanca {
    public static void main(String[] args) {
        Banca b = new Banca("UBI", 3);
        b.aggiungiConto("dpg9899");


        System.out.println("Saldo totale: " + b.totaleSaldi());
        //aggiungere conti e fare operazioni sopra. controllare che funzioni
        for(int i =0;i<(b.getContiAttivi()) ;i++){
            System.out.println("Conto" + i + ": " + b.IBAN(i));
        }

    }
}
