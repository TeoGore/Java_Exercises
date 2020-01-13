import java.util.Scanner;

public class Squadra {
    private String nome;
    private int v,s,p,pg, pti, golfatti, golpresi, diffreti;// vittorie, sconfitte, pareggi, partite giocate, punti in classifica
    Scanner in = new Scanner(System.in);

    public void inizializzazione(int n){
        System.out.println("Squadra" + n + " : ");
        nome = in.nextLine();
        v = 0;
        s = 0;
        p = 0;
        pg = 0;
        pti = 0;
        golfatti =0;
        golpresi =0;
        diffreti =0;
    }

    public void partita(Squadra s1, Squadra s2){
        int gols1, gols2;
        gols1 = (int)(10*Math.random());
        gols2 = (int)(10*Math.random());
        s1.golfatti = gols1;
        s1.golpresi = gols2;
        s2.golfatti = gols2;
        s2.golpresi = gols1;
        if(gols1 > gols2){
            //VITTORIA s1
            s1.v +=1;
            s1.pg +=1;
            s1.pti +=3;
            s2.s +=1;
            s2.pg +=1;
        } else if(gols1 < gols2){
            //VITTORIA s2
            s2.v +=1;
            s2.pg +=1;
            s2.pti +=3;
            s1.s +=1;
            s1.pg +=1;
        }else{
            //PAREGGIO
            s1.p +=1;
            s1.pg +=1;
            s1.pti +=1;
            s2.p +=1;
            s2.pg +=1;
            s2.pti +=1;
        }

    }
    public void differenzaReti(){
        diffreti = golfatti - golpresi;
    }

    public void ordinamento(Squadra s[], int n){
        Squadra tmp= new Squadra();

        for (int i=0; i < (n-1); i++) {
            if ((s[i + 1].pti > s[i].pti) || (s[i + 1].pti == s[i].pti) && (s[i + 1].diffreti > s[i].diffreti)) {
                //faccio swap
                tmp =s[i];
                s[i] = s[i+1];
                s[i+1] = tmp;

                i=-1;
            }
        }
    }
    public void stampa(){
        System.out.println(nome +"\t\t\t"+ v +"\t"+ p +"\t"+ s +"\t"+ pti +"\t"+ pg);
    }

}
