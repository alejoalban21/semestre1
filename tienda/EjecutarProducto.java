package tienda;

public class EjecutarProducto {
    public static void main(String[] args) {

        // crear el objeto de la clase producto
        Producto objProd1 = new Producto("001", "Arroz", 3.5, 100);
        Producto objProd2 = new Producto("002", "Leche", 4.0, 50);
        Producto objProd3 = new Producto("003", "Aceite", 10.0, 30);

        // mostrar la informacion del objeto

        System.out.println(objProd1);
        System.out.println(objProd2);
        System.out.println(objProd3);

        // Uso de los métodos get y set
        System.out.println(objProd1.getnombre()); // Arroz
        System.out.println(objProd3.getprecio()); // 10.0

        // Cambiar el nombre del objeto "objProd2"
        objProd2.setnombre("Frijoles");

        // Cambiar el precio del objeto "objProd2"
        objProd2.setprecio(5.0);

        // Mostrar el objeto completo
        System.out.println(objProd2); // Producto [ codigo: 002 nombre: Frijoles precio: 5.0 stock: 50 ]

        // validar con el método vender que la cantidad sea menor o igual al stock
        // disponible

        System.out.println(objProd1); // Producto [ codigo: 001 nombre: Arroz precio: 3.5 stock: 80 ]
        objProd1.vender(5); // la cantidad no puede ser mayor al stock disponible

        System.out.println(objProd1.getstock());
        objProd1.reabastecer(20);
        System.out.println(objProd1.getstock());
        System.out.println("el inventario total es: " + objProd1.calcularValorInventario());

        // arreglos

        Producto[] productos = new Producto[3];

        // Guardar los objetos en el arreglo
        productos[0] = objProd1;
        productos[1] = objProd2;
        productos[2] = objProd3;
        
        //recorrer y mostrar los nombres

        for(int i = 0;i<productos.length;i++){
            System.out.println("productos disponibles actualmente: " + productos[i].getnombre());
        }
        //nombre y precios de los productos 
        for (int i = 0; i < productos.length; i++){
            System.out.println("nommbre del producto: "+ productos[i].getnombre() + " el precio es: "+ productos[i].getprecio());
        }
        //nombre y stock de los productos   
        for (int i = 0; i<productos.length; i ++){
            System.out.println("nombre del producto: " + productos[i].getnombre() + " el stock disponible es: "+  productos[i].getstock());
        }
    }

}
