public class Bersaglio {

    private double x = 100;
    private double y = 0;
    private double R = 10000;
    private double vx, vy, v, teta, th; //th = tempo in cui x e' in xn, yh e' altezza freccia quandoal tempo th
    private int yh;

    public double getX(){
        return (x*Math.random());
    }
    public double getY(){
        return (y*Math.random());
    }
    public double getR(){
        return (R*Math.random() + 4);
    }
    public void getV(double vin, double beta){
        v = vin;
        double teta = (beta*Math.PI)/180.;
        this.teta = teta;
        vx = v*Math.cos(teta);
        vy = v*Math.sin(teta);
    }

    public void hit(Giocatori p, boolean x3){
        th = x/vx;
        yh = (int)(vy*th -5*Math.pow(th,2));

        if(yh<=(int)(y-R) || yh>=(int)(y+R)){
            System.out.println("MANCATO !!!\n\n");
        }else{
            System.out.println("COLPITO, grande!!!\n\n");
            p.centro(x3);
        }
    }


}
