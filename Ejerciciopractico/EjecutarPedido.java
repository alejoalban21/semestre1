package Ejerciciopractico;

import java.util.Date;

public class EjecutarPedido {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("12323", "Andres Rivera");
        Foto foto = new Foto("foto1.jpg");
        Foto foto1 = new Foto("foto2.jpg");
        Foto[] fotos = new Foto[2];
        fotos[0] = foto;
        fotos[1] = foto1;
        Impresion impresion = new Impresion(1, "Verde", fotos);
        Camara camara = new Camara(2, "Canon", "EOS Rebel");
        Producto[] productos = new Producto[2];
        productos[0] = impresion;
        productos[1] = camara;
        Date now = new Date();
        TipoDePago tipoDePago1 = new TarjetaCredito();
        Pedido pedido = new Pedido(cliente1, productos, now, 1233, tipoDePago1);
        pedido.mostrarPedido();
        pedido.imprimirPago();
        impresion.printFotos();
        System.out.println(camara);
    }
}