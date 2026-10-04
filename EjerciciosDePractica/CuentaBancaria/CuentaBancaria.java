public class CuentaBancaria {
    //Atributos
    private int id;
    private String titular;
    private String numeroCuenta;
    private double saldo;

    //Constructor de la clase --> Recuerde que tiene el mismo nombre de la clase
    public CuentaBancaria(int id, String titular, String numeroCuenta, double saldo){
        this.id = id;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //Método consignar
    public void consignar(double valor){
       saldo = saldo + valor;
    }

    //Método retirar
    public void retirar(double valor){
       
      if ( valor>saldo){
        System.out.println("saldo insuficiente");

    } else {
        saldo = saldo- valor;
    }
}

public double consultarSaldo(){
    return saldo;
}

    public String toString(){
        return "CuentaBancaria [ id: " + id + " titular: " + titular + " numero Cuenta: " + numeroCuenta + " saldo: " + saldo + "]";
    }

}