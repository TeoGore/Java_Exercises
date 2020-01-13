import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Bersaglio b1 = new Bersaglio();
        int ngiocatori, turni;
        double xb, yb, rb;
        boolean finale = false;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Inserire il numero di giocatori: ");
            ngiocatori = in.nextInt();
        }while(ngiocatori < 1);
        do {
            System.out.println("Inserire il numero di turni: ");
            turni = in.nextInt();
        }while(turni < 1);
        Giocatori[] g = new Giocatori[ngiocatori];


        //inizializzo giocatori
        for(int i =0;i<g.length;i++){
            System.out.print("Nome giocatore " + (i+1) + ": ");
            g[i] = new Giocatori(in.next());
        }

        for(int i =0;i<turni;i++){ //conto i turni
            System.out.println("Turno " + (i+1) + "/" + turni + " :");
            if(i == (turni-1)) finale = true;
            for(int j =0;j<ngiocatori;j++){ //turno per ogni giocatore
                System.out.println("Tocca a: " + g[j].getNome() + "\n");

                xb = b1.getX(); //inizializzo bersaglio
                yb = b1.getY();
                rb = b1.getR();
                System.out.println("Il bersaglio si trova in (" + String.format("%.2f", xb) + " , " + String.format("%.2f", yb) + " )");
                System.out.println("Raggio: " + (int)rb);
                b1.getV((in.nextDouble()), in.nextDouble()); // prendo velocita
                b1.hit(g[j], finale);
            }
        }
        //ordino classifica
        Giocatori tmp = new Giocatori("temporaneo");
        for(int i =1;i<g.length;i++){
            if(g[i].getPunti() > g[i-1].getPunti()){
                tmp = g[i];
                g[i] = g[i-1];
                g[i-1] = tmp;
                i = 0;
            }
        }

        //Stampo classifica
        System.out.println("NOME\t\tPUNTI");
        for(int i =0;i<g.length;i++){
            System.out.println(g[i].getNome() + "\t\t"  + g[i].getPunti());
        }

    }

}