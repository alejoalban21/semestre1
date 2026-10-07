package Semana6;

public class Producto {

   private String codigo;
   private String nombre;
   private double precio;
   private int stock;

   // CONSTRUCTOR
   public Producto(String codigo, String nombre, double precio, int stock) {
      this.codigo = codigo;
      this.nombre = nombre;
      this.precio = precio;
      this.stock = stock;
   }

   // get and set

   public String getcodigo() {
      return codigo;
   }

   public void setcodigo(String codigo) {
      this.codigo = codigo;
   }

   public String getnombre() {
      return nombre;
   }

   public void setnombre(String nombre) {
      this.nombre = nombre;
   }

   public double getprecio() {
      return precio;
   }

   public void setprecio(double precio) {
      this.precio = precio;
   }

   public int getstock() {
      return stock;
   }

   public void setstock(int stock) {
      this.stock = stock;
   }

   // crear vender
   public void vender(int cantidad) {
      if (cantidad <= stock) {
         stock = stock - cantidad;
      } else {
         System.out.println("la cantidad no puede ser mayor al stock disponible");
      }
   }

   // crear reabastecer

   public void reabastecer(int cantidad) {
      stock += cantidad;
   }

   // crear calcular valor inventario

   public double calcularValorInventario() {
      return precio * stock;
   }

   // ToString
   public String toString() {
      return "Producto[ codigo: " + codigo + " nombre: " + nombre + " precio: " + precio + " stock: " + stock + "]";
   }

}

