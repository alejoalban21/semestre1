package Ejerciciopractico;

public class Camara extends Producto{
    
    private String marca;
    private String modelo;
    
    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Camara [marca=" + marca + ", modelo=" + modelo + "]";
    }    
        
}