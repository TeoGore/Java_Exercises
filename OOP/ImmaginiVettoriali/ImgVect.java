public class ImgVect {
    private final int MAX_FORME;
    private int contForme;
    private Forma[] f;

    public ImgVect(int max){
        this.MAX_FORME = max;
        this.contForme = 0;
        this.f = new Forma[max];
    }

    public void NewForm(Forma forma){
        if(contForme<MAX_FORME){
            f[contForme] = forma;
            contForme++;
        }else{
            System.out.println("Raggiunto numero massimo di forma!!!");
        }
    }

    public double AreaTotale(){
        double area = 0;
        for(int i =0;i<=contForme;i++){
            area += f[i].area();
        }
        return area;
    }

    public double AreaColore(Colore c){
        double area = 0;
        for(int i =0;i<contForme;i++){
            if(f[i].getColore() == c){
                area += f[i].area();
            }
        }
        return area;
    }
    public void StampaForme(){
        for(int i =0; i< contForme; i++){
            System.out.println(f[i].toString());
        }
    }

}
