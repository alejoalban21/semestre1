public class Trabajador {
    //ATRIBUTOS
    private int cedula;
    private String nombre;
    private double salario;

    //constructor   
    public Trabajador(int cedula, String nombre, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
    }
//metodo pagar 
public double pagar(){
    return salario * 1.10;

}


    //metodos get y set 
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }   
  
    }


