public class Operario extends Trabajador{
 //atributos    
 private double horas;
 //constructor  
 public Operario(int cedula, String nombre, double salario, double horas){
    super(cedula, nombre,salario);
    this.horas = horas;
 }
 public double pagar(){
   return getSalario() * horas;
 }
}
