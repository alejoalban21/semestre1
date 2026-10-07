public class MainInv {
    public static void main(String[] args) throws Exception {
      //creacion arreglo de objetos
      Trabajador[] t = new Trabajador [3];
      //creacion del objeto Operario o Vendedor y asignado a la posicion del arreglo
      t[0] = new Operario(123456, "Juan", 1000, 120);   
      t[1] = new Vendedor(234567, "Pedro", 2000, 21.1);   
      t[2] = new Operario(345678, "Maria", 1500, 60);   
for (int i = 0; i < t.length; i++){
   System.out.println("salario a pagar de " + t[i].getNombre() + " es: " + t[i].pagar());
}




    }
   }
