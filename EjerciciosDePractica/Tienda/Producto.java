public class Producto {
    
    String nombre;
    String codigo;
    double precio;
    int cantidad;

public double calcularTotal (){
    return precio*cantidad;
}
public boolean tieneStock(){
  if (cantidad > 0){
    return true;
} else {
    return false;
}
   }  
   public void aplicarDescuento(double porcentaje){
     precio = precio - (precio * porcentaje / 100);

     if (precio < 0){
        precio = 0;
     }
     
   }
}
