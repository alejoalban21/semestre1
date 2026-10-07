public class mainEstudiamtes {
  public static void main(String[] args) {

    // crear estudiate 1 con caracteristicas definidas y luego mostrarlo en pantalla

    Estudiantes estudiante1 = new Estudiantes();
    System.out.println("Se creo el primer estudiante");

    estudiante1.nombre = "Camilo Sanchez";
    estudiante1.edad = 21;
    estudiante1.documento = "1105364662";
    estudiante1.programa = "Ingenieria Industrial";

    System.out.println("El nombre del estudiante 1 es: " + estudiante1.nombre);
    System.out.println("La edad del estudiante 1 es: " + estudiante1.edad);
    System.out.println("El documento del estudiante 1 es: " + estudiante1.documento);
    System.out.println("El programa del estudiante 1 es: " + estudiante1.programa);

    estudiante1.estudiar();
    estudiante1.mostrarDatos();
    estudiante1.saludar(" Hola, Mucho gusto!");
    // crear estudiate 2 con caracteristicas definidas y luego mostrarlo en pantalla

    Estudiantes estudiante2 = new Estudiantes();
    System.out.println("Se creo el segundo estudiante");

    estudiante2.nombre = "sofia Guzman";
    estudiante2.edad = 33;
    estudiante2.documento = "220363646";
    estudiante2.programa = "Derecho";

    System.out.println("El nombre del estudiante 2 es: " + estudiante2.nombre);
    System.out.println("La edad del estduiante 2 es: " + estudiante2.edad);
    System.out.println("El documento del estudiante 2 es: " + estudiante2.documento);
    System.out.println(" El programa del estudiante 2 es: " + estudiante2.programa);

    // crear estudiate 3 con caracteristicas definidas y luego mostrarlo en pantalla

    Estudiantes estudiante3 = new Estudiantes();
    System.out.println("Se creo el tercer estudiante");

    estudiante3.nombre = "Santiago Ruiz";
    estudiante3.edad = 23;
    estudiante3.documento = "232323234";
    estudiante3.programa = "Ingenieria en sistemas";

    System.out.println("El nombre del tercer estudiante es: " + estudiante3.nombre);
    System.out.println("La edad del tercer estudiante es: " + estudiante3.edad);
    System.out.println(" El documento del tercer estudiante es: " + estudiante3.documento);
    System.out.println("El programa del tercer estudiante es " + estudiante3.programa);
  }

}