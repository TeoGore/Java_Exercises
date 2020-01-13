public class TesterConto {
    public static void main(String[] args) {
        Conto tmp = new Conto("aaaa1111", "GRTMTT");

        double n =2000;
        System.out.println(tmp.prelievo(n));
        System.out.println(tmp.deposito(n));

    }
}
