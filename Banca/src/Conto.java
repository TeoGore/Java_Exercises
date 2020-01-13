public class Conto {
    private String iban, cf;
    private double saldo;

    public Conto(String iban, String cf) {
        this.iban = iban;
        this.cf = cf;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getIban() {
        return iban;
    }

    public boolean deposito(double qta){
        this.saldo += qta;
        return true;
    }
    public boolean prelievo(double qta){
        if(this.saldo >= qta ){
            this.saldo -= qta;
            return true;
        }else{
            return false;
        }
    }

}
