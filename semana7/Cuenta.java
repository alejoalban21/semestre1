package semana7;

public class Cuenta {
    private String numeroCuenta;
    private String titular;
    private double saldo;

   

    public Cuenta(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

   public void consignar (double valor) {
    saldo+=valor;
    System.out.println("se consigno: " + valor);
    if (saldo<0){
        System.out.println("saldo insuficiente");
    }

   } 
    
}
