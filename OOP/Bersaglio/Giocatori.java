public class Giocatori {
    private String nome;
    private int punti;

    public Giocatori(String nome) {
        this.nome = nome;
        this.punti = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPunti() {
        return punti;
    }

    public void centro(boolean finale){
        if(finale) {
            punti += 3;
        }else{
            punti += 1;
        }
    }



}
