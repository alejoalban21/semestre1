package semana7;

public class Cliente {
    private int identificacion;
    private String nombre;

    public Cliente (int identificacion, String nombre){
        this.identificacion=identificacion;
        this.nombre=nombre;
    }

    @Override
    public String toString() {
        return "Cliente [identificacion=" + identificacion + ", nombre=" + nombre + "]";
    }

    
    
}
