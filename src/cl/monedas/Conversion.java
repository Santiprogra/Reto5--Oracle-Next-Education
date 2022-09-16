package cl.monedas;

public class Conversion {
    
   Monedas moneda = new Monedas();
   
   public double YenAPesosCol(double yen) {
       
       return (yen * moneda.PRECIO_YEN_JAPONES);
   }
   
   public double PesosColAWon(double pesos) {
       return (pesos / moneda.PRECIO_WON_SURCOREANO);
   }
   
   public double PesosColAEuro(double pesos) {
       return (pesos / moneda.PRECIO_EURO);
   }
   
   public double EuroAPesosCol(double euro) {
       return (euro * moneda.PRECIO_EURO);
   }
   
   public double WonAPesosCol(double won) {
       
       return (won * moneda.PRECIO_WON_SURCOREANO);
   }
   
   public double PesosColADolar(double pesos) {
       return (pesos / moneda.PRECIO_DOLAR);
   }
   
   public double DolarAPesosCol(double dolar) {
       
       return (dolar * moneda.PRECIO_DOLAR);
   }
      
   public double PesosColALibras(double pesos) {
       return (pesos / moneda.PRECIO_LIBRAS_ESTERLINAS);
   }
   
   public double LibrasAPesosCol(double libras) {
       
       return (libras * moneda.PRECIO_LIBRAS_ESTERLINAS);
   }
   
   public double PesosColAYen(double pesos) {
       return (pesos / moneda.PRECIO_YEN_JAPONES);
   }
      
}