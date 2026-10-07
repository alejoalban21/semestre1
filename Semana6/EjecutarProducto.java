package Semana6;

public class EjecutarProducto {
    public static void main(String[] args) {
    
        // crear el objeto de la clase producto
        Producto objProd1 = new Producto("001", "Arroz", 3.5, 100);
        Producto objProd2 = new Producto("002", "Frijol", 4.5, 50);
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
    
        // validar con el método vender que la cantidad sea menor o igual al stock disponible
        objProd1.vender(20);
        System.out.println(objProd1); // Producto [ codigo: 001 nombre: Arroz precio: 3.5 stock: 80 ]
        objProd1.vender(200); // la cantidad no puede ser mayor al stock disponible
    
    }
}
