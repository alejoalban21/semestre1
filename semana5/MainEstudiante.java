public class MainEstudiante {
    public static void main(String[] args) {

        // crear el objeto de la clase estudiante
        Estudiante objEst1 = new Estudiante("juan", "1105364678", 21, "Ingenieria de Sistemas");
        Estudiante objEst2 = new Estudiante("Maria", "1105364675", 22, "Ingenieria de Sistemas");
        Estudiante objEst3 = new Estudiante("Miguel", "1105364678", 23, "Ingenieria de Sistemas");

        // mostrar la informacion del objeto

        System.out.println(objEst1);
        System.out.println(objEst2);
        System.out.println(objEst3);

        // Uso de los métodos get y set
        System.out.println(objEst1.getEdad()); // 20
        System.out.println(objEst3.getEdad()); // 18

        // Cambiar el nombre del objeto "objEst2"
        objEst2.setNombre("María Isabel");

        // Cambiar el programa del objeto "objEst2"
        objEst2.setPrograma("Ingeniería de Sistemas");

        // Mostrar el objeto completo
        System.out.println(objEst2); // Estudiante [ nombre: María Isabel documento: 89698563 edad: 22 programa:
                                     // Ingeniería de Sistemas ]

        // validar con el método setEdad que la edad sea mayor o igual a cero
        objEst1.setEdad(30);
        System.out.println(objEst1);
        objEst1.setEdad(-30); // La edad tiene que ser mayor o igual a cero

        // validar con el método setNombre para que no se vaya con el nombre vacio

        objEst2.setNombre(""); // nombre vacio
        objEst2.setNombre("Amparo");
        System.out.println(objEst2);

    }
}