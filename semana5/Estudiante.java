public class Estudiante {
    // atributos de clase
    private String nombre;
    private String documento;
    private int edad;
    private String programa;

    // constructor de la clase

    public Estudiante(String nombre, String documento, int edad, String programa) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.programa = programa;
    }

    // Los metodos getter and setter

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        if (nombre.equals(""))
            System.out.println("nombre vacio...");
        else
            this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;

    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;

    }

    public void setEdad(int edad) {
        if (edad >= 0)
            this.edad = edad;
        else
            System.out.println("la edad debe ser mayor a 0");
    }

    public String getPrograma() {
        return programa;

    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    // Metodos toString(sirve para mostrar la informacion del objeto)

    public String toString() {
        return "estudiante [nombre: " + nombre + " documento: " + documento + " edad: " + edad + " programa: "
                + programa + "]";
    }

}
