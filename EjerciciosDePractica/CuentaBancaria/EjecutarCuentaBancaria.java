 public class EjecutarCuentaBancaria {
    
  public static void main(String[] args){

        CuentaBancaria Cuenta1 = new CuentaBancaria(279836, "Jhon", "100-34566 54", 0.0);

        //Mostrar el objeto en su estado inicial
        System.out.println(Cuenta1);
        //Consignando 1000.0 a la cuenta 
        System.out.println("Total de la cuenta: " + Cuenta1.consignar(1000.0));
        //Mostrar el objeto después de la consignación
        System.out.println(Cuenta1);
  }
  
}