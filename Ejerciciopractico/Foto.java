package Ejerciciopractico;

public class Foto {
    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    @Override
    public String toString() {
        return "Foto [fichero=" + fichero + "]";
    }
    
}
