package semana7;

public class MainBanco {
    public static void main(String[] args) throws Exception {
        // creacion de objetos Cuenta
        Cuenta cuenta = new Cuenta("5869874-2", "Juan", 0);

        // creacion de objeto Cliente
        Cliente cliente = new Cliente(10125874, "Camilo");

        // creacion de objeto Banco
        Banco banco = new Banco("AVVILLAS", "Oficina centenario", cuenta);

        // mostrar informacion del banco
        System.out.println(banco);

        // abrir cuenta para el cliente
        banco.abrirCuenta(cliente); 

    }
}
