package semana7;

public class Banco {
    private String nombre;
    private String direccion;
    private Cuenta cuenta;

    public Banco(String nombre, String direccion, Cuenta cuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuenta = cuenta;
    }
    public void abrirCuenta(Cliente cliente){
        System.out.println("Apertura de cuenta: " + cliente);
    }
}
