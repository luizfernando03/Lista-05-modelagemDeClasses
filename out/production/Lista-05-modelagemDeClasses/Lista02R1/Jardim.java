package Lista02R1;

public class Jardim {
   public int metrosGrama;
   public double valorAdubo = 5;
   public  int qtdAdubo;
   public double corteGrama = 5;

   public Jardim(int metrosGrama){
       this.metrosGrama = metrosGrama;
   }

    public double usarAdubo(){
       return ((this.metrosGrama / 2) * 100)/100;

    }
    public double precoCorteGrama(){
       return this.metrosGrama * this.corteGrama;
    }
}
