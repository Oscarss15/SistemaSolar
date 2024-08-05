package dev.oscar;

public class Planeta {
    
     String nombre=null;
     int cantSatelites = 0;
     double masa= 0;
     double volumen =0;
     int diametro =0;
     int distanciamediaSol= 0;
     enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO}
     tipoPlaneta tipo;
     boolean observable =false;


    public Planeta(String nombre, int cantSatelites, double masa, double volumen, int diametro, int distanciamediaSol,
            tipoPlaneta tipo, boolean observable) {
        this.nombre = nombre;
        this.cantSatelites = cantSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciamediaSol = distanciamediaSol;
        this.tipo = tipo;
        this.observable = observable;
    }


void imprimir() {
System.out.println("Nombre del planeta = " + nombre);
System.out.println("Cantidad de satélites = " + cantSatelites);
System.out.println("Masa del planeta = " + masa);
System.out.println("Volumen del planeta = " + volumen);
System.out.println("Diámetro del planeta = " + diametro);
System.out.println("Distancia al sol = " + distanciamediaSol);
System.out.println("Tipo de planeta = " + tipo);
System.out.println("Es observable = " + observable);
}


}
