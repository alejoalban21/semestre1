public class Main {
    public static void main(String[] args) {
        
    
    Producto laptop1 = new Producto();
    System.out.println("se creo el primer producto");

    laptop1.nombre = "Asus";
    laptop1.precio = 580;
    laptop1.codigo = "12345";
    laptop1.cantidad = 10;
    System.out.println("El total es: " + laptop1.calcularTotal());
    System.out.println("tiene stock: " + laptop1.tieneStock());
    laptop1.aplicarDescuento(10);
    System.out.println("precio final: " + laptop1.precio);

    Producto televisor1 = new Producto();
    System.out.println("Se creo el segundo producto");

    televisor1.nombre = "Samsung";
    televisor1.codigo = "54321";
    televisor1.precio = 780;
    televisor1.cantidad = 10;
    System.out.println("El total es: " + televisor1.calcularTotal());
    System.out.println("tiene stock: " + televisor1.tieneStock());
    televisor1.aplicarDescuento(20);
    System.out.println("precio final: " + televisor1.precio);


    Producto celular1 = new  Producto ();
    System.out.println("Se creo el tercer producto");

    celular1.nombre = "Iphone 18";
    celular1.codigo = "63262";
    celular1.precio = 990;
    celular1.cantidad = 10;
    System.out.println("El total es: " + celular1.calcularTotal());
    System.out.println("tiene stock: "+ celular1.tieneStock()); 
    celular1.aplicarDescuento(30);
    System.out.println("El precio final es;" + celular1.precio);
    




 }

 
}
