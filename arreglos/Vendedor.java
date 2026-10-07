public class Vendedor extends Trabajador {
  // atributos
  private double comision;

  // constructor
 public Vendedor(int cedula, String nombre, double salario, double comision){
    super(cedula, nombre,salario);
    this.comision = comision;
 }

  public double pagar() {
    return getSalario() + comision;
  }
}
