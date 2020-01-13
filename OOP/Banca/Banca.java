public class Banca {
    private String nome, radiceIban = "IT000";
    private int maxConti, contiAttivi;
    private Conto[] conti;

    public Banca(String nome, int maxConti) {
        this.nome = nome;
        this.maxConti = maxConti;
        contiAttivi = 0;
        this.conti = new Conto[this.maxConti];
    }

    public Conto aggiungiConto(String cf){ //stampare il riferimento
       String iban;
        iban = this.radiceIban + this.nome + (contiAttivi+1);
        conti[contiAttivi] = new Conto(iban, cf);
        this.contiAttivi++;             //++contiAttivi
        System.out.println("Conto aggiunto!");
        return conti[(contiAttivi-1)];
    }

    public int getContiAttivi() {
        return contiAttivi;
    }

    public String IBAN(int n){
        return conti[n].getIban();
    }

    public double totaleSaldi(){
        double totale=0;
        for(int i =0;i<this.conti.length;i++){
            totale += conti[i].getSaldo();
        }
        return totale;
    }

    public void operazione(String iban, double qta){
        int pos =0;
        for(int i=0;i<maxConti;i++){
            if(conti[i].getIban().equals(iban)){
                pos =i;
                break;
            }
        }
        if(qta>0){
            conti[pos].deposito(qta);
            System.out.println("Entrano " + qta + "$");
        }else{
            conti[pos].prelievo(qta);
            System.out.println("Escono " + Math.abs(qta) + "$");
        }
    }

    public Conto getConto(String iban){ //cosa ritorna
        for(int i=0;i<maxConti;i++){
            if(conti[i].getIban().equals(iban)){
                return conti[i];
            }
        }
        System.out.println("CONTO NON TROVATO!");
        return null;
    }

}
