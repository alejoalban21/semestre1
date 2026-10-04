public class Estudiantes {
    String nombre;
    int edad;
    String documento;
    String programa;

    //estudiar (c)

    public void estudiar (){
        System.out.println(nombre + " esta estudiando");
}
        
// MostrarDatos
    public void mostrarDatos (){
        System.out.println("Datos [nombre: " + nombre + " edad: " + edad + " documento: " + documento + " programa: " + programa +"]");
   }

//Saludar   
    public void saludar (String mensaje){
        System.out.println( nombre + " mensaje: " + mensaje);
    }
    

}
