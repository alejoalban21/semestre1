package semana4;
public class EjecutarCuentaBancaria {
    
  public static void main(String[] args){

        CuentaBancaria objCuenta1 = new CuentaBancaria(279836, "Jhon", "100-34566 54", 0.0);

        //Mostrar el objeto en su estado inicial
        System.out.println(objCuenta1);
        //Consignando 1000.0 a la cuenta 
        System.out.println("Total de la cuenta: " + objCuenta1.consignar(1000.0));
        //Mostrar el objeto después de la consignación
        System.out.println(objCuenta1);
  }
  
}