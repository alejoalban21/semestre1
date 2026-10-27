package Ejerciciopractico;

public class Foto {
    
    public String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public void print(){
        System.out.println("Imprimiendo fichero: " + fichero);
    }
}