package Ejerciciopractico;

import java.util.Arrays;

public class Impresion extends Producto{

    private String color;
    private Foto[] fotos;
    
    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    public void printFotos(){
        System.out.println("Imprimiendo en color: " + color);
        for (int i = 0; i < fotos.length; i++) {
            fotos[i].print();
        }
    }

    @Override
    public String toString() {
        return "Impresion [color=" + color + ", fotos=" + Arrays.toString(fotos) + "]";
    }
    
    
}