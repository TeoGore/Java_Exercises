import java.util.Scanner;

/**
 *
 * @version 1.8
 * @author Matteo Goretti
 */

public class Main {
    public static void main(String[] args) {
        int n; //numero delle squadre
        Scanner in = new Scanner(System.in); //in è il buffer di input
        System.out.print("Inserire il numero delle Squadre: ");
        n = in.nextInt();
        System.out.println("Inserire il nome delle squadre:");
        Squadra[] s = new Squadra[n];
        Squadra temp = new Squadra(); //istanzio oggetto temporaneo per avviare metodi
        for(int i=0;i<s.length;i++){ // alloco memoria per le squadre
            s[i] = new Squadra();
            s[i].inizializzazione((i + 1));
        }

        //PARTITE
        for(int i=0;i<(n-1);i++){
            for(int j=i+1;j<(n);j++){
                temp.partita(s[i], s[j]);
            }
        }

        //STAMPA CLASSIFICA
        System.out.println("SQUADRE\t\t\tV\tP\tS\tPTI\tPG");
        for(int i =0;i<n;i++){          //calcolo differenza reti
            s[i].differenzaReti();
        }
        temp.ordinamento(s,n);          //ORDINO
        for(int i=0;i<s.length;i++){    //STAMPO
            s[i].stampa();
        }

    }
}
